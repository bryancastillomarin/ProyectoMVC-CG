package com.cg.bryan.proyecto;

import com.cg.bryan.proyecto.controlador.OyenteAcciones;
import com.cg.bryan.proyecto.controlador.OyenteCalculadora;
import com.cg.bryan.proyecto.controlador.OyenteGeneral;
import com.cg.bryan.proyecto.controlador.OyenteLogin;
import com.cg.bryan.proyecto.modelo.IniciarSesion;
import com.cg.bryan.proyecto.vista.Acciones;
import com.cg.bryan.proyecto.vista.Calculadora;
import com.cg.bryan.proyecto.vista.Login;
import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) {
        IniciarSesion iniciarSesion = new IniciarSesion("bryan", "1234");
        
        Login login = new Login(iniciarSesion);
        Acciones acciones = new Acciones();
        Calculadora calculadora = new Calculadora();
        
        OyenteLogin oyenteLogin = new OyenteLogin(login);
        OyenteAcciones oyenteAcciones = new OyenteAcciones(acciones);
        OyenteCalculadora oyenteCalculadora = new OyenteCalculadora(calculadora);
        
        OyenteGeneral oyenteGeneral = new OyenteGeneral(
                iniciarSesion,
                acciones,
                calculadora,
                login
        );
        
        login.addEventos(oyenteLogin);
        acciones.addEventos(oyenteAcciones);
        calculadora.addEventos(oyenteCalculadora);
        
        login.addEventosTransicion(oyenteGeneral);
        acciones.addEventosTransicion(oyenteGeneral);
        calculadora.addEventosTransicion(oyenteGeneral);
        
        login.setTitle("Login");
        acciones.setTitle("Acciones");
        calculadora.setTitle("Calculadora");
        
        login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        acciones.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        login.setSize(400,200);
        login.setLocation(100, 100);
        login.setResizable(false);
        login.setVisible(true);
        
        acciones.setSize(300, 140);
        acciones.setLocation(100, 100);
        acciones.setResizable(false);
        
        calculadora.setLocation(100, 100);
        calculadora.setResizable(false);
    }
}
