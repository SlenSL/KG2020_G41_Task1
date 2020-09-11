package com.SlenS;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {



    @Override
    public void paint(Graphics g) {
        super.paint(g);

        Backgound backgound = new Backgound(800,600, 200);
        backgound.draw((Graphics2D) g);
        SpaceShip spaceShip = new SpaceShip(220,180);
        spaceShip.draw((Graphics2D) g);

    }

    @Override
    public void update(Graphics g) {
        super.update(g);

    }

}
