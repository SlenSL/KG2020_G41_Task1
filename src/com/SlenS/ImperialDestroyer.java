package com.SlenS;

import java.awt.*;

public class ImperialDestroyer implements Drawable {
    int x;
    int y;

    public ImperialDestroyer(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public void draw(Graphics2D g) {
        /**************************** Темные детали корпуса *****************************/


        /*************************** Светлые детали корпуса ***************************/

        /************************** Контур корпуса **************************/
        double width = 200;
        g.setColor(new Color(166, 243, 247));//светло-голубой цвет
        g.drawRect(x, y, (int) width / 10, (int) width);//левое крыло
        g.drawPolygon(new int[]{x, (int) (x + width / 20), (int) (x + width / 10), (int) (x + width / 20)}, new int[]{(int) (y + width / 2), y, (int) (y + width / 2), (int) (y + width)}, 4);//левое крыло
        g.drawPolygon(new int[]{x + (int) width, (int) (x + 21 * width / 20), (int) (x + 11 * width / 10), (int) (x + 21 * width / 20)}, new int[]{(int) (y + width / 2), y, (int) (y + width / 2), (int) (y + width)}, 4);//правое крыло
        g.drawRect(x + (int) width, y, (int) width / 10, (int) width);//правое крыло
        g.drawRoundRect((int) (x + width / 20 + width / 2 - width / 6), (int) (y + width / 3), (int) width / 3, (int) width / 3, (int) width / 4, (int) width / 2);//кабина
        g.drawOval((int) (x + width / 20 + width / 2 - width / 3), (int) (y + width / 3 + (width / 3 - width / 4) / 2), (int) (2 * width / 3), (int) width / 4);//расширение кабины
        g.drawRoundRect((int) (x + width / 20 + width / 2 - width / 8), (int) (y + width / 3 + (width / 3 - width / 4) / 2), (int) width / 4, (int) width / 4, (int) width / 5, (int) width / 3);//иллюминатор
        g.drawRect((int) (x + width / 10), (int) (y + width / 3 + (width / 3 - width / 8) / 2), (int) (9 * width / 10), (int) width / 8);//ось корпуса


//        /**************************** Купол *****************************/
//
//        g.setColor(new Color(166, 243, 247));//светло-голубой цвет
//        g.fillOval(x + 135, y, 30, 22);//купол
//
//
//        g.setColor(new Color(69, 149, 153));//темно-голубой цвет
//        g.drawArc(x + 135, y, 30, 22, 0, 180);//купол
//
//        /**************************** Темные детали корпуса *****************************/
//
//        g.setColor(new Color(64, 64, 64));//темно-серый цвет
//        g.fillPolygon(new int[]{x, x, x + 150, x + 300, x + 300, x + 150}, new int[]{y + 90, y + 80, y + 50, y + 80, y + 90, y + 120}, 6);//главный корпус
//        g.fillPolygon(new int[]{x + 145, x + 147, x + 153, x + 155, x + 150}, new int[]{y + 43, y + 30, y + 30, y + 43, y + 45}, 5);//башня
//        g.fillRect(x + 100, y + 18, 20, 4);//пушка слева
//        g.fillRect(x + 180, y + 18, 20, 4);//пушка справа
//
//        /*************************** Светлые детали корпуса ***************************/
//
//        g.setColor(new Color(94, 94, 94));//серый цвет
//        g.fillPolygon(new int[]{x + 50, x + 50, x + 150, x + 250, x + 250, x + 150}, new int[]{y + 90, y + 80, y + 50, y + 80, y + 90, y + 120}, 6);//деталь внутри
//        g.fillPolygon(new int[]{x + 75, x + 75, x + 150, x + 225, x + 225, x + 150}, new int[]{y + 65, y + 60, y + 45, y + 60, y + 65, y + 50}, 6);//крышка
//        g.fillPolygon(new int[]{x + 120, x + 120, x + 150, x + 180, x + 180, x + 150}, new int[]{y + 25, y + 15, y + 10, y + 15, y + 25, y + 30}, 6);//рубка
//
//        /************************** Контур корпуса **************************/
//
//        g.setColor(new Color(189, 189, 189));//темно-серый цвет
//        g.drawPolygon(new int[]{x, x, x + 150, x + 300, x + 300, x + 150}, new int[]{y + 90, y + 80, y + 50, y + 80, y + 90, y + 120}, 6);//главный корпус
//        g.drawPolygon(new int[]{x + 145, x + 147, x + 153, x + 155, x + 150}, new int[]{y + 43, y + 30, y + 30, y + 43, y + 45}, 5);//башня
//        g.drawRect(x + 100, y + 18, 20, 4);//пушка слева
//        g.drawRect(x + 180, y + 18, 20, 4);//пушка справа
//        g.drawPolygon(new int[]{x + 50, x + 50, x + 150, x + 250, x + 250, x + 150}, new int[]{y + 90, y + 80, y + 50, y + 80, y + 90, y + 120}, 6);//деталь внутри
//        g.drawPolygon(new int[]{x + 75, x + 75, x + 150, x + 225, x + 225, x + 150}, new int[]{y + 65, y + 60, y + 45, y + 60, y + 65, y + 50}, 6);//крышка
//        g.drawPolygon(new int[]{x + 120, x + 120, x + 150, x + 180, x + 180, x + 150}, new int[]{y + 25, y + 15, y + 10, y + 15, y + 25, y + 30}, 6);//рубка
//
//        /************************** Сопла заливка+контур **************************/
//
//        g.setColor(new Color(255, 248, 145));//лимонный цвет
//        g.fillOval(x + 125, y + 60, 50, 50);//центральное сопло
//        g.fillOval(x + 45, y + 70, 30, 30);//левое сопло
//        g.fillOval(x + 225, y + 70, 30, 30);//правое сопло
//        g.fillOval(x + 190, y + 68, 15, 15);//правое маленькое сопло верхнее
//        g.fillOval(x + 190, y + 87, 15, 15);//правое маленькое сопло нижнее
//        g.fillOval(x + 95, y + 68, 15, 15);//левое маленькое сопло верхнее
//        g.fillOval(x + 95, y + 87, 15, 15);//левое маленькое сопло нижнее
//
//        g.setColor(new Color(166, 157, 41));//темно-желтый цвет
//        g.drawArc(x + 125, y + 60, 50, 50, 0, 360);//центральное сопло
//        g.drawArc(x + 45, y + 70, 30, 30, 0, 360);//левое сопло
//        g.drawArc(x + 225, y + 70, 30, 30, 0, 360);//правое сопло
//        g.drawArc(x + 190, y + 68, 15, 15, 0, 360);//правое маленькое сопло верхнее
//        g.drawArc(x + 190, y + 87, 15, 15, 0, 360);//правое маленькое сопло нижнее
//        g.drawArc(x + 95, y + 68, 15, 15, 0, 360);//левое маленькое сопло верхнее
//        g.drawArc(x + 95, y + 87, 15, 15, 0, 360);//левое маленькое сопло нижнее

    }

}
