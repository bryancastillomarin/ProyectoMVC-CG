package com.cg.bryan.proyecto.vista;

import com.cg.bryan.proyecto.controlador.OyenteAcciones;
import com.cg.bryan.proyecto.controlador.OyenteGeneral;

public class Acciones extends javax.swing.JFrame {

    public Acciones() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botonCalculadora = new javax.swing.JButton();
        botonCerrarSesion = new javax.swing.JButton();
        botonCerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.BorderLayout(15, 15));

        botonCalculadora.setText("Calculadora");
        botonCalculadora.setName("abrirCalculadora"); // NOI18N
        jPanel1.add(botonCalculadora, java.awt.BorderLayout.NORTH);

        botonCerrarSesion.setText("Cerrar sesión");
        botonCerrarSesion.setName("cerrarSesion"); // NOI18N
        jPanel1.add(botonCerrarSesion, java.awt.BorderLayout.CENTER);

        botonCerrar.setText("Cerrar");
        botonCerrar.setName("cerrarAcciones"); // NOI18N
        jPanel1.add(botonCerrar, java.awt.BorderLayout.SOUTH);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCalculadora;
    private javax.swing.JButton botonCerrar;
    private javax.swing.JButton botonCerrarSesion;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    public void addEventos(OyenteAcciones oyente) {
        this.botonCerrar.addActionListener(oyente);
    }

    public void addEventosTransicion(OyenteGeneral oyente) {
        this.botonCalculadora.addActionListener(oyente);
        this.botonCerrarSesion.addActionListener(oyente);
    }
}
