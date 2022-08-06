/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modulo3.sesion15;

import com.sun.org.glassfish.external.probe.provider.annotations.Probe;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Danie
 */
public class BaseDatos {

    private HashMap<Integer, Producto> listaProducto;

    public BaseDatos(HashMap<Integer, Producto> listaProducto) {
        this.listaProducto = listaProducto;
        init();

    }

    private void init() {
        listaProducto.put(1, new Producto(1, "Manzanas", 5000.0, 25));
        listaProducto.put(2, new Producto(2, "Limones", 2300.0, 15));
        listaProducto.put(3, new Producto(3, "Peras", 2700.0, 33));
        listaProducto.put(4, new Producto(4, "Arandanos", 9300.0, 5));
        listaProducto.put(5, new Producto(5, "Tomates", 2100.0, 42));
        listaProducto.put(6, new Producto(6, "Fresas", 4100.0, 3));
        listaProducto.put(7, new Producto(7, "Helado", 4500.0, 41));
        listaProducto.put(8, new Producto(8, "Galletas", 500.0, 8));
        listaProducto.put(9, new Producto(9, "Chocolates", 3500.0, 80));
        listaProducto.put(10, new Producto(10, "Jamon", 15000.0, 10));
    }

    public boolean agregar() {
        return true;
    }

    public String productoMayor() {
        String resultado = "";
        int llave = (new ArrayList<Integer>(listaProducto.keySet())).get(0);
        Producto productoReferencia = listaProducto.get(llave);
        for (Producto x : listaProducto.values()) {
            if (x.getPrecio() > productoReferencia.getPrecio()) {
                productoReferencia = x;
            }
        }
        resultado = productoReferencia.getNombre();
        return resultado;
    }

    public String productoMenor() {
        String resultado = "";
        Producto productoReferencia = null;
        for (Producto x : listaProducto.values()) {
            if (productoReferencia == null) {
                productoReferencia = x;
            } else if (x.getPrecio() < productoReferencia.getPrecio()) {
                productoReferencia = x;
            }

            // if (productoReferencia == null || (x.getPrecio() < productoReferencia.getPrecio()))
        }
        resultado = productoReferencia.getNombre();
        return resultado;
    }

    public double promedio() {
        double resultado = 0d;
        int cantidad = 0;
        for (Producto x : listaProducto.values()) {
            resultado = resultado + x.getPrecio();
            cantidad++;
        }
        resultado = resultado / cantidad;
        return resultado;
    }

    public String generarInforme_3() {
        String resultado = "";
        int llave = (new ArrayList<Integer>(listaProducto.keySet())).get(0);
        Producto productoMayor = listaProducto.get(llave);
        Producto productoMenor = listaProducto.get(llave);
        int cantidad = 0;
        double sumatoria = 0;
        for (Producto x : listaProducto.values()) {
            // Para el mayor
            if (x.getPrecio() > productoMayor.getPrecio()) {
                productoMayor = x;
            }
            // Para el menor
            if (x.getPrecio() < productoMenor.getPrecio()) {
                productoMenor = x;
            }
            // para el Promedio
            sumatoria = sumatoria + x.getPrecio();
            cantidad++;
        }
        double promedio = sumatoria / cantidad;
        resultado = productoMayor.getNombre() + " " + productoMenor.getNombre() + " " + String.format("%.1f", promedio);
        return resultado;
    }

    public String genererInforme_2() {
        String mayor = this.productoMayor();
        String menor = this.productoMenor();
        double promedio = this.promedio();
        return mayor + " " + menor + " " + String.format("%.1f", promedio);
    }

    public String agregar(int codigo, String nombre, double precio, int inventario) {
        if (listaProducto.containsKey(codigo)) {
            return "ERROR";
        } else {
            listaProducto.put(codigo, new Producto(codigo, nombre, precio, inventario));
            return this.genererInforme_2();
        }
    }

    public String borrar(int codigo, String nombre, double precio, int inventario) {
        if (listaProducto.containsKey(codigo)) {
            listaProducto.remove(codigo);
            return this.genererInforme_2();
        } else {
            return "ERROR";
        }
    }

    public String actualizar(int codigo, String nombre, double precio, int inventario) {
        if (listaProducto.containsKey(codigo)) {
            Producto x = listaProducto.get(codigo);
            x.setNombre(nombre);
            x.setPrecio(precio);
            x.setInventario(inventario);
            listaProducto.put(codigo, x);
            return this.genererInforme_2();
        } else {
            return "ERROR";
        }
    }

}
