package com.SlenS;

import java.awt.*;

public class Backgound implements Drawable {
    int width;
    int height;
    int starsCount;
    int shipsCount;

    public Backgound(int width, int height, int starsCount, int shipsCount) {
        this.height = height;
        this.width = width;
        this.starsCount = starsCount;
        this.shipsCount = shipsCount;
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

        TieFighter[] ships = new TieFighter[shipsCount];

        for (int i = 0; i < shipsCount; i++) {
            ships[i] = new TieFighter(width, height, (int) Math.random() * 50 + 50);
        }

        for (int i = 0; i < shipsCount; i++) {
            ships[i].draw((Graphics2D) g);
        }

    }
}
