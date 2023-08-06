import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

public class GUI9 {
    static JFrame frame = new JFrame();
    static JLabel l;

    public static void main(String[] args) throws IOException {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Более хитрое перемещение");
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setBounds(dim.width / 2 - 1000 / 2, dim.height / 2 - 1000 / 2, 1000, 1000);
        BufferedImage im = ImageIO.read(new File("src/Son.png"));
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panel.setFocusable(true);
        l = new JLabel(new ImageIcon(im), JLabel.RIGHT);
        panel.add(l, BorderLayout.NORTH);
        frame.add(panel);
        panel.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                l.setLocation(e.getX(), e.getY());
            }
        });
        frame.setVisible(true);//делаем форму видимой
    }
}