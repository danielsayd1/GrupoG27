package modulo2.sesion7;

public  class Animal {

    private String  color;
    private int edad;
    private double altura;

    public Animal(String color, int edad, double altura) {
        this.color = color;
        this.edad = edad;
        this.altura = altura;
    }

    public Animal(String color, int edad) {
        this.color = color;
        this.edad = edad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public static void hacerRuido() {
        System.out.println("grrrrr");
    }
    
    public void dormir(){
        System.out.println("ZZZZZZZZZZ");
    }

}
