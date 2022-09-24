package com.cg.bryan.proyecto.controlador;

import com.cg.bryan.proyecto.vista.Calculadora;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComponent;
import javax.swing.JTextField;

public class OyenteCalculadora implements ActionListener{

    private final Calculadora calculadora;
    
    public OyenteCalculadora(Calculadora calculadora) {
        this.calculadora = calculadora;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        JComponent fuente = (JComponent) e.getSource();
        switch (fuente.getName()) {
            case "boton1":
                concatenarSalida("1");
                break;
            case "boton2":
                concatenarSalida("2");
                break;
            case "boton3":
                concatenarSalida("3");
                break;
            case "boton4":
                concatenarSalida("4");
                break;
            case "boton5":
                concatenarSalida("5");
                break;
            case "boton6":
                concatenarSalida("6");
                break;
            case "boton7":
                concatenarSalida("7");
                break;
            case "boton8":
                concatenarSalida("8");
                break;
            case "boton9":
                concatenarSalida("9");
                break;
            case "boton+":
                concatenarSalida("+");
                break;
            case "boton-":
                concatenarSalida("-");
                break;
            case "boton*":
                concatenarSalida("*");
                break;
            case "boton/":
                concatenarSalida("/");
                break;
            case "boton=":
                calculadora.getInputSalida().setText("");
                break;
            default:
                System.err.println("Accion no implementada");
                System.exit(0);
        }
    }
    
    private void concatenarSalida(String caracter) {
        JTextField salida = calculadora.getInputSalida();
        salida.setText(salida.getText().concat(caracter));
    }
    
}
