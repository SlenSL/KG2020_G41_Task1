package com.SlenS;

import java.awt.*;

public class TieFighter implements Drawable {
    int x;
    int y;
    double width;

    @Override
    public void draw(Graphics2D g) {

        /**************************** Темные детали корпуса *****************************/


        /*************************** Светлые детали корпуса ***************************/

        /************************** Контур корпуса **************************/
        g.setColor(new Color(166, 243, 247));//светло-голубой цвет
        g.drawRect(x,y,(int)width/10,(int) width);//левое крыло
        g.drawRect((int) width,y,(int) width/10,(int) width);//правое крыло
        g.drawRoundRect((int)( x + width/2 - width/3),(int) (y - 2*width/3),(int) width/3 ,(int) width/3, (int) width/3,(int) width/3);
        g.drawPolygon(new int[]{x, x, x + 150, x + 300, x + 300, x + 150}, new int[]{y + 90, y + 80, y + 50, y + 80, y + 90, y + 120}, 6);//главный корпус


    }

    public TieFighter(int x, int y, int width) {
//        int x1 = (int) ( Math.random() * x );
//        if ( x1 )
        this.x = x;
        this.y = y;
        this.width = width;
    }
}
