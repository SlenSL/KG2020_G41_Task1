package com.SlenS;

import java.awt.*;

class Star implements Drawable {
    int x;
    int y;



    public Star(int x, int y) {
        this.x = (int) ( Math.random() * x );
        this.y = (int) ( Math.random() * y );
    }

    @Override
    public void draw(Graphics2D g) {
        g.setColor(Color.WHITE);
        g.fillOval(x , y, (int) Math.random()*2+3, (int) Math.random()*2+3);
    }


}
