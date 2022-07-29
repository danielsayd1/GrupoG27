/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modulo2.sesion9;

import java.util.ArrayList;

/**
 *
 * @author Danie
 */
public class Bodega {

    private Integer capacidad;
    private ArrayList<Producto> inventario;
    private String direccion;

    public Bodega(Integer capacidad, ArrayList<Producto> inventario, String direccion) {
        this.capacidad = capacidad;
        this.inventario = inventario;
        this.direccion = direccion;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }

    public ArrayList<Producto> getInventario() {
        return inventario;
    }

    public void setInventario(ArrayList<Producto> inventario) {
        this.inventario = inventario;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Bodega{" + "capacidad=" + capacidad + ", inventario=" + inventario + ", direccion=" + direccion + '}';
    }

    public boolean agregarProducto(Producto producto) {
        if (this.capacidad - this.inventario.size() > 0) {
            this.inventario.add(producto);
            return true;
        } else {
            return false;
        }
    }

    public void agregarProductoVoid(Producto producto) {
        this.inventario.add(producto);
    }

}
