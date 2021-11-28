package UI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class UI  extends JFrame implements  ItemListener, ActionListener {

    JLabel tittle, dateOne, dateTwo, dateTree;
    JTextField datesOne, datesTwo;
    JButton execute;
    JComboBox comboBox;


    public UI(){

        setSize(500,400);
        setTitle("Calculadora de Areas");

        /**
         * Definicion de propiedades de items
         * */
        tittle = new JLabel("Bienvenido a calculador de areas");
        tittle.setBounds(150,30,400,40);


        comboBox = new JComboBox<String>();
        comboBox.addItem("Cuadrado");
        comboBox.addItem("Triangulo");
        comboBox.addItemListener((ItemListener) this);
        comboBox.setBounds(70,120,80,30);

        execute = new JButton("Calcular");
        execute.setBounds(200,250,100,30);

        getContentPane().add(comboBox);
        getContentPane().add(tittle);
        getContentPane().add(execute);


        setLayout(null);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);

        ActionListener in = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("hla");
            }
        };


        execute.addActionListener(in);




    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void itemStateChanged(ItemEvent e) {

    }
}
