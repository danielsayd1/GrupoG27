/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modulo3.sesion14;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Danie
 */
public class BaseDatos {

    private HashMap<Integer, Producto> listaProducto;

    public BaseDatos(HashMap<Integer, Producto> listaProducto) {
        this.listaProducto = listaProducto;

        listaProducto.put(1, new Producto(1, "Manzana", 1500, 11));
        listaProducto.put(2, new Producto(2, "Pera", 150, 1));
        listaProducto.put(3, new Producto(3, "Uva", 150.2, 10));
        listaProducto.put(4, new Producto(4, "Jamon", 1500.23, 10));

    }

    public List<Producto> getListaProducto() {
        return new ArrayList<>(listaProducto.values());
    }

    public void agregar() {

    }

}
