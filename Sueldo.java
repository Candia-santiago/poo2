package javaapplication1;

import java.util.Scanner;

public class Sueldo {
    Scanner teclado = new Scanner (System.in);
    
    double sueldo;
    double obraSocial;
    double jubilacion;
    double presentismo;
    String cargo;
    AsignacionFliar fliar;
    String genero;

    
    public Sueldo(double sueldo, double obraSocial, double jubilacion, double presentismo, String cargo, AsignacionFliar fliar, String genero) {
        this.sueldo = sueldo;
        this.obraSocial = obraSocial;
        this.jubilacion = jubilacion;
        this.presentismo = presentismo;
        this.cargo = cargo;
        this.fliar = fliar;
        this.genero = genero;
    }
    
    public double sueldoBasico(){
        System.out.println("¿qué cargo tenés? ");
        String cargo = teclado.next();
        if ("panadero".equals(cargo)){
            sueldo = sueldo + 98000;
        }
        else{
            if("repostero".equals(cargo)){
                sueldo = sueldo + 110000;
            }
            else{
                if("vendedor".equals(cargo)){
                    sueldo = sueldo + 70000;
                }
            }
        }
       
        return sueldo;
    }
    
    public double plusHombreRep(){
        double plusH = 0;
        System.out.println("cuál es tu genero? hombre o mujer: ");
        String genero = teclado.next();
        if ("hombre".equals(genero) && "repostero".equals(cargo)){
            plusH = sueldo / 100 * 10;
        }
        return plusH;
    }
    
    
    public double calcularSueldoBasicoNeto(){
        obraSocial = sueldo / 100 * 3;
        jubilacion = sueldo / 100 * 11;
        double sueldoNeto = sueldo - jubilacion - obraSocial; 
        System.out.println("tenes presentismo?  1-si    2-no");
        int opc = teclado.nextInt();
        if (opc == 1){
            presentismo = sueldo / 100 * 10;
            sueldoNeto = sueldoNeto + presentismo; 
        }
        sueldoNeto = sueldoNeto + fliar.getAF();
        sueldoNeto = sueldoNeto + plusHombreRep();
        return sueldoNeto;
    }
   
    
    public void emitirDetalle(){
        System.out.println("sueldo Basico: " + sueldoBasico());
        System.out.println("bono por Hijos: " + fliar.getAF());
        System.out.println("presentismo: " + presentismo);
        System.out.println("obra social: " + obraSocial);
        System.out.println("jubilación: " + jubilacion);

    }

    public String getCargo() {
        return cargo;
    }
    
    
    
}
