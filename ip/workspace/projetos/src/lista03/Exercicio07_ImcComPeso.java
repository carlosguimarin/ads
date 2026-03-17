package lista03;

import java.util.Scanner;

public class Exercicio07_ImcComPeso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite seu peso em kg: ");
		int peso = teclado.nextInt();
		
		System.out.print("Digite sua altura: ");
		double altura = teclado.nextDouble();
		
		double imc = peso / (altura * altura);
		
		if (imc < 18.5) {
			System.out.println("ABAIXO DO PESO");
		} else if (imc >= 18.5 && imc <= 24.9) {
			System.out.println("NORMAL");
		} else if (imc >= 25 && imc <= 29.9) {
			System.out.println("SOBREPESO");
		} else if (imc >= 30 && imc <= 34.9) {
			System.out.println("OBESIDADE – GRAU I");
		} else if (imc >= 35 && imc <= 39.9) {
			System.out.println("OBESIDADE – GRAU II");
		} else if (imc >= 40) {
			System.out.println("OBESIDADE – GRAU III");
		}
		
//		IMC = peso / (altura * altura)
		
		teclado.close();
		
		/*
		 * ESCREVA UM PROGRAMA QUE LEIA O PESO E A ALTURA DE UMA PESSOA E INFORME O SEU IMC (ÍNDICE DE
		 * MASSA CORPORAL) E SUA CLASSIFICAÇÃO CONFORME TABELA ABAIXO.
		 * 
		 * 					IMC 					  CLASSIFICAÇÃO
		 * 				MENOR QUE 18,5 				  ABAIXO DO PESO
		 * 				ENTRE 18,5 E 24,9 				  NORMAL
		 * 				ENTRE 25,0 E 29,9 		   		 SOBREPESO
		 * 				ENTRE 30 E 34,9 			OBESIDADE – GRAU I
		 *				ENTRE 35,0 E 39,9 			OBESIDADE – GRAU II
		 * 				ACIMA OU IGUAL A 40,0 		OBESIDADE – GRAU III
		 */
		
	}

}
