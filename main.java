package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author ET36
 */
public class main {

    public static void main(String[] args) {

        AsignacionFliar asignacionFliar = cargaDatosAsignacion();
        Sueldo sueldo = cargaDatosSueldo(asignacionFliar);
        Empleado empleado = cargaDatosEmpleado(sueldo);
        
    
    }

    public static AsignacionFliar cargaDatosAsignacion() {
        Scanner teclado = new Scanner(System.in);
        double valorHijo = 11465;
        System.out.println("ingrese la cant de hijos");
        int cantHijo = teclado.nextInt();
        AsignacionFliar asignacionFliar = new AsignacionFliar(valorHijo, cantHijo);
        return asignacionFliar;
    }

    public static Sueldo cargaDatosSueldo(AsignacionFliar asignacionFliar) {
        System.out.println("ingrese el sueldo");
        Scanner teclado = new Scanner(System.in);
        double sueldobasico = teclado.nextDouble();
        System.out.println("ingrese su obra social");
        double obraSocial = teclado.nextDouble();
        System.out.println("ingrese su jubilacion");
        double jubilacion = teclado.nextDouble();
        System.out.println("ingrese su presentismo");
        double presentismo = teclado.nextDouble();
        System.out.println("ingrese su cargo");
        String cargo = teclado.next();
        System.out.println("ingrese su genero");
        String genero = teclado.next();

        Sueldo sueldo = new Sueldo(sueldobasico, obraSocial, jubilacion, presentismo, cargo, asignacionFliar, genero);
        return sueldo;
    }

    public static Empleado cargaDatosEmpleado(Sueldo sueldo) {
        System.out.println("ingrese su nombre");
        Scanner teclado = new Scanner(System.in);
        String nombre = teclado.next();
        System.out.println("ingrese su genero");
        String genero = teclado.next();
        System.out.println("ingrese su direccion");
        String direccion = teclado.next();
        System.out.println("ingrese su cuit");
        int cuit = teclado.nextInt();
        System.out.println("ingrese su telefono");
        int telefono = teclado.nextInt();
        System.out.println("ingrese su telefono");
        telefono = teclado.nextInt();
        System.out.println("ingrese su la cantidad de hijos");
        int cantHijos = teclado.nextInt();

        Empleado empleado = new Empleado(nombre, genero, direccion, cuit, telefono, cantHijos, sueldo);
        return empleado;
    }
}
