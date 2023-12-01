package calculadora.ricardo.br;

import java.util.Scanner;

public class Calculos {
	int a, b;
	Scanner scan = new Scanner(System.in);

	
	public int somar(int a, int b) {

		return a + b;
	}

	public int subtrair(int a, int b) {

		return a - b;
	}

	public int multiplicar(int a, int b) {

		return a * b;

	}

	public double dividir(double a, double b) {
		 if (b != 0) {
	            return a/b;
	        } else {
	            throw new ArithmeticException("Divisão por zero não é permitida");
	        }
	}

	}


