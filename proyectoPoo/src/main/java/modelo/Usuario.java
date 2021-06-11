/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Chris
 */
public class Usuario {
    protected String nombre;
    protected int contrasena;
    protected boolean ingresado;
    protected boolean bloqueado;
    
    
public Usuario(String nombre, int contrasena){
    this.nombre = nombre;
    this.contrasena = contrasena;
    this.ingresado = false;
    this.bloqueado = false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getContrasena() {
        return contrasena;
    }

    public void setContrasena(int contrasena) {
        this.contrasena = contrasena;
    }

    public boolean isIngresado() {
        return ingresado;
    }

    public void setIngresado(boolean ingresado) {
        this.ingresado = ingresado;
    }

    public boolean isBloqueado() {
        return bloqueado;
    }

    public void setBloqueado(boolean bloqueado) {
        this.bloqueado = bloqueado;
    }
    
    public void ingresar(String nombre, int contrasena){
        if(nombre == this.nombre && contrasena == this.contrasena){
            
        }
    }
}
