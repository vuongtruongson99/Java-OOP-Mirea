package ru.mirea.lab22;

import java.awt.*;

public class Rectangle extends Shape {
    @Override
    public void paint(Graphics g) {
        g.drawRect(x, y, 100, 100);
        g.setColor(cl);
        g.fillRect(x, y, 100, 100);
    }
}
