package lista04;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio01_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("0.00");
		
		double numeroDois = 0;
		double numeroUm = 0;
		
		do {
			System.out.print("Informe o primeiro número: ");
			numeroUm = teclado.nextInt();
				
			System.out.print("Informe o segundo número: ");
			numeroDois = teclado.nextInt();
		
			if (numeroDois == 0) {
				System.out.println("VALOR INVÁLIDO!");
			}
		} while (numeroDois == 0); 
		 
		System.out.println("O resultado da divisão é igual à " + formatador.format(numeroUm / numeroDois));
		
		teclado.close();
		
		/*
		 * DESENVOLVA UM PROGRAMA PARA LER 2 NÚMEROS. SE O SEGUNDO NÚMERO INFORMADO FOR “0” (ZERO),
		 * O PROGRAMA DEVERÁ APRESENTAR A MENSAGEM DE “VALOR INVÁLIDO!”, E DEVE LER O SEGUNDO NÚMERO
		 * NOVAMENTE, OU SEJA, O PROGRAMA NÃO PODE ACEITAR O VALOR ZERO PARA O SEGUNDO NÚMERO. O
		 * PROGRAMA DEVE IMPRIMIR O RESULTADO DA DIVISÃO DO PRIMEIRO NÚMERO PELO SEGUNDO NÚMERO.
		 */
		
		
	}

}
