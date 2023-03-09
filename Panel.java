
package com.mycompany.calculadorar;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Panel extends JPanel {
    private float x = 0;
    private float y = 0;
    private String numVisible = "";
    private boolean suma = false;
    private boolean resta = false;
    private boolean multiplicacion = false;
    private boolean division = false;
    
    public Panel(){
        setLayout(null);
        // Primera Fila
        JTextField txt = new JTextField();
        txt.setBounds(10, 50,  335, 80);
        add(txt);
        // Segunda Fila
        JButton boton1 = new JButton("1");
        boton1.setBounds(10, 135, 80, 80);
        boton1.addActionListener((ActionEvent e) -> {
            numVisible += "1";
            txt.setText(numVisible);
        });
        add(boton1);
        JButton boton2 = new JButton("2");
        boton2.setBounds(95, 135, 80, 80);
        boton2.addActionListener((ActionEvent e) -> {
            numVisible += "2";
            txt.setText(numVisible);
        });
        add(boton2);
        JButton boton3 = new JButton("3");
        boton3.setBounds(180, 135, 80, 80);
        boton3.addActionListener((ActionEvent e) -> {
            numVisible += "3";
            txt.setText(numVisible);
        });
        add(boton3); 
        JButton botonMas = new JButton("+");
        botonMas.setBounds(265, 135, 80, 80);
        botonMas.addActionListener((ActionEvent e) -> {
            suma = true;
            PonerEnX(numVisible);
            numVisible = "";
        });
        add(botonMas);
        // Tercera Fila
         JButton boton4 = new JButton("4");
         boton4.setBounds(10, 220, 80, 80);
         boton4.addActionListener((ActionEvent e) -> {
             numVisible += "4";
             txt.setText(numVisible);
        });
        add(boton4);
        JButton boton5 = new JButton("5");
        boton5.setBounds(95, 220, 80, 80);
        boton5.addActionListener((ActionEvent e) -> {
            numVisible += "5";
            txt.setText(numVisible);
        });
        add(boton5);
        JButton boton6 = new JButton("6");
        boton6.setBounds(180, 220, 80, 80);
        boton6.addActionListener((ActionEvent e) -> {
            numVisible += "6";
            txt.setText(numVisible);
        });
        add(boton6); 
        JButton botonMenos = new JButton("-");
        botonMenos.setBounds(265, 220, 80, 80);
        botonMenos.addActionListener((ActionEvent e) -> {
            resta = true;
            PonerEnX(numVisible);
            numVisible = "";
        });
        add(botonMenos);
        // Cuarta Fila
        JButton boton7 = new JButton("7");
        boton7.setBounds(10, 305, 80, 80);
        boton7.addActionListener((ActionEvent e) -> {
            numVisible += "7";
            txt.setText(numVisible);
        });
        add(boton7);
        JButton boton8 = new JButton("8");
        boton8.setBounds(95, 305, 80, 80);
        boton8.addActionListener((ActionEvent e) -> {
            numVisible += "8";
            txt.setText(numVisible);
        });
        add(boton8);
        JButton boton9 = new JButton("9");
        boton9.setBounds(180, 305, 80, 80);
        boton9.addActionListener((ActionEvent e) -> {
            numVisible += "9";
            txt.setText(numVisible);
        });
        add(boton9);
        JButton botonMultiplicar = new JButton("*");
        botonMultiplicar.setBounds(265, 305, 80, 80);
        botonMultiplicar.addActionListener((ActionEvent e) -> {
            multiplicacion = true;
            PonerEnX(numVisible);
            numVisible = "";
        });
        add(botonMultiplicar);
        // Quinta Fila
        JButton botonC = new JButton("C");
        botonC.setBounds(10, 390, 80, 80);
        botonC.addActionListener((ActionEvent e) -> {
            x = 0;
            y = 0;
            numVisible = "";
            txt.setText(numVisible);
        });
        add(botonC);
        JButton boton0 = new JButton("0");
        boton0.setBounds(95, 390, 80, 80);
        boton0.addActionListener((ActionEvent e) -> {
            numVisible += "0";
            txt.setText(numVisible);
        });
        add(boton0);
        JButton botonIgual = new JButton("=");
        botonIgual.setBounds(180, 390, 80, 80);
        botonIgual.addActionListener((ActionEvent e) -> {
            PonerEnY(numVisible);
            if (suma) {
                numVisible = String.valueOf(x + y);
                suma = false;
            }
            if (resta) {
                numVisible = String.valueOf(x - y);
                resta = false;
            }
            if (multiplicacion) {
                numVisible = String.valueOf(x * y);
                multiplicacion = false;
            }
            if (division) {
                numVisible = String.valueOf(x / y);
                division = false;
            }
            txt.setText(numVisible);
        });
        add(botonIgual);
        JButton botonDividir = new JButton("/");
        botonDividir.setBounds(265, 390, 80, 80);
        botonDividir.addActionListener((ActionEvent e) -> {
            division = true;
            PonerEnX(numVisible);
            numVisible = "";
        });
        add(botonDividir);
    }
    
    private void PonerEnX(String valorStr) {
        this.x = Float.parseFloat(valorStr);
    }
    
    private void PonerEnY(String valorStr) {
        this.y = Float.parseFloat(valorStr);
    }
    
}
