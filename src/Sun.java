import javax.swing.*;
import java.awt.*;

public class Sun extends JPanel {

    int x;
    int y;
    int rayCount;
    int r;
    int R;
    Color sunColor;



    public Sun(int x, int y, int rayCount, int r, int r1, Color c) {
        this.x = x;
        this.y = y;
        this.rayCount = rayCount;
        this.r = r;
        R = r1;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        drawSun(g,200,300,250,300, 6, Color.BLACK);
    }

    private void drawSun(Graphics g, int x0, int y0, int r, int R, int n, Color c) {
        g.setColor(c);
        g.fillOval(x0 - r, y0 - r, 2 * r, 2 * r);
        double da = 2 * Math.PI / n;

        for (int i = 0; i < n; i++) {

            int dx1, dx2, dy1, dy2;
            dx1 = (int) (x0 - r * Math.cos(da * i));
            dx2 = (int) (x0 - R * Math.cos(da * i));
            dy1 = (int) (y0 - r * Math.sin(da * i));
            dy2 = (int) (y0 - R * Math.sin(da * i));

            g.drawLine(dx1, dy1, dx2, dy2);

            //g.drawLine(x0-r, y0-r,);
        }
    }
}
