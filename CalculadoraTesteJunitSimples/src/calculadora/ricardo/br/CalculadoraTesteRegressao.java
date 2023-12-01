package calculadora.ricardo.br;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTesteRegressao {

	public class TesteRegressao {

	    @Test
	    public void testRegressaoSomar() {
	        Calculos calculadora = new Calculos();
	        double resultado = calculadora.somar(3, 4);
	        assertEquals(7, resultado, 0.0001);
	    }

	    @Test
	    public void testRegressaoSubtrair() {
	        Calculos calculadora = new Calculos();
	        double resultado = calculadora.subtrair(8, 3);
	        assertEquals(5, resultado, 0.0001);
	    }

	    @Test
	    public void testRegressaoMultiplicar() {
	        Calculos calculadora = new Calculos();
	        double resultado = calculadora.multiplicar(2, 5);
	        assertEquals(10, resultado, 0.0001);
	    }

	    @Test
	    public void testRegressaoDividir() {
	        Calculos calculadora = new Calculos();
	        double resultado = calculadora.dividir(10, 2);
	        assertEquals(5, resultado, 0.0001);
	    }
	}
}
