package modulo1;


import java.util.Scanner;

public class Sesion_5 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String linea = lector.nextLine();

        /* 
        String[] arreglo = linea.split(" ");
        System.out.println(arreglo[0]);
        System.out.println(arreglo[1]);
        System.out.println(arreglo[2]);
         */
        double peso = Double.parseDouble(linea.split(" ")[0]);
        double altura = Double.parseDouble(linea.split(" ")[1]);
        int edad = Integer.parseInt(linea.split(" ")[2]);

        /* BigDecimal peso_2 = new BigDecimal(peso).setScale(1,RoundingMode.HALF_UP);
        peso = peso_2.doubleValue();
        System.out.println("--2-> "+peso_2);*/
        if (validar_datos(peso, altura, edad) == true) {
            double imc = calcular_imc(peso, altura);
            String riesgo = calcular_riesgo(edad, imc);
            System.out.println(String.format("%.1f", imc) + " " + riesgo);
        } else {
            System.out.println("ERROR");
        }

    }

    public static double calcular_imc(double peso, double altura) {
        double resultado = 0;
        resultado = peso / Math.pow(altura, 2); // altura*altura
        return resultado;
    }

    public static String calcular_riesgo(int edad, double imc) {
        String respuesta = "";
        if (imc < 22 && edad < 45) {
            respuesta = "Bajo";
        } else {
            respuesta = "Alto";
        }

        return respuesta;
    }

    public static boolean validar_datos(double peso, double altura, int edad) {
        boolean resultado = false;
        if ((peso > 0 && peso < 150) && (altura > 0.1 && altura < 2.5) && (edad > 0 && edad < 110)) {
            resultado = true;
        }
        return resultado;
    }

}
