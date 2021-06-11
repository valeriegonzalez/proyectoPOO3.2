/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Chris
 */
public class Trabajador extends Usuario{
    protected boolean cuarentena;
    protected int temperatura;
    protected int subBurbuja;
    protected ArrayList accidentes;
    
    public Trabajador(){}
    
    public Trabajador(String nombre, int contraseña, boolean ingresado, boolean bloqueado, 
            boolean cuarentena, int temperatura, int subBurbuja, ArrayList accidentes) {
        super(nombre, contraseña, ingresado, bloqueado);
        this.cuarentena = cuarentena;
        this.temperatura = temperatura;
        this.subBurbuja = subBurbuja;
        this.accidentes = accidentes;
    }

    public boolean isCuarentena() {
        return cuarentena;
    }

    public void setCuarentena(boolean cuarentena) {
        this.cuarentena = cuarentena;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public int getSubBurbuja() {
        return subBurbuja;
    }

    public void setSubBurbuja(int subBurbuja) {
        this.subBurbuja = subBurbuja;
    }

    public ArrayList getAccidentes() {
        return accidentes;
    }

    public void setAccidentes(ArrayList accidentes) {
        this.accidentes = accidentes;
    }
    
    public void visualizarDatosCovid() {}
    
    public void indicarEntrada() {}
    
    public void enYsaAlmuerzo() {}
    
    public void indicarSalida() {}
    
    public void actividadesDiarias() {}
    
    public void ingresar() {
        System.out.println("ingresar");
    }
    
    public void bloquear() {
        System.out.println("bloquear");
    }

    @Override
    public String toString() {
        return "Trabajador{" + super.toString() + "cuarentena=" + cuarentena + ", temperatura=" + temperatura + ", subBurbuja=" + subBurbuja + ", accidentes=" + accidentes + '}';
    }
}