
package javaapplication1;


public class ReciboHaberes  {
    Empleado empleado; 

    public ReciboHaberes(Empleado empleado){
        this.empleado = empleado;
    }
    public void imprimirRecibo (){
       this.empleado.mostrarDatos();
       this.empleado.getSueldo().emitirDetalle();
       if (empleado.getSueldo().getCargo().equals("vendedor") && empleado.getGenero().equals("hombre")){
           Vendedor v =(Vendedor) empleado; 
           System.out.println("Sueldo Neto: "+ v.getSueldo().calcularSueldoBasicoNeto()+v.comision());
       }
       else {
           empleado.getSueldo().calcularSueldoBasicoNeto();
       }
       
    }    
}
