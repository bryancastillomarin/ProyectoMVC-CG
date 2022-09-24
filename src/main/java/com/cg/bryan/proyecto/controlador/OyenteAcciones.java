package com.cg.bryan.proyecto.controlador;

import com.cg.bryan.proyecto.vista.Acciones;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComponent;

/**
 *
 * @author bryan
 */
public class OyenteAcciones implements ActionListener{

    private final Acciones acciones;
    
    public OyenteAcciones(Acciones acciones) {
        this.acciones = acciones;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        JComponent fuente = (JComponent) e.getSource();
        switch (fuente.getName()) {
            case "botonCerrarAcciones":
                System.out.println("Saliendo...");
                System.exit(0);
                break;
            default:
                System.err.println("Accion no implementada");
                System.exit(0);
        }
    }
    
}
