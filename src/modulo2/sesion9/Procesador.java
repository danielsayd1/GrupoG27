/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modulo2.sesion9;

/**
 *
 * @author Danie
 */
public class Procesador {

    private Long id;
    private Double velocidad;
    private String modelo;

    public Procesador(Long id, Double velocidad, String modelo) {
        this.id = id;
        this.velocidad = velocidad;
        this.modelo = modelo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(Double velocidad) {
        this.velocidad = velocidad;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Procesador{" + "id=" + id + ", velocidad=" + velocidad + ", modelo=" + modelo + '}';
    }

    
}
