package com.SlenS;

import java.awt.*;

public class Backgound implements Drawable {
    int width;
    int height;
    int starsCount;

    public Backgound(int width, int height, int starsCount) {
        this.height = height;
        this.width = width;
        this.starsCount = starsCount;
    }

    @Override
    public void draw(Graphics2D g) {
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, 800, 600);

        Star[] stars = new Star[starsCount];

        for (int i = 0; i < stars.length; i++) {
            stars[i] = new Star(width, height);
        }

        for (int i = 0; i < stars.length; i++) {
            stars[i].draw((Graphics2D) g);
        }

    }
}
