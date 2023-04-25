package javaapplication1;

import java.util.Scanner;

public class AsignacionFliar {
    Scanner teclado = new Scanner (System.in);
    double valorHijo;
    int cantHijos;

    public AsignacionFliar(double valorHijo, int cantHijos) {
        this.valorHijo = valorHijo;
        this.cantHijos = cantHijos;
    }
   
    public double getAF() {
        System.out.println("¿cuántos hijos tenés? ");
        int cantHijos = teclado.nextInt();
        double valorHijo = 11465 * cantHijos;
        return valorHijo;
    }
}