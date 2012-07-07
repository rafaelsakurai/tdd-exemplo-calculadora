package br.metodista.ead.ads1;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Rafael Guimarães Sakurai
 */
public class CalculadoraTest {

  @Test
  public void testarSoma() {
    Calculadora calc = new Calculadora();

    assertEquals(calc.somar(1,1), 2);
    assertEquals(calc.somar(1,0), 1);
    assertEquals(calc.somar(1,-1), 0);
  }

  @Test
  public void testarSubtracao() {
    Calculadora calc = new Calculadora();
    assertTrue(calc.subtrair(1,1) == 0);
    assertTrue(calc.subtrair(1,-1) == 2);
    assertTrue(calc.subtrair(-1,1) == -2);
  }

  @Test(expected=ArithmeticException.class)
  public void testarDivisao() {
    Calculadora calc = new Calculadora();
    assertEquals(calc.dividir(3,2), 1);
    assertFalse(calc.dividir(3, 3) == 3);
    assertTrue(calc.dividir(3,3) == 1);
    assertTrue(calc.dividir(3, 0) == 0);
  }

  @Test
  public void testarMultiplicacao() {
    Calculadora calc = new Calculadora();
    assertEquals(calc.multiplicar(3, 2), 6);
    assertTrue(calc.multiplicar(3, 3) == 9);
  }
}
