/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modulo2.sesion9;

import java.util.ArrayList;

/**
 *
 * @author Danie
 */
public class Main {

    public static void main(String[] args) {
      pruebaBodega();
    }

    public static void pruebaEmpleado() {
        Empleado jefeDJefes = new Empleado(1l, "Pepito");
        Empleado empleado = new Empleado(2l, "Carlo", jefeDJefes);

        //System.out.println(jefeDJefes);
        System.out.println(empleado.getJefe().getNombre());
    }

    public static void pruebaCelular() {
        Procesador procesador_1 = new Procesador(1l, 2.5, "i3");
        System.out.println(procesador_1);

        Celular celular_1 = new Celular("I13", "Apple", "3123123123", procesador_1);
        System.out.println(celular_1);

    }
    
    public static void pruebaBodega(){
        Bodega bodega_1 = new Bodega(0, new ArrayList<>(), "Calle falsa 123");
        System.out.println(bodega_1);
        
        Producto producto_1 = new Producto("1", "Jamon", 15000.0);
        
        System.out.println( bodega_1.agregarProducto(producto_1));        
        System.out.println(bodega_1);
    }
    
}
