package modulo2.sesion8;

import junit.framework.Assert;
import org.junit.Test;

/**
 *
 * @author Danie
 */
public class CalculadoraTest {

    public CalculadoraTest() {
    }

    @Test
    public void suma_test() {
        // = new Object
        Calculadora calc = new Calculadora();
        double resultado = calc.getSuma(5, "1");
        Assert.assertEquals(6.0, resultado);
    }

    @Test
    public void suma_test_2() {
        // = new Object
        Calculadora calc = new Calculadora();
        try {
            double resultado = calc.getSuma(5, "perro");
            Assert.assertEquals(5, resultado);
        } catch (Exception e) {
            Assert.assertEquals(0, 0);
        }

    }
}
