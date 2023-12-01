package calculadora.ricardo.br;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTesteSistemaIntegração {

    @Test
    public void testIntegracaoOperacoes() {
        Calculos calculadora = new Calculos();
        int resultado = calculadora.somar(3, 4);
        resultado = calculadora.multiplicar(resultado, 2);
        assertEquals(14, resultado, 0.0001);
    }

}
