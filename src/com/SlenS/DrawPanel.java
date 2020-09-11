package com.SlenS;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {



    @Override
    public void paint(Graphics g) {
        super.paint(g);

        Backgound backgound = new Backgound(800,600, 400);
        backgound.draw((Graphics2D) g);

        ImperialDestroyer imperialDestroyer = new ImperialDestroyer(220,180);
        imperialDestroyer.draw((Graphics2D) g);

        TieFighter tie1 = new TieFighter(10,50,50);
        TieFighter tie2 = new TieFighter(700,300,100);
        TieFighter tie3 = new TieFighter(450,500,70);
        TieFighter tie4 = new TieFighter(300,20,30);
        TieFighter tie5 = new TieFighter(30, 400, 100);
        tie1.draw((Graphics2D) g);
        tie2.draw((Graphics2D) g);
        tie3.draw((Graphics2D) g);
        tie4.draw((Graphics2D) g);
        tie5.draw((Graphics2D) g);


    }

    @Override
    public void update(Graphics g) {
        super.update(g);

    }

}
