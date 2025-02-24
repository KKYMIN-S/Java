package Java_;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;
public class Draw_Star extends JFrame {
    public static void main(String[] args) {
        int cx = 125;
        int cy = 125;
        int radius = 100;
        int JF_width = 300, JF_height = 300;
        int loc_x = 300, loc_y = 300;
        Color star_color = Color.red;
        JFrame jf = new JFrame("JFrame_DrawStar");
        JPanel_DrawStar jp_star = new JPanel_DrawStar(cx, cy,
                radius, star_color);
        Border border_jpStar =
                BorderFactory.createTitledBorder("JPanel_DrawStar");
        jp_star.setBorder(border_jpStar);
        jf.add(jp_star);
        jf.setSize(JF_width, JF_height);
        jf.setLocation(loc_x, loc_y);
        jf.setVisible(true);
    }
}
class JPanel_DrawStar extends JPanel {
    int cx, cy;
    int star_radius;
    Color star_color;
    JPanel_DrawStar(int cx, int cy, int radius, Color color) {
        this.cx = cx;
        this.cy = cy;
        this.star_radius = radius;
        this.star_color = color;
    }
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        double radius = 100;
        double x, y;
        int pos_x, pos_y;
        double theta_rad = 0;
        int theta_deg;
        final double PI = 3.141592;
        g2.setColor(Color.BLACK);
        g2.setStroke(new BasicStroke(2));
        g2.drawLine((int)(cx-radius), (int)cy, (int)(cx + radius), (int)(cy));
        g2.drawLine((int)(cx), (int)(cy+radius), (int)(cx), (int)(cy-radius));
        for (int deg=0; deg<360; deg+=90) {
            theta_rad = deg * PI / 180.0;
            pos_x = (int)(cx + radius * Math.cos(theta_rad));
            pos_y = (int)(cy + radius * Math.sin(theta_rad));
            String deg_str = String.format("%s", deg);
            g2.drawString(deg_str, pos_x, pos_y);
        }
        int px[] = new int[5];
        int py[] = new int[5];
        for (int i=0; i<5; i++) {
            theta_rad = - PI / 2.0 + i * (2.0 * PI) / 5.0;
            px[i] = (int)(cx + radius * Math.cos(theta_rad));
            py[i] = (int)(cy + radius * Math.sin(theta_rad));
        }
        g2.setStroke(new BasicStroke(5));
        g2.setColor(Color.RED);
        g2.drawLine(px[0], py[0], px[2], py[2]);
        g2.drawLine(px[2], py[2], px[4], py[4]);
        g2.drawLine(px[4], py[4], px[1], py[1]);
        g2.drawLine(px[1], py[1], px[3], py[3]);
        g2.drawLine(px[3], py[3], px[0], py[0]);
    }
}