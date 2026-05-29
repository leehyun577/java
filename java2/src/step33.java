import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class step33 extends JFrame{
    private JLabel la = new JLabel("Hello");

    public step33() {
        setTitle("Mouse 이벤트 리스너 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.addMouseListener(new  EX92MyMouseListener());

        c.setLayout(null);
        la.setSize(50, 20);
        la.setLocation(30,30);
        c.add(la);

        setSize(250, 150);
        setVisible(true);
    }

    class EX92MyMouseListener extends MouseAdapter {
        public void mousePressed(MouseEvent e) {
            int x = e.getX();
            int y = e.getY();
            la.setLocation(x, y);
        }
    }

    public static void main(String[] args) {
        new step33();
    }
}
