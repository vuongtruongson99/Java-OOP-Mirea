package ru.mirea.lab23;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class GuessGame extends JFrame {
    JLabel lb = new JLabel("Guess the number (1-20): ");
    JTextField txt = new JTextField(10);
    JButton btn1 = new JButton("OK");
    Random random = new Random();
    int guessNumber = random.nextInt(20);
    int times = 1;

    public GuessGame() {
        super("Guess a number!");
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 200);
        setLayout(new FlowLayout());

        add(lb);
        add(txt);
        add(btn1);

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(times == 3 && Integer.parseInt(txt.getText()) != guessNumber) {
                    JOptionPane.showMessageDialog(null, "You lose! The number is " + guessNumber);
                    System.exit(0);
                }

                if (Integer.parseInt(txt.getText()) == guessNumber) {
                    JOptionPane.showMessageDialog(null, "You win!");
                    System.exit(0);
                }
                else if (Integer.parseInt(txt.getText()) < guessNumber && times != 3) {
                    JOptionPane.showMessageDialog(null, "The number to find is larger!");
                    times++;
                }
                else if (Integer.parseInt(txt.getText()) > guessNumber && times != 3) {
                    JOptionPane.showMessageDialog(null, "The number to find is smaller!");
                    times++;
                }
            }
        });
    }

    public static void main(String[] args) {
        new GuessGame();
    }
}
