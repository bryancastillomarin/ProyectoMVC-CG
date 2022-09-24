package com.cg.bryan.proyecto.modelo;

public class IniciarSesion {
    
    private String usuario;
    private String contrasena;
    
    public IniciarSesion() {
        this.usuario = "usuario";
        this.contrasena = "P@ssw0rd";
    }
    
    public IniciarSesion(String usuario, String contrasena) {
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
    
}
