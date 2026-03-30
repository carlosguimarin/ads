package lista04;

import java.util.Scanner;

public class Exercicio03_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite um número entre 1 e 10: ");
		int numero = teclado.nextInt();
		
		if (numero < 0 || numero > 10) {
				System.out.println("Valor inválido, digite um número entre 1 e 10.");
			} else {
				for(int i = 0; i <= 10; i++)
				System.out.println(numero + " x " + i + " = " + i * numero);
			}
		
		teclado.close();
		
		/*
		 * FAÇA UM PROGRAMA PARA LER UM VALOR INTEIRO (ACEITAR SOMENTE VALORES ENTRE 1 E
		 * 10) E ESCREVA A TABUADA DO VALOR LIDO.
		 */
		
	}

}
