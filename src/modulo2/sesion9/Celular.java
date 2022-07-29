/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modulo2.sesion9;

/**
 *
 * @author Danie
 */
public class Celular {

    private String modelo;
    private String marca;
    private String numero;

    private Procesador procesador;

    public Celular(String modelo, String marca, String numero, Procesador procesador) {
        this.modelo = modelo;
        this.marca = marca;
        this.numero = numero;
        this.procesador = procesador;
    }
    
    public Celular(String modelo, String marca, Procesador procesador) {
        this.modelo = modelo;
        this.marca = marca;
        this.procesador = procesador;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Procesador getProcesador() {
        return procesador;
    }

    public void setProcesador(Procesador procesador) {
        this.procesador = procesador;
    }

    @Override
    public String toString() {
        return "Celular{" + "modelo=" + modelo + ", marca=" + marca + ", numero=" + numero + ", procesador=" + procesador + '}';
    }

}
