package javaapplication1;

import java.util.Scanner;

public class Empleado {
    String nombre;
    String genero;
    String direccion;
    int cuit;
    int telefono;
    int cantHijos;
    Sueldo sueldo;

    public Empleado(String nombre, String genero, String direccion, int cuit, int telefono, int cantHijos, Sueldo sueldo) {
        this.nombre = nombre;
        this.genero = genero;
        this.direccion = direccion;
        this.cuit = cuit;
        this.telefono = telefono;
        this.cantHijos = cantHijos;
        this.sueldo = sueldo;
    }

    
    public void mostrarDatos() {
        System.out.println( "Empleado " + "nombre= " + nombre + ", genero= " + genero + ", direccion= " + direccion + ", cuit= " + cuit + ", telefono= " + telefono + ", cantHijos= " + cantHijos + ", sueldo= " + sueldo.sueldo );
    }
    
   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCuit() {
        return cuit;
    }

    public void setCuit(int cuit) {
        this.cuit = cuit;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getCantHijos() {
        return cantHijos;
    }

    public void setCantHijos(int cantHijos) {
        this.cantHijos = cantHijos;
    }

    public Sueldo getSueldo() {
        return sueldo;
    }

    public void setSueldo(Sueldo sueldo) {
        this.sueldo = sueldo;
    }
    
}