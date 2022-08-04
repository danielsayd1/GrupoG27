/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modulo2.sesion10;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Danie
 */
public class Main {

    public static void main(String[] args) {
        int ID = 0;
        int NOMBRE = 1;
        int DIRECCION = 2;
        int TELEFONO = 3;

        Scanner lector = new Scanner(System.in);

        Agenda agenda = new Agenda(new HashMap<>());

        agenda.agregar(1, "Carlos", "Calle falsa", "123");
        agenda.agregar(2, "Marta", "Carrera  falsa", "123123");
        agenda.agregar(3, "Ana", "Av falsa", "3444");
        agenda.agregar(4, "Susan", " falsa", "123999");

        String operacion = lector.nextLine().toUpperCase(); // lector.nextLine() = read()

        if (operacion.equals("AGREGAR")) {
            String[] datosPersona = lector.nextLine().split(" ");
            if (agenda.agregar(Integer.parseInt(datosPersona[ID]), datosPersona[NOMBRE], datosPersona[DIRECCION], datosPersona[TELEFONO])) {
                System.out.println(agenda.generarInforme());
            } else {
                System.out.println("ERROR");
            }

        } else if ("ACTUALIZAR".equals(operacion)) {
            String[] datosPersona = lector.nextLine().split(" ");
            boolean resultado = agenda.actualizar(Integer.parseInt(datosPersona[ID]), datosPersona[DIRECCION], datosPersona[TELEFONO]);
            System.out.println(resultado ? agenda.generarInforme() : "ERROR");

        } else if ("ELIMINAR".equals(operacion)) {
            String[] datosPersona = lector.nextLine().split(" ");
            boolean resultado = agenda.eliminar(Integer.parseInt(datosPersona[ID]), datosPersona[NOMBRE], datosPersona[DIRECCION], datosPersona[TELEFONO]);
            if (resultado) {
                System.out.println(agenda.generarInforme());
            } else {
                System.out.println("ERROR");
            }

        } else {
            System.out.println("ERROR");
        }

        System.out.println(agenda);

    }

}

class Persona {

    private int id;
    private String nombre;
    private String direccion;
    private String telefono;

    public Persona(int id, String nombre, String direccion, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "{" + "id=" + id + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono + '}';
    }

}

class Agenda {

    private HashMap<Integer, Persona> listaPersonas;

    public Agenda(HashMap<Integer, Persona> listaPersonas) {
        this.listaPersonas = listaPersonas;

        iniciarItems();
    }

    public double generarInforme() {
        double valorInventario = 0;
        for (Persona p : listaPersonas.values()) {
            //valorInventario = p.getDireccion()+p.getTelefono();
        }

        return valorInventario;
    }

    private void iniciarItems() {
        this.agregar(1, "Carlos", "Calle falsa", "123");
        this.agregar(2, "Marta", "Carrera  falsa", "123123");
        this.agregar(3, "Ana", "Av falsa", "3444");
        this.agregar(4, "Susan", " falsa", "123999");
    }

    public boolean verificarExistencia(int id) {
        boolean resultado = false;
        Persona persona_x = listaPersonas.get(id);
        resultado = (persona_x != null); // True o False
        return resultado;
    }

    public boolean agregar(int id, String nombre, String direccion, String telefono) {
        if (this.verificarExistencia(id)) {
            return false;
        } else {
            Persona persona = new Persona(id, nombre, direccion, telefono);
            listaPersonas.put(id, persona);
            return true;
        }
    }

    public boolean actualizar(int id, String direccion, String telefono) {
        if (this.verificarExistencia(id)) {
            Persona persona = listaPersonas.get(id);
            persona.setDireccion(direccion);
            persona.setTelefono(telefono);
            listaPersonas.put(id, persona);        // re-escribo    
            return true;
        } else {
            return false;
        }
    }

    public boolean eliminar(int id, String nombre, String direccion, String telefono) {
        if (this.verificarExistencia(id)) {
            listaPersonas.remove(id);
            return true;
        } else {
            return false;
        }
    }


    @Override
    public String toString() {
        return "Agenda:" + " " + listaPersonas;
    }

}
