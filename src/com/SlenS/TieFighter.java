package com.SlenS;

import java.awt.*;

public class TieFighter implements Drawable {
    int x;
    int y;
    double width;

    @Override
    public void draw(Graphics2D g) {

        /*************************** Нижний слой ***************************/
        g.setColor(new Color(64, 58, 42));//темный цвет

        g.fillRect((int) (x + width / 10),
                (int) (y + width / 3 + (width / 3 - width / 8) / 2), (int) (9 * width / 10), (int) width / 8);//ось корпуса


        g.setColor(new Color(201, 201, 193));//контур

        g.drawOval((int) (x + width / 20 + width / 2 - width / 3),
                (int) (y + width / 3 + (width / 3 - width / 4) / 2), (int) (2 * width / 3), (int) width / 4);//расширение кабины
        g.drawRect((int) (x + width / 10),
                (int) (y + width / 3 + (width / 3 - width / 8) / 2), (int) (9 * width / 10), (int) width / 8);//ось корпуса
        /*************************** Светлые детали корпуса ***************************/

        g.setColor(new Color(110, 100, 70));//светлый цвет

        g.fillPolygon(new int[]{x, (int) (x + width / 20), (int) (x + width / 10), (int) (x + width / 20)},
                new int[]{(int) (y + width / 2), y, (int) (y + width / 2), (int) (y + width)}, 4);//левое крыло

        g.fillPolygon(new int[]{x + (int) width, (int) (x + 21 * width / 20), (int) (x + 11 * width / 10), (int) (x + 21 * width / 20)},
                new int[]{(int) (y + width / 2), y, (int) (y + width / 2), (int) (y + width)}, 4);//правое крыло

        g.fillOval((int) (x + width / 20 + width / 2 - width / 3),
                (int) (y + width / 3 + (width / 3 - width / 4) / 2), (int) (2 * width / 3), (int) width / 4);//расширение кабины


        /**************************** Темные детали корпуса *****************************/

        g.setColor(new Color(64, 58, 42));//темный цвет


        g.fillRoundRect((int) (x + width / 20 + width / 2 - width / 6), (int) (y + width / 3),
                (int) width / 3, (int) width / 3, (int) width / 4, (int) width / 2);//кабина

        /************************** Иллюминатор **************************/

        g.setColor(new Color(153, 204, 207));//светло-голубой цвет

        g.fillRoundRect((int) (x + width / 20 + width / 2 - width / 8), (int) (y + width / 3 + (width / 3 - width / 4) / 2),
                (int) width / 4, (int) width / 4, (int) width / 5, (int) width / 3);//иллюминатор

        /************************** Контур корпуса **************************/

        g.setColor(new Color(201, 201, 193));//контур

        g.drawPolygon(new int[]{x, (int) (x + width / 20), (int) (x + width / 10), (int) (x + width / 20)},
                new int[]{(int) (y + width / 2), y, (int) (y + width / 2), (int) (y + width)}, 4);//левое крыло

        g.drawPolygon(new int[]{x + (int) width, (int) (x + 21 * width / 20), (int) (x + 11 * width / 10), (int) (x + 21 * width / 20)},
                new int[]{(int) (y + width / 2), y, (int) (y + width / 2), (int) (y + width)}, 4);//правое крыло

        g.drawRoundRect((int) (x + width / 20 + width / 2 - width / 6), (int) (y + width / 3),
                (int) width / 3, (int) width / 3, (int) width / 4, (int) width / 2);//кабина



        g.drawRoundRect((int) (x + width / 20 + width / 2 - width / 8), (int) (y + width / 3 + (width / 3 - width / 4) / 2),
                (int) width / 4, (int) width / 4, (int) width / 5, (int) width / 3);//иллюминатор
    }

    public TieFighter(int x, int y, int width) {
//        int x1 = (int) ( Math.random() * x );
//        if ( x1 )
        this.x = x;
        this.y = y;
        this.width = width;
    }
}
