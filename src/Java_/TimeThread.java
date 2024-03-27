package Java_;
import java.awt.*;
import javax.swing.*;
public class TimeThread extends Thread{
    JLabel timerLabel;

    public TimeThread(JLabel timerLabel) {
        this.timerLabel = timerLabel;
    }
    public void run() {
        int n = 0;
        while (true) {
            timerLabel.setText(Integer.toString(n));
            n++;
            try {
                Thread.sleep(1000);
            }
            catch(InterruptedException e) {
                return;
            }
        }
    }
}
