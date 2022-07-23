package modulo2.sesion7;

public class Cuadrado extends Figura {

    private double lado;

    public Cuadrado(double lado, String color) {
        super(color);
        this.lado = lado;
    }

    @Override
    public double calcular_area() {
        return lado * lado;
    }

}
