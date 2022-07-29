/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modulo2.sesion10;

import java.util.HashMap;

/**
 *
 * @author Danie
 */
public class Agenda {

    private HashMap<Integer, Persona> listaPersonas;

    public Agenda(HashMap<Integer, Persona> listaPersonas) {
        this.listaPersonas = listaPersonas;
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

    public Integer generarInforme() {
        return listaPersonas.size();
    }

    @Override
    public String toString() {
        return "Agenda:" + " " + listaPersonas;
    }

}
