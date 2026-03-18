package lista03;

import java.util.Scanner;

public class Exercicio06_Detetive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("CONSIDERE SIM OU NAO PARA AS PERGUNTAS A SEGUIR:");
		
		System.out.println("VOCÊ JÁ TRABALHOU COM A VÍTIMA? ");
		
		System.out.println("VOCÊ TELEFONOU PARA A VÍTIMA? ");
		
		System.out.println("VOCÊ MORA PRÓXIMA A VÍTIMA? ");
		
		System.out.println("VOCÊ DEVIA DINHEIRO A VÍTIMA? ");
		
		System.out.println("VOCÊ ESTEVE NO LOCAL DO CRIME? ");
		
		System.out.print("QUANTAS RESPOSTA SERÃO SIM: ");
		int resposta = teclado.nextInt();
		
		if (resposta <= 1 && resposta == 0) {
			System.out.println("INOCENTE");
		} else if (resposta == 2) {
			System.out.println("SUSPEITA");
		} else if (resposta >= 3 && resposta <= 4) {
			System.out.println("CÚMPLICE");
		} else if (resposta == 5) {
			System.out.println("ASSASSINO");
		}
		
		teclado.close();
		
		/*
		 * DESENVOLVA UM PROGRAMA QUE FAÇA CINCO PERGUNTAS INVESTIGATIVAS SOBRE UM CRIME. AS
		 * PERGUNTAS SÃO:
		 * 
		 * • VOCÊ JÁ TRABALHOU COM A VÍTIMA?
		 * • VOCÊ TELEFONOU PARA A VÍTIMA?
		 * • VOCÊ MORA PRÓXIMA A VÍTIMA?
		 * • VOCÊ DEVIA DINHEIRO A VÍTIMA?
		 * • VOCÊ ESTEVE NO LOCAL DO CRIME?
		 * 
		 * O PROGRAMA AO FINAL DEVE EMITIR UMA CLASSIFICAÇÃO SOBRE A PARTICIPAÇÃO DO ENTREVISTADO NO CRIME
		 * SEGUNDO A TABELA ABAIXO:
		 * 
		 * 					QUANTIDADE DE SIM		 CLASSIFICAÇÃO
		 * 						0 OU 1 				   INOCENTE
		 * 						  2 				   SUSPEITA
		 * 						3 OU 4 				   CÚMPLICE
		 * 						  5 				   ASSASSINO
		 */
		
	}

}
