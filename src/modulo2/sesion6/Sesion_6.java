package modulo2.sesion6;

public class Sesion_6 {

    public static void main(String[] args) {

        Gato michi = new Gato(10, "Michi", null);

        System.out.println(michi.getNombre());
        System.out.println(michi.getEdad());
        System.out.println(michi.getMejorAmigo());
        
        michi.setMejorAmigo("Carlos");
        System.out.println(michi.getMejorAmigo());

    }

    public static void prueba_perro() {

        Perro miPerro = new Perro("Milo");
        miPerro.ladrar();

        System.out.println(miPerro.nombre);
        System.out.println(miPerro.mejorAmigo);
        System.out.println(miPerro.edad);
        System.out.println(miPerro.altura);
        System.out.println(miPerro.alturaf);

        System.out.println("---------------------------------------------------------");

        Perro miPerro_2 = new Perro(7, "lucho", "Milo");
        miPerro_2.ladrar();
        System.out.println("Dormir");
        miPerro_2.dormir();
        System.out.println(miPerro_2.isDormido);
        miPerro_2.ladrar();
        System.out.println("Despertar");
        miPerro_2.despertar();
        System.out.println(miPerro_2.isDormido);
        miPerro_2.ladrar();

        System.out.println(miPerro_2.nombre);
        System.out.println(miPerro_2.mejorAmigo);
        System.out.println(miPerro_2.edad);

        System.out.println("---------------------------------------------------------");

        miPerro.conocer(miPerro_2);
        System.out.println(miPerro.nombre);
        System.out.println(miPerro.mejorAmigo);
    }
}
