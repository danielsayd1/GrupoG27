/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package modulo3.sesion15;

import java.util.HashMap;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Danie
 */
public class BaseDatosTest {

    private BaseDatos db;

    @Before
    public void init() {
        db = new BaseDatos(new HashMap<>());
    }

    @Test
    public void agregarTest() {
        db.agregar(11, "Melon", 70, 13);
        assertEquals(db.genererInforme_2(), "Jamon Melon 4460.9");
        assertEquals(db.generarInforme_3(), "Jamon Melon 4460.9");
        
        assertEquals(db.productoMayor(), "Jamon");
        assertEquals(db.productoMenor(), "Melon");
        assertEquals(String.format("%.1f",db.promedio()), "4460.9");
    }

    @Test
    public void borrarTest() {
        assertEquals(db.borrar(10, "Jamon", 15000, 10), "Arandanos Galletas 3777.8");
        
    }

    @Test
    public void actualizarTest() {
        assertEquals(db.actualizar(7, "Helado", 65000, 11), "Helado Galletas 10950.0");
    }

    @Test
    public void borrarErrorTest() {
        assertEquals(db.borrar(14, "Maiz", 45000, 12), "ERROR");
    }
}
