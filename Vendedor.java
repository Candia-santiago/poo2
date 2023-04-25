package javaapplication1;


public class Vendedor extends Empleado{
    int cantVendida;
    public Vendedor(String nombre, String genero, String direccion, int cuit, int telefono, int cantHijos, int cantVendida, Sueldo s ) {
        super(nombre, genero, direccion, cuit, telefono, cantHijos,s);
        this.cantVendida = cantVendida;
    }
    public double getCantVendida(){
        return cantVendida;
    }
    public double comision (){
        int comison = cantVendida+cantVendida/100*2;
        return comison;
    }
}
