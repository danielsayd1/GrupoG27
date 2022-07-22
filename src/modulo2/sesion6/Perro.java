package modulo2.sesion6;

public class Perro {

    public int edad;
    public String nombre;
    public String mejorAmigo;

    public float alturaf; // NO ACEPTA NULL
    public Float altura; // ESTE SI

    public boolean isDormido;

    public Perro(int edad, String nombre, String mejorAmigo) {
        this.edad = edad;
        this.nombre = nombre;
        this.mejorAmigo = mejorAmigo;
    }

    public Perro(String nombre) {
        this.nombre = nombre;
    }

    public void ladrar() {
        if (isDormido) {
            System.out.println("Zzzz....");
        } else {
            System.out.println("Woow Wow...");
        }
    }

    public void dormir() {
        this.isDormido = true;
    }

    public void despertar() {
        this.isDormido = false;
    }

    public void conocer(Perro amigo) {
        this.mejorAmigo = amigo.nombre;
        System.out.println(this.nombre+" conoce a "+amigo.nombre);
    }

}
