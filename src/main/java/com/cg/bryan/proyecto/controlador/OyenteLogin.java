package com.cg.bryan.proyecto.controlador;

import com.cg.bryan.proyecto.vista.Login;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComponent;

public class OyenteLogin implements ActionListener {
    
    private final Login login;
    
    public OyenteLogin(Login login) {
        this.login = login;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JComponent fuente = (JComponent) e.getSource();
        switch (fuente.getName()) {
            case "cerrarLogin":
                System.out.println("Saliendo...");
                System.exit(0);
                break;
            default:
                System.err.println("Accion no implementada");
                System.exit(0);
        }
    }
    
}
