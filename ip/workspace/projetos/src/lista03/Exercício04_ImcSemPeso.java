package lista03;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercício04_ImcSemPeso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DecimalFormat formatador = new DecimalFormat("0.00");
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite seu sexo com M para Masculino ou F para Feminino: ");
		String sexo = teclado.nextLine();
		
		System.out.print("Digite sua altura: ");
		double altura = teclado.nextDouble();
		
		double homemPeso = (72.7 * altura) - 58;
		double mulherPeso = (62.1 * altura) - 44.7;
		
		switch(sexo) {
			case "M": {
				System.out.println("O peso ideal deve ser " + formatador.format(homemPeso) + " kg");
				break;
			}
			case "F": {
				System.out.println("O peso ideal deve ser " + formatador.format(mulherPeso) + " kg");
				break;
			}
		}
		
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
