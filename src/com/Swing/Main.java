package com.Swing;

import javax.swing.*;
import java.awt.*;

public class Main {

    static JFrame jFrame = getFrame(); // наша форма
    static JPanel jPanel = new JPanel(); // наша панель

    public static void main(String[] args) {
        /*
        // Создание простого ------------------------------------------ BorderLayout ----------------------------------------------
	    jFrame.add(new JButton("1"), BorderLayout.NORTH); // создание кнопки и его место на экране
        jFrame.add(new JButton("2"), BorderLayout.WEST);   //       NORTH
        jFrame.add(new JButton("3"), BorderLayout.SOUTH);  // WEST CENTER EAST
        jFrame.add(new JButton("4"), BorderLayout.EAST);   //       SOUTH
        jFrame.add(new JButton("5"), BorderLayout.CENTER);
         */

        /*
        // Создание простого ------------------------------------------ GridLayout ----------------------------------------------
        int r = 2, c=3; // rows, cols / строка, столбец
        jFrame.add(jPanel);
        jPanel.setLayout(new GridLayout(r,c)); //добавляем на панель наш GridLayout
        for (int i=1; i<=(r*c);i++) {               //      1   2   3
            jPanel.add(new JButton(""+i));      //     4   5   6
        }
        jFrame.revalidate(); // обновить (перерисовать) элементы окна
        */

        // Создание простого  ------------------------------------------ GridBagLayout ----------------------------------------------
        jFrame.add(jPanel);
        GridBagLayout gridBagLayout = new GridBagLayout();
        jPanel.setLayout(gridBagLayout);

        //               /      Button 1
        //   TextArea    /--------------------
        //               / Button 2 / Button 3

        // TextArea
        GridBagConstraints constraints1 = new GridBagConstraints();
        constraints1.weightx=0; // сколько будет занимать место, 0 - сам решит
        constraints1.weighty=0;
        constraints1.gridx=0; // с какой клетки?
        constraints1.gridy=0;
        constraints1.gridheight=2; // сколько займет от целого поля?
        constraints1.gridwidth=2;
        jPanel.add(new TextArea(4,20), constraints1);

        // Button 1
        GridBagConstraints constraints2 = new GridBagConstraints();
        constraints2.weightx=0;
        constraints2.weighty=0;
        constraints2.gridx=2;
        constraints2.gridy=0;
        constraints2.gridheight=1;
        constraints2.gridwidth=2;
        jPanel.add(new Button("Click 1"), constraints2);

        // Button 2
        GridBagConstraints constraints3 = new GridBagConstraints();
        constraints3.weightx=0;
        constraints3.weighty=0;
        constraints3.gridx=2;
        constraints3.gridy=1;
        constraints3.gridheight=1;
        constraints3.gridwidth=1;
        jPanel.add(new Button("Click 2"), constraints3);

        // Button 3
        GridBagConstraints constraints4 = new GridBagConstraints();
        constraints4.weightx=0;
        constraints4.weighty=0;
        constraints4.gridx=3;
        constraints4.gridy=1;
        constraints4.gridheight=1;
        constraints4.gridwidth=1;
        jPanel.add(new Button("Click 3"), constraints4);

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
