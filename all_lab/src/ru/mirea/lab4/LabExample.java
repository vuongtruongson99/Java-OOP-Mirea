package ru.mirea.lab4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LabExample extends JFrame {
    JTextField jta1 = new JTextField(10);
    JTextField jta2 = new JTextField(10);
    JButton button = new JButton("Add them up");
    Font fnt = new Font("Times new roman",Font.BOLD,20);

    LabExample() {
        super("Example");
        setLayout(new FlowLayout());
        setSize(250, 100);
        add(new JLabel("1st Number: "));
        add(jta1);
        add(new JLabel("2nd Number: "));
        add(jta2);
        add(button);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    double x1 = Double.parseDouble(jta1.getText().trim());
                    double x2 = Double.parseDouble(jta2.getText().trim());

                    JOptionPane.showMessageDialog(null, "Result " + (x1 + x2), "Alert", JOptionPane.INFORMATION_MESSAGE);
                }
                catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error Number!" , "alert", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new LabExample();
    }
}
