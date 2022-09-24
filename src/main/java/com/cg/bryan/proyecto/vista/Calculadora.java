package com.cg.bryan.proyecto.vista;

import com.cg.bryan.proyecto.controlador.OyenteCalculadora;
import com.cg.bryan.proyecto.controlador.OyenteGeneral;
import javax.swing.JTextField;

public class Calculadora extends javax.swing.JFrame {

    public Calculadora() {
        initComponents();
        setNames();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelInput = new javax.swing.JPanel();
        inputSalida = new javax.swing.JTextField();
        panelGrilla = new javax.swing.JPanel();
        boton7 = new javax.swing.JButton();
        boton8 = new javax.swing.JButton();
        boton9 = new javax.swing.JButton();
        botonSuma = new javax.swing.JButton();
        botonResta = new javax.swing.JButton();
        boton4 = new javax.swing.JButton();
        boton5 = new javax.swing.JButton();
        boton6 = new javax.swing.JButton();
        botonMultiplicacion = new javax.swing.JButton();
        botonDivision = new javax.swing.JButton();
        boton1 = new javax.swing.JButton();
        boton2 = new javax.swing.JButton();
        boton3 = new javax.swing.JButton();
        botonIgual = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelInput.setLayout(new java.awt.BorderLayout());

        inputSalida.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        panelInput.add(inputSalida, java.awt.BorderLayout.CENTER);

        getContentPane().add(panelInput, java.awt.BorderLayout.PAGE_START);

        panelGrilla.setLayout(new java.awt.GridLayout(3, 5, 5, 5));

        boton7.setText("7");
        panelGrilla.add(boton7);

        boton8.setText("8");
        panelGrilla.add(boton8);

        boton9.setText("9");
        panelGrilla.add(boton9);

        botonSuma.setText("+");
        panelGrilla.add(botonSuma);

        botonResta.setText("-");
        panelGrilla.add(botonResta);

        boton4.setText("4");
        panelGrilla.add(boton4);

        boton5.setText("5");
        panelGrilla.add(boton5);

        boton6.setText("6");
        panelGrilla.add(boton6);

        botonMultiplicacion.setText("*");
        panelGrilla.add(botonMultiplicacion);

        botonDivision.setText("/");
        panelGrilla.add(botonDivision);

        boton1.setText("1");
        panelGrilla.add(boton1);

        boton2.setText("2");
        panelGrilla.add(boton2);

        boton3.setText("3");
        panelGrilla.add(boton3);

        botonIgual.setText("=");
        panelGrilla.add(botonIgual);

        botonSalir.setText("Salir");
        botonSalir.setName(""); // NOI18N
        panelGrilla.add(botonSalir);

        getContentPane().add(panelGrilla, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton1;
    private javax.swing.JButton boton2;
    private javax.swing.JButton boton3;
    private javax.swing.JButton boton4;
    private javax.swing.JButton boton5;
    private javax.swing.JButton boton6;
    private javax.swing.JButton boton7;
    private javax.swing.JButton boton8;
    private javax.swing.JButton boton9;
    private javax.swing.JButton botonDivision;
    private javax.swing.JButton botonIgual;
    private javax.swing.JButton botonMultiplicacion;
    private javax.swing.JButton botonResta;
    private javax.swing.JButton botonSalir;
    private javax.swing.JButton botonSuma;
    private javax.swing.JTextField inputSalida;
    private javax.swing.JPanel panelGrilla;
    private javax.swing.JPanel panelInput;
    // End of variables declaration//GEN-END:variables

    public void addEventos(OyenteCalculadora oyente) {
        boton7.addActionListener(oyente);
        boton8.addActionListener(oyente);
        boton9.addActionListener(oyente);
        botonSuma.addActionListener(oyente);
        botonResta.addActionListener(oyente);
        boton4.addActionListener(oyente);
        boton5.addActionListener(oyente);
        boton6.addActionListener(oyente);
        botonMultiplicacion.addActionListener(oyente);
        botonDivision.addActionListener(oyente);
        boton1.addActionListener(oyente);
        boton2.addActionListener(oyente);
        boton3.addActionListener(oyente);
        botonIgual.addActionListener(oyente);
    }
    
    public void addEventosTransicion(OyenteGeneral oyente) {
        this.botonSalir.addActionListener(oyente);
    }
    
    private void setNames() {
        boton7.setName("boton7");
        boton8.setName("boton8");
        boton9.setName("boton9");
        botonSuma.setName("boton+");
        botonResta.setName("boton-");
        boton4.setName("boton4");
        boton5.setName("boton5");
        boton6.setName("boton6");
        botonMultiplicacion.setName("boton*");
        botonDivision.setName("boton/");
        boton1.setName("boton1");
        boton2.setName("boton2");
        boton3.setName("boton3");
        botonIgual.setName("boton=");
        botonSalir.setName("botonSalirCalculadora");
    }
    
    public JTextField getInputSalida() {
        return inputSalida;
    }
    
}
