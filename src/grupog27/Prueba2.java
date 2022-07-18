package grupog27;

import java.util.Scanner;

public class Prueba2 {

    public static void main(String[] args) {
        saludar();
        int a = 20;
        int b = 66;

        Scanner lector = new Scanner(System.in);
        String operacion = lector.nextLine();
        /*
        if (operacion.equals("Sumar")) {
            System.out.println("La suma es " + (a + b));
        } else if (operacion.equals("Restar")) {
            System.out.println("La resta es " + (a - b));
        } else if ("Multiplar".equals(operacion)) {
            System.out.println("La Multiplicaicon es " + (a * b));
        } else {
            System.out.println("Operación desconocida");
        }
         */

        switch (operacion) {
            case "Sumar":
                System.out.println("La suma es " + sumar(a, b));
                break;
            case "Restar":
                System.out.println("La resta es " + restar(a, b));
                break;
            case "Multiplicar":
                System.out.println("La multiplicacion es " + multiplicar(a, b));
                break;
            default:
                System.out.println("Operación desconocida");
                break;
        }

    }

    public static int sumar(int pepito, int juanito) {
        int resultado = pepito + juanito;
        return resultado;
    }

    public static int restar(int x, int y) {
        int resultado = x - y;
        return resultado;
    }

    public static int multiplicar(int a, int b) {
        int resultado = a * b;
        return resultado;
    }

    public static double dividir(int a, int b) {
        double resultado = a / b;
        return resultado;
    }

    public static void saludar() {
        System.out.println("Hola Grupo");
    }
}
