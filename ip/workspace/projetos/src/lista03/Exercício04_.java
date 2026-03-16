package lista03;

import java.util.Scanner;

public class Exercício04_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite seu sexo: ");
		String sexo = teclado.nextLine();
		
		System.out.print("Digite sua altura: ");
		double altura = teclado.nextDouble();
		
		double homemPeso = (72.7 * altura) - 58;
		double mulherPeso = (62.1 * altura) - 44.7;
		
		if (sexo == "Homem" || sexo == "Masculino") {
			System.out.println("O peso ideal deve ser " + (homemPeso) + " kg");
		} else if (sexo == "Mulher" || sexo == "Feminino") {
		
		teclado.close();
		
		/*
		 * ESCREVA UM PROGRAMA QUE LEIA ALTURA E O SEXO DE UMA PESSOA. O PROGRAMA DEVE APRESENTAR O
		 * PESO IDEAL DA PESSOA CONSIDERANDO AS FÓRMULAS ABAIXO:
		 * 
		 * 					HOMEM PESO IDEAL 	= (72,7 * ALTURA) - 58
		 * 					MULHER PESO IDEAL	= (62,1 * ALTURA) - 44,7

		 */
		
	}

}
