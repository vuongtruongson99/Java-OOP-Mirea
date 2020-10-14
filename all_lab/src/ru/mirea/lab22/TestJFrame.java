package ru.mirea.lab22;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class TestJFrame extends JFrame {
    Random rd = new Random();
    public TestJFrame() {
        super("Draw random figure");
        setSize(1280, 1024);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        Graphics gh = null;

        for (int i=0; i<20; ++i) {
            int n = rd.nextInt(2);
            if (n == 0) {
                gh = this.getGraphics();
                new Circle().paint(gh);
            }
            else if (n==1) {
                gh = this.getGraphics();
                new Rectangle().paint(gh);
            }
        }
    }
    public static void main(String[] args) {
        new TestJFrame();
    }

}
