import java.awt.*;
import javax.swing.*;
public class ConnectFour
{
    public static void main(String[] args) {
    	MyCanvas canvas = new MyCanvas();
        JFrame frame = new JFrame();
        frame.setSize(1024, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(canvas);
        frame.setVisible(true);
    }
}