/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modulo2.sesion9;

/**
 *
 * @author Danie
 */
public class Empleado {
    
    private Long id;
    private String  nombre;
    
    private Empleado jefe;

    public Empleado(Long id, String nombre, Empleado jefe) {
        this.id = id;
        this.nombre = nombre;
        this.jefe = jefe;
    }

    public Empleado(Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Empleado getJefe() {
        return jefe;
    }

    public void setJefe(Empleado jefe) {
        this.jefe = jefe;
    }

    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + ", nombre=" + nombre + ", jefe=" + jefe + '}';
    }
    
    
    
}
