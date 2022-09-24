package com.cg.bryan.proyecto.vista;

import com.cg.bryan.proyecto.controlador.OyenteGeneral;
import com.cg.bryan.proyecto.controlador.OyenteLogin;
import com.cg.bryan.proyecto.modelo.IniciarSesion;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends javax.swing.JFrame {

    private IniciarSesion iniciarSesion;
    
    public Login(IniciarSesion iniciarSesion) {
        this.iniciarSesion = iniciarSesion;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        etiquetaUsuario = new javax.swing.JLabel();
        inputUsuario = new javax.swing.JTextField();
        etiquetaContrasena = new javax.swing.JLabel();
        inputContrasena = new javax.swing.JPasswordField();
        panelAcciones = new javax.swing.JPanel();
        panelBotones = new javax.swing.JPanel();
        botonIniciar = new javax.swing.JButton();
        botonCerrar = new javax.swing.JButton();
        panelError = new javax.swing.JPanel();
        etiquetaError = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelPrincipal.setLayout(new java.awt.GridLayout(2, 2, 15, 15));

        etiquetaUsuario.setText("Usuario");
        panelPrincipal.add(etiquetaUsuario);
        panelPrincipal.add(inputUsuario);

        etiquetaContrasena.setText("Contraseña");
        panelPrincipal.add(etiquetaContrasena);
        panelPrincipal.add(inputContrasena);

        getContentPane().add(panelPrincipal, java.awt.BorderLayout.CENTER);

        panelAcciones.setLayout(new java.awt.BorderLayout());

        botonIniciar.setText("IniciarSesion");
        botonIniciar.setName("botonIniciarSesion"); // NOI18N
        panelBotones.add(botonIniciar);

        botonCerrar.setText("Cerrar");
        botonCerrar.setName("botonCerrarLogin"); // NOI18N
        panelBotones.add(botonCerrar);

        panelAcciones.add(panelBotones, java.awt.BorderLayout.CENTER);

        panelError.add(etiquetaError);

        panelAcciones.add(panelError, java.awt.BorderLayout.PAGE_START);

        getContentPane().add(panelAcciones, java.awt.BorderLayout.SOUTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCerrar;
    private javax.swing.JButton botonIniciar;
    private javax.swing.JLabel etiquetaContrasena;
    private javax.swing.JLabel etiquetaError;
    private javax.swing.JLabel etiquetaUsuario;
    private javax.swing.JPasswordField inputContrasena;
    private javax.swing.JTextField inputUsuario;
    private javax.swing.JPanel panelAcciones;
    private javax.swing.JPanel panelBotones;
    private javax.swing.JPanel panelError;
    private javax.swing.JPanel panelPrincipal;
    // End of variables declaration//GEN-END:variables

    public void addEventos(OyenteLogin oyente) {
        botonCerrar.addActionListener(oyente);
    }
    
    public void addEventosTransicion(OyenteGeneral oyente) {
        botonIniciar.addActionListener(oyente);
    }

    public JPasswordField getInputContrasena() {
        return inputContrasena;
    }

    public JTextField getInputUsuario() {
        return inputUsuario;
    }
    
    public JLabel getEtiquetaError() {
        return etiquetaError;
    }
    
}
