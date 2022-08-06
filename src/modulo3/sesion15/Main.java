/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modulo3.sesion15;

import java.util.HashMap;

/**
 *
 * @author Danie
 */
public class Main {

    public static void main(String[] args) {

        BaseDatos bd = new BaseDatos(new HashMap<>());
        System.out.println("Mayor " + bd.productoMayor());
        System.out.println("Menor " + bd.productoMenor());
        System.out.println("Promedio " + String.format("%.1f", bd.promedio()));

        System.out.println(bd.agregar(11, "Melon", 70, 13)); // Jamon Melon 4460.9
        
        System.out.println(bd.borrar(1, "nombre", 0, 0));
        
        
        System.out.println(bd.generarInforme_3());
        System.out.println(bd.genererInforme_2());
        

    }
}
