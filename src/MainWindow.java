import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {

    public MainWindow() {
        DrawPanel dPanel = new DrawPanel();
        setContentPane(dPanel);
        Sun sun = new Sun(200,300,250,300, 6, Color.BLACK);

    }
}
