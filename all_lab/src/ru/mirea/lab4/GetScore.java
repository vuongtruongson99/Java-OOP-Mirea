package ru.mirea.lab4;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class GetScore extends JPanel {
    private JLabel jcomp1;
    private JLabel jcomp2;
    private JLabel jcomp3;
    private JLabel jcomp4;
    private JLabel jcomp5;
    private JLabel jcomp6;
    private JButton jcomp7;
    private JButton jcomp8;
    private int score_AC = 0;
    private int score_madrid = 0;
    private String lastScore = "N/A";
    private String winner = "DRAW";

    public GetScore() {
        //construct components
        jcomp1 = new JLabel ("Result: ");
        jcomp2 = new JLabel (String.valueOf(score_AC) + " x " + String.valueOf(score_madrid));
        jcomp3 = new JLabel ("Last score: ");
        jcomp4 = new JLabel (lastScore);
        jcomp5 = new JLabel ("Winner:");
        jcomp6 = new JLabel (winner);
        jcomp7 = new JButton ("AC Milan");
        jcomp8 = new JButton ("Real Madrid");

        //adjust size and set layout
        setPreferredSize (new Dimension (379, 229));
        setLayout (null);

        //add components
        add (jcomp1);
        add (jcomp2);
        add (jcomp3);
        add (jcomp4);
        add (jcomp5);
        add (jcomp6);
        add (jcomp7);
        add (jcomp8);

        //set component bounds (only needed by Absolute Positioning)
        jcomp1.setBounds (90, 45, 100, 25);
        jcomp2.setBounds (205, 45, 100, 25);
        jcomp3.setBounds (90, 75, 100, 25);
        jcomp4.setBounds (205, 75, 100, 25);
        jcomp5.setBounds (90, 110, 100, 25);
        jcomp6.setBounds (205, 110, 100, 25);
        jcomp7.setBounds (70, 165, 100, 25);
        jcomp8.setBounds (190, 165, 100, 25);

        jcomp7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                score_AC += 1;
                lastScore = "AC Milan";

                jcomp2.setText(String.valueOf(score_AC) + " x " + String.valueOf(score_madrid));
                jcomp4.setText(lastScore);

                if (score_AC > score_madrid) {
                    winner = "AC Milan";
                }
                else if (score_AC == score_madrid) {
                    winner = "Draw";
                }
                else {
                    winner = "Real Madrid";
                }
                jcomp6.setText(winner);
            }
        });

        jcomp8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                score_madrid += 1;
                lastScore = "Real Madrid";

                jcomp2.setText(String.valueOf(score_AC) + " x " + String.valueOf(score_madrid));
                jcomp4.setText(lastScore);

                if (score_AC > score_madrid) {
                    winner = "AC Milan";
                }
                else if (score_AC == score_madrid) {
                    winner = "Draw";
                }
                else {
                    winner = "Real Madrid";
                }
                jcomp6.setText(winner);
            }
        });

    }

    public static void main (String[] args) {
        JFrame frame = new JFrame ("AC Milan vs Real Madrid");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new GetScore());
        frame.pack();
        frame.setVisible (true);
    }
}

