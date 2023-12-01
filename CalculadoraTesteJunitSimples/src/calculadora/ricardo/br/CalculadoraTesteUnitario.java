package calculadora.ricardo.br;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculadoraTesteUnitario {

	
	@Test
	public void calculosomaTeste(){
		
		Calculos calculo = new Calculos();
		
		int soma =calculo.somar(5,20);
		System.out.println(soma);
		
		Assertions.assertEquals(30,soma);
		
	}
	@Test
	public void calculosubtracaoTeste(){
		
		Calculos calculo = new Calculos();
		
		int sub =calculo.subtrair(5,20);
		System.out.println(sub);
		
		Assertions.assertEquals(30,sub);
		
	}
	
	@Test
	public void calculodivisaoTeste(){
		
		Calculos calculo = new Calculos();
		
		double div =calculo.dividir(5,20);
		System.out.println(div);
		
		Assertions.assertEquals(30,div);
		
	}
	@Test
	public void calculoMultiplicacaoTeste(){
		
		Calculos calculo = new Calculos();
		
		int multi =calculo.multiplicar(5,20);
		System.out.println(multi);
		
		Assertions.assertEquals(30,multi);
		
	}
	

}
