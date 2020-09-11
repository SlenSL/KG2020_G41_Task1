package com.SlenS;

import java.awt.*;

public class SpaceShip implements Drawable {

    @Override
    public void draw(Graphics2D g) {

        g.setColor(new Color(166, 243, 247));//светло-голубой цвет
        g.drawArc(235,120, 30, 22, 0,180);//купол
        g.fillOval(235,120, 30, 22);


        g.setColor(new Color(64, 64, 64));//темно-серый цвет
        g.drawPolygon(new int[]{100, 100, 250, 400, 400, 250}, new int[]{ 210, 200, 170, 200, 210, 240}, 6);//главный корпус
        g.fillPolygon(new int[]{100, 100, 250, 400, 400, 250}, new int[]{ 210, 200, 170, 200, 210, 240}, 6);
        g.drawPolygon(new int[]{245, 247, 253, 255, 250}, new int[]{ 163, 150, 150, 163, 165}, 5);//башня
        g.fillPolygon(new int[]{245, 247, 253, 255, 250}, new int[]{ 163, 150, 150, 163, 165}, 5);
        g.drawRect(200, 138,20, 4);//пушка слева
        g.fillRect(200, 138,20, 4);
        g.drawRect(280, 138,20, 4);//пушка справа
        g.fillRect(280, 138,20, 4);


        g.setColor(new Color(94, 94, 94));//светло-серый цвет
        g.drawPolygon(new int[]{150, 150, 250, 350, 350, 250}, new int[]{ 210, 200, 170, 200, 210, 240}, 6);//деталь внутри
        g.fillPolygon(new int[]{150, 150, 250, 350, 350, 250}, new int[]{ 210, 200, 170, 200, 210, 240}, 6);
        g.drawPolygon(new int[]{175, 175, 250, 325, 325, 250}, new int[]{ 185, 180, 165, 180, 185, 170}, 6);//крышка
        g.fillPolygon(new int[]{175, 175, 250, 325, 325, 250}, new int[]{ 185, 180, 165, 180, 185, 170}, 6);
        g.drawPolygon(new int[]{220, 220, 250, 280, 280, 250}, new int[]{ 145, 135, 130, 135, 145, 150},6);//рубка
        g.fillPolygon(new int[]{220, 220, 250, 280, 280, 250}, new int[]{ 145, 135, 130, 135, 145, 150},6);


        g.setColor(new Color(255, 248, 145));//лимонный цвет
        g.drawArc(225,180, 50,50,0, 360);//центральное сопло
        g.fillOval(225,180, 50,50);
        g.drawArc(145,190, 30,30,0, 360);//левое сопло
        g.fillOval(145,190, 30,30);
        g.drawArc(325,190, 30,30,0, 360);//правое сопло
        g.fillOval(325,190, 30,30);

        g.drawArc(290,188, 15,15,0, 360);//правое маленькое сопло верхнее
        g.fillOval(290,188, 15,15);
        g.drawArc(290,207, 15,15,0, 360);//правое маленькое сопло нижнее
        g.fillOval(195,188, 15,15);
        g.drawArc(195,188, 15,15,0, 360);//левое маленькое сопло верхнее
        g.fillOval();
        g.drawArc(195,207, 15,15,0, 360);//левое маленькое сопло нижнее









    }

}
