package org.changer;



import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

        public class Main {
            public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                JFrame jframe = new JFrame("Chat Screen");

                jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                jframe.setSize(400, 400);

                jframe.setVisible(true);
                String message;
                int col1;
                int col2;
                int col3;

                JOptionPane.showMessageDialog(null, "Enter 3 numbers 0 to 255");
                col1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter 1 number"));
                col2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter 2 number"));
                col3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter 3 number"));

                ColorChanger changer = new ColorChanger(col1, col2, col3);
                jframe.getContentPane().setBackground(new Color(changer.getOne(),changer.getTwo(), changer.getThree()));

            }
        }


