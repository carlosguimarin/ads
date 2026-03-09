package lista01;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Informe sua idade em anos completados: ");
		int idadeAnos = teclado.nextInt();
				
		System.out.print("Informe sua idade em meses completados: ");
		int idadeMeses = teclado.nextInt();
		
		System.out.print("Informe sua idade em dias completados: ");
		int idadeDias = teclado.nextInt();

		System.out.print("Sua idade total em dias é igual à " + ((idadeAnos * 365) + (idadeMeses * 30) + (idadeDias)));
		
		teclado.close();
		
		/*
		 * CRIE UM ALGORITMO QUE LEIA A IDADE DE UMA PESSOA EXPRESSA EM ANOS, MESES E DIAS E ESCREVA A
           IDADE DESSA PESSOA EXPRESSA APENAS EM DIAS. CONSIDERAR O ANO COM 365 DIAS E OS MESES COM 30
           DIAS.
		 */
	}

}
