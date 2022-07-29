package modulo2.sesion8;

import java.util.ArrayList;
import modulo2.sesion7.Gato;

public class Arreglos {

    public static void main(String[] args) {
        prueba_arreglo_4();
    }

    public static void prueba_arreglo() {
        ArrayList<String> lista = new ArrayList<String>();
        lista.add("Elemento 1");
        lista.add("Elemento 2");

        System.out.println(lista);

        System.out.println(lista.get(1));

        lista.set(1, "Nuevo Elemento");
        System.out.println(lista);
    }

    public static void prueba_arreglo_2() {

        ArrayList<Float> lista = new ArrayList<Float>();
        lista.add(0.001f);
        lista.add(2f);
        lista.add(2.0f);

        System.out.println(lista);

    }

    public static void prueba_arreglo_3() {
        ArrayList<Number> lista = new ArrayList<>();
        lista.add(10);
        lista.add(0.0001);
        lista.add(23.5f); // float
        lista.add(90.9d);// double
        lista.add(1909090909);        
         
        System.out.println(lista);      
               
    }
    
    public static void prueba_arreglo_4() {
        
        ArrayList<Object> lista = new ArrayList<>();
        
        lista.add(10);
        lista.add(0.0001);
        lista.add(23.5f); // float
        lista.add(90.9d);// double
        lista.add(1909090909);        
        lista.add(true);
        lista.add("Cadena xD");
        lista.add('s');
        lista.add(new Gato("Michi", "NN", "Negro", 10));
        lista.add(null);
        lista.add(new Gato("Michi 2", "-", "Blanco", 10));        
         
        System.out.println(lista);      
               
    }

    
}
