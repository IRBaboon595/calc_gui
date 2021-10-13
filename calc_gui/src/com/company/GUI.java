package com.company;
import javax.swing.*;
import java.awt.*;


public class GUI extends JFrame{

    JFrame frame = new JFrame("Simple Calc");

    JButton buttonOne = new JButton("1");
    JButton buttonTwo = new JButton("2");
    JButton buttonThree = new JButton("3");
    JButton buttonFour = new JButton("4");
    JButton buttonFive = new JButton("5");
    JButton buttonSix = new JButton("6");
    JButton buttonSeven = new JButton("7");
    JButton buttonEight = new JButton("8");
    JButton buttonNine = new JButton("9");
    JButton buttonZero = new JButton("0");
    JButton buttonPlus = new JButton("+");
    JButton buttonMinus = new JButton("-");
    JButton buttonDivide = new JButton("/");
    JButton buttonMultiply = new JButton("*");
    JButton buttonEquals = new JButton("=");
    JButton buttonPercent = new JButton("%");
    JButton buttonSign = new JButton("+/-");
    JButton buttonAllClear= new JButton("AC");
    JButton buttonComm = new JButton(",");

    private JTextField tfAnswer = new JTextField(10);

    Container container = this.getContentPane();


    public GUI(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        container.setLayout(new GridLayout(5, 4, 10, 10));
        container.add(buttonAllClear);
        container.add(buttonSign);
        container.add(buttonPercent);
        container.add(buttonDivide);
        container.add(buttonOne);
        container.add(buttonTwo);
        container.add(buttonThree);
        container.add(buttonFour);
        container.add(buttonFive);
        container.add(buttonSix);
        container.add(buttonSeven);
        container.add(buttonEight);
        container.add(buttonNine);
        container.add(buttonZero);
        container.add(buttonPlus);
        container.add(buttonMinus);

        container.add(buttonMultiply);
        container.add(buttonEquals);


        frame.add(container);

        frame.setVisible(true);


    }

}
