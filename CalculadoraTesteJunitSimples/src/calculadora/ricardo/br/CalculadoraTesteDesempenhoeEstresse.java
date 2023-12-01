package calculadora.ricardo.br;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTesteDesempenhoeEstresse {

	
	@Test
	public void testDesempenhoeEestresseOperacoes() {
	Calculos calculadora = new Calculos();
	long startTime = System.currentTimeMillis();{

	for(int i = 0;i<1000000;i++)
	{
		calculadora.somar(3, 4);
	}

	long endTime = System.currentTimeMillis();
	long tempoTotal = endTime - startTime;

	// Medição do desempenho
	System.out.println("Tempo total para 1.000.000 somas: "+tempoTotal+" milissegundos");}
	}			
}
