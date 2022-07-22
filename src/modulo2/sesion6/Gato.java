package modulo2.sesion6;

public class Gato {

    private int edad;
    private String nombre;
    private String mejorAmigo;

    public Gato(int edad, String nombre, String mejorAmigo) {
        this.edad = edad;
        this.nombre = nombre;
        this.mejorAmigo = mejorAmigo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMejorAmigo() {
        return mejorAmigo == null ? "No tiene amigos" : mejorAmigo;
    }

    public void setMejorAmigo(String mejorAmigo) {
        this.mejorAmigo = mejorAmigo;
    }

}
