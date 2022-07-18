package modulo1;

import java.util.Scanner;

public class Sesion_4 {

    public static void main(String[] args) {
        //ejemplo_arreglo();
        // ejemplo_string();
        ejercicio_1();
    }

    public static void ejemplo_arreglo() {
        String listaPalabras[] = new String[5];

        System.out.println(listaPalabras[0] != null);

        listaPalabras[3] = "Java";
        listaPalabras[2] = 99 + "";
        listaPalabras[3] = "Python";

        int n = listaPalabras.length;
        System.out.println("Tamanio " + n);
        //System.out.println(listaPalabras);
        for (int i = 0; i < n; i++) {
            System.err.println("[" + i + "] = " + listaPalabras[i]);
        }

    }

    public static void ejemplo_string() {
        //               01234
        String a = "Hola Grupo";

        String b = a.substring(1, 4);
        System.out.println("Tamanio b " + b.length());
        System.out.println(b);

        String c = a.substring(4);
        System.out.println("Tamanio c " + c.length());
        System.out.println(c);

        System.out.println(b + c);

        System.out.println(a.indexOf("G"));
        imprimir_arreglo(a.split("o"));
        System.out.println(a.toUpperCase());
        System.out.println(a.toLowerCase());
    }

    public static void imprimir_arreglo(String[] arreglo) {
        String contenido = "[";
        for (int i = 0; i < arreglo.length; i++) {
            contenido = contenido + (arreglo[i] + ",");
        }
        contenido = contenido.substring(0, contenido.length() - 1) + "]";
        System.out.println("Tamanio : " + arreglo.length);
        System.out.println("Contenido : " + contenido);
    }

    public static void ejemploforeach() {
        String listaPalabras[] = new String[5];

        listaPalabras[1] = "Java";
        listaPalabras[2] = 99 + "";
        listaPalabras[3] = "Python";

        //  for( letra in palabra): 
        for (String item : "Hola Grupo".split("")) {
            System.out.println(item);
        }
    }

    public static void ejercicio_1() {
        Scanner lector = new Scanner(System.in);
        int tamanio = 10;
        double numeros[] = new double[tamanio];
        for (int i = 0; i < tamanio; i++) {
            numeros[i] = lector.nextDouble();
        }

        System.out.println("Promedio: " + getPromedio(numeros));
        System.out.println("Desviacion Estandar: " + getDesviacionEstandar(numeros));

    }

    public static double getPromedio(double[] arreglo) {
        double resultado = 0;
        int tamanio = arreglo.length;
        double sumatoria = 0;
        for (double numero : arreglo) {
            sumatoria += numero;
        }
        resultado = sumatoria / tamanio;
        return resultado;
    }

    public static double getDesviacionEstandar(double[] arreglo) {
        double resultado;
        int tamanio = arreglo.length;
        double sumatoria = 0;
        double promedio = getPromedio(arreglo);
        for (double numero : arreglo) {
            sumatoria += Math.pow((numero - promedio), 2);
        }
        resultado = sumatoria / (tamanio - 1);
        resultado = Math.sqrt(resultado);
        return resultado;
    }
}
