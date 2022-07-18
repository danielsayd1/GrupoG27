package grupog27;

import java.util.Scanner;

public class Session3 {

    public static void main(String[] args) {
        /*Scanner lector = new Scanner(System.in);
        int valor = Integer.parseInt(lector.nextLine());// para python = int(input()) 
        calculo_factorial_while(valor);*/
        conteo();
    }

    public static void prueba_while() {
        int x = 0;
        int y = 10;
        while (x < y) {
            System.out.println("-" + x);
            x++;
        }
    }

    public static void ejemplo_while() {
        Scanner lector = new Scanner(System.in);
        String palabra = "";
        while (!palabra.equals("Salir del juego")) {
            System.out.println("-> " + palabra);
            System.out.println("Una palabra: ");
            palabra = lector.nextLine(); // input() -> lee el teclado por consola
        }
    }

    public static void prueba_do_while() {
        int x = 10;
        int y = 10;
        do {
            System.out.println(x);
            x++;
        } while (x < y);

    }

    public static void ejemplo_do_while() {
        Scanner lector = new Scanner(System.in);
        String palabra = "";
        do {
            System.out.println(palabra);
            palabra = lector.nextLine(); // input() -> lee el teclado por consola                        
        } while (!palabra.equals("Salir del juego"));
    }

    public static void prueba_for() {
        double x = 0;
        for (x = 0; x <= 10; x = x + 0.5) {
            System.out.println(x);
        }
    }

    public static void ejemplo_for() {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int sumatoria = 0;

        for (int i = 3; i < n; i++) {
            System.out.println(i);
            sumatoria = sumatoria + i;
        }

        System.out.println("La sumatoria " + sumatoria);
    }

    public static void calculo_factorial_for(int x) {
        int factorial = 1;

        for (int i = x; i > 1; i--) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
    }

    public static void calculo_factorial_while(int x) {
        int factorial = 1;
        int y = x;
        while (y > 1) {
            factorial = factorial * y;
            y--;// y= y-1
        }
        System.out.println(factorial);
    }

    public static void conteo() {
        Scanner lector = new Scanner(System.in);
        int n = Integer.parseInt(lector.nextLine());// para python = int(input()) 
        int contador_positivo = 0;
        int contador_negativos = 0;
        int contador_cero = 0;

        for (int i = 0; i < n; i++) {
            double valor = Double.parseDouble(lector.nextLine());
            if (valor == 0) {
                contador_cero++;
            } else if (valor > 0) {
                contador_positivo++;
            } else {
                // menor a 0 (negativos)
                contador_negativos++;
            }
        }

        System.out.println("Porcentaje de cero " + (contador_cero * 100 / n));
        System.out.println("Porcentaje de negativo " + (contador_negativos * 100 / n));
        System.out.println("Porcentaje de positivo " + (contador_positivo * 100 / n));
    }

}
