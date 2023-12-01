package calculadora.ricardo.br;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Calculos calculo = new Calculos();
		int x,a,b;
		Scanner scan = new Scanner(System.in);

		System.out.println("Qual operacao voce quer fazer?");
		System.out.println("1-Soma\n" + "2-Subtracao\n" + "3-divisao\n" + "4-multiplicação\n"+ "5-Potência");
		x = scan.nextInt();
		if (x == 1) {
			System.out.println("Digite dois Valores:");
			a = scan.nextInt();
			b = scan.nextInt();
			calculo.somar(a,b);
			
		}
		if (x == 2) {
			System.out.println("Digite dois Valores:");
			a = scan.nextInt();
			b = scan.nextInt();
			calculo.subtrair(a,b);
		}
		if (x == 3) {
			System.out.println("Digite dois Valores:");
			a = scan.nextInt();
			b = scan.nextInt();
			calculo.dividir(a,b);
		}
		if (x == 4) {
			System.out.println("Digite dois Valores:");
			a = scan.nextInt();
			b = scan.nextInt();
			calculo.multiplicar(a,b);
		}
		
	}

}
