package com.SlenS;

import java.awt.*;

public class Star implements Drawable {
    int x;
    int y;
    int z;



    public Star() {
        this.x = (int) ( Math.random() * 800 );
        this.y = (int) ( Math.random() * 600 );
        this.z = (int) ( Math.random() * 600 );
    }

    @Override
    public void draw(Graphics2D g) {
        g.setColor(Color.WHITE);
        g.fillOval(x , y, 4, 4);
    }


}
