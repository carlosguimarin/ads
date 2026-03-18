package lista03;

import java.util.Scanner;

public class Exercicio05_CaixaEletronico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Informe o valor que deseja sacar: ");
		int valor = teclado.nextInt();
		
		if (valor < 10 || valor > 1000) {
			System.out.println("Valor inválido. Mínimo: 10 | Máximo: 1000");
		} else {
			
			int notas100 = valor / 100;
			valor = valor % 100;
			
			int notas50 = valor / 50;
			valor = valor % 50;
			
			int notas10 = valor / 10;
			valor = valor % 10;
			
			int notas5 = valor / 5;
			valor = valor % 5;
			
			int notas1 = valor / 1;
		
		if (notas100 > 0) {
			System.out.println("Notas de 100: " + notas100);
		}
		if (notas50 > 0) {
			System.out.println("Notas de 50: " + notas50);
		}
		if (notas10 > 0) {
			System.out.println("Notas de 10: " + notas10);
		}
		if (notas5 > 0) {
			System.out.println("Notas de 5: " + notas5);
		}
		if (notas1 > 0) {
			System.out.println("Notas de 1: " + notas1);
		}
						
		}
		
		teclado.close();
		
		/*
		 * FAÇA UM PROGRAMA PARA SIMULAR O SAQUE EM UM CAIXA ELETRÔNICO. O USUÁRIO IRÁ INFORMAR O
		 * VALOR QUE DESEJA SACAR E O PROGRAMA IRÁ INFORMAR QUANTAS NOTAS DE CADA VALOR SERÃO
		 * FORNECIDAS. AS NOTAS DISPONÍVEIS SERÃO DE 1, 5, 10, 50 E 100 REAIS. O VALOR MÍNIMO É DE R$ 10,00 E O
		 * MÁXIMO DE R$ 1000,00.
		 * EXEMPLO: PARA SACAR A QUANTIA DE R$ 245,00, O PROGRAMA DEVE FORNECER DUAS NOTAS DE R$ 100,00,
		 * QUATRO NOTAS DE R$ 10,00 E UMA NOTA DE R$ 5,00.
		 */
		
	}

}
