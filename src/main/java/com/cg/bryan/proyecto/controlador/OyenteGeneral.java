package com.cg.bryan.proyecto.controlador;

import com.cg.bryan.proyecto.modelo.IniciarSesion;
import com.cg.bryan.proyecto.vista.Acciones;
import com.cg.bryan.proyecto.vista.Calculadora;
import com.cg.bryan.proyecto.vista.Login;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComponent;

public class OyenteGeneral implements ActionListener {
    
    private final IniciarSesion iniciarSesion;
    private final Acciones acciones;
    private final Calculadora calculadora;
    private final Login login;

    public OyenteGeneral(
            IniciarSesion iniciarSesion,
            Acciones acciones,
            Calculadora calculadora,
            Login login
    ) {
        this.iniciarSesion = iniciarSesion;
        this.acciones = acciones;
        this.calculadora = calculadora;
        this.login = login;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JComponent fuente = (JComponent) e.getSource();
        switch(fuente.getName()) {
            case "botonIniciarSesion":
                if (iniciarSesion()) {
                    ocultarVentanas();
                    acciones.setVisible(true);
                    break;
                }
                login.getEtiquetaError().setText("Usuario y/o contraseña incorrecto!");
                break;
            case "abrirCalculadora": 
                ocultarVentanas();
                calculadora.setVisible(true);
                break;
            case "cerrarSesion":
                ocultarVentanas();
                limpiarLogin();
                login.setVisible(true);
                break;
            case "botonSalirCalculadora":
                ocultarVentanas();
                acciones.setVisible(true);
                break;
            default:
                System.err.println("Accion no implementada");
                System.exit(0);
        }
    }
    
    private void ocultarVentanas() {
        this.calculadora.setVisible(false);
        this.login.setVisible(false);
        this.acciones.setVisible(false);
    }
    
    private boolean iniciarSesion() {
        String usuario = login.getInputUsuario().getText();
        if (!usuario.equals(iniciarSesion.getUsuario())) {
            return false;
        }
        char[] contrasenaCaracteres = login.getInputContrasena().getPassword();
        String contrasena = String.valueOf(contrasenaCaracteres);
        return contrasena.equals(iniciarSesion.getContrasena());
        //la linea de arriba representa todas las linea de abajo
//        if (!contrasena.equals(iniciarSesion.getContrasena())) {
//            return false;
//        }
//        return true;
    }
    
    private void limpiarLogin() {
        login.getEtiquetaError().setText("");
        login.getInputUsuario().setText("");
        login.getInputContrasena().setText("");
    }
    
}
