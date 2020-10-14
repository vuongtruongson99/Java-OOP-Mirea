package ru.mirea.lab22;

import java.awt.*;

public class Circle extends Shape {
    @Override
    public void paint(Graphics g) {
        g.drawOval(x, y, 100, 100);
        g.setColor(cl);
        g.fillOval(x, y, 100, 100);
    }
}
