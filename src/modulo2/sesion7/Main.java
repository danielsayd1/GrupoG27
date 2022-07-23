package modulo2.sesion7;

public class Main {

    private final int NUMERO = 10;

    public static void main(String[] args) {

        Figura cuadrado_1 = new Cuadrado(3, "Rojo");
        System.out.println(cuadrado_1.calcular_area());
        System.out.println(cuadrado_1.getColor());
        

        Gato animal_1 = new Gato("Rojo", 20, 123.2);
        animal_1.dormir();
        System.out.println("Es Gato? " + (animal_1 instanceof Gato));
        System.out.println("Es Animal? " + (animal_1 instanceof Animal));
        animal_1.alimentar("Pez");
        animal_1.alimentar(5,"Carne");

    }

    public static void prueba_animal() {
        Animal.hacerRuido();

        Gato gato_1 = new Gato("Micho", null, "Javier", null, 3, 25.2);

        Gato.hacerRuido();
        //Gato.getColor();

        System.out.println(gato_1.getColor());
        System.out.println(gato_1.getEdad());
        System.out.println(gato_1.getAltura());

        System.out.println(gato_1.getNombre());
        System.out.println(gato_1.getDueno());
    }
}
