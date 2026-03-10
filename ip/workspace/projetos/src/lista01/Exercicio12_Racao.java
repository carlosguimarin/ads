package lista01;

import java.util.Scanner;

public class Exercicio12_Racao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Informe quantos Kg tem o saco de ração: ");
		double racaoKG = teclado.nextDouble();
		
		System.out.print("Qual a quantidade de ração fornecida para cada gato em gramas: ");
		double racaoGramas= teclado.nextDouble();
		
		System.out.print("Após 5 dias você tem " + ((racaoKG * 1000) - ((racaoGramas * 2) * 5)) + " gramas de ração.");
		
		// KG PARA GRAMAS = 1KG = 1000G
		
		/*
		 * MARIAZINHA COMPROU UM SACO DE RAÇÃO PARA GATOS COM PESO EM QUILOS. ELA POSSUI DOIS GATOS,
		 * O CARAMELO E O FRAJOLA, PARA OS QUAIS FORNECE A QUANTIDADE DE RAÇÃO EM GRAMAS. A QUANTIDADE
		 * DIÁRIA DE RAÇÃO FORNECIDA PARA CADA GATO É SEMPRE A MESMA. FAÇA UM ALGORITMO QUE RECEBA O PESO
		 * DO SACO DE RAÇÃO E A QUANTIDADE DE RAÇÃO FORNECIDA PARA CADA GATO, CALCULE O APRESENTE QUANTO
		 * RESTARÁ DE RAÇÃO NO SACO APÓS CINCO DIAS.
		 */
		
		teclado.close();
	}

}
