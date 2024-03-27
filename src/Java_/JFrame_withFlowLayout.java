package Java_;
import javax.swing.*;
import java.awt.Color;
import java.awt.FlowLayout;
public class JFrame_withFlowLayout extends JFrame {
    public JFrame_withFlowLayout() {
        setSize(300, 200);
        setTitle("JFrame with FlowLayout");
        setLayout(new FlowLayout());
        getContentPane().setBackground(Color.cyan);
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        this.add(button1);
        this.add(button2);
        setVisible(true);
    }
    public static void main(String[] agrs) {
        JFrame_withFlowLayout f = new JFrame_withFlowLayout();
    }
}
