package com.Swing;

import javax.swing.*;
import java.awt.*;

public class Main {

    static JFrame jFrame = getFrame(); // наша форма
    static JPanel jPanel = new JPanel(); // наша панель

    public static void main(String[] args) {
        /*
        // Создание простого BorderLayout
	    jFrame.add(new JButton("1"), BorderLayout.NORTH); // создание кнопки и его место на экране
        jFrame.add(new JButton("2"), BorderLayout.WEST);   //       NORTH
        jFrame.add(new JButton("3"), BorderLayout.SOUTH);  // WEST CENTER EAST
        jFrame.add(new JButton("4"), BorderLayout.EAST);   //       SOUTH
        jFrame.add(new JButton("5"), BorderLayout.CENTER);
         */

        int r = 2, c=3; // rows, cols / строка, столбец
        jFrame.add(jPanel);
        jPanel.setLayout(new GridLayout(r,c)); //добавляем на панель наш GridLayout
        for (int i=1; i<=(r*c);i++) {               //      1   2   3
            jPanel.add(new JButton(""+i));      //     4   5   6
        }
        jFrame.revalidate(); // обновить (перерисовать) элементы окна
    }

    static JFrame getFrame(){
        JFrame jFrame = new JFrame(); // создается форма
        jFrame.setVisible(true); // влючаем видимость
        jFrame.setBounds(750,250,300,300); // размеры
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // выход
        return jFrame;
    }
}
