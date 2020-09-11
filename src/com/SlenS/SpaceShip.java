package com.SlenS;

import java.awt.*;

public class SpaceShip implements Drawable {

    @Override
    public void draw(Graphics2D g) {
        g.setColor(Color.GREEN);
        g.drawPolygon(new int[]{100, 100, 250, 400, 400, 250}, new int[]{ 210, 200, 170, 200, 210, 240}, 6);
        //g.fillPolygon(new int[] {10, 20, 30}, new int[] {100, 20, 100}, 3);
        //g.drawArc(250,205, 50,50,0, 360);
        g.drawArc(225,180, 50,50,0, 360);
        g.drawPolygon(new int[]{150, 150, 250, 350, 350, 250}, new int[]{ 210, 200, 170, 200, 210, 240}, 6);
    }

}
