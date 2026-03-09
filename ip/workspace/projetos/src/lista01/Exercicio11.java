package lista01;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Informe a nota da prova 1: ");
		double notaUm = teclado.nextDouble();
		
		System.out.print("Informe a nota da prova 2: ");
		double notaDois = teclado.nextDouble();
		
		System.out.print("Informe a nota da prova 3: ");
		double notaTres = teclado.nextDouble();
		
		int pesosNotas = (2 + 3 + 5);
		double notaFinal = ((notaUm*2) + (notaDois*3) + (notaTres*5)) / pesosNotas;
		
		System.out.print("Sua nota final é: " + notaFinal);
				
//		Prova 1: Nota 8,0 (Peso 2) -> 8 x 2 = 16
//		Prova 2: Nota 6,0 (Peso 3) -> 6 x 3 = 18
//		Soma dos produtos: 16 + 18 = 34 
//		Soma dos pesos: 2 + 3 = 5
//		Média Ponderada: 34 / 5 = 6,8

		
		teclado.close();
		
		/*
		 *  FAÇA UM ALGORITMO QUE LEIA TRÊS NOTAS DE UM ALUNO. CALCULE E ESCREVA A MÉDIA FINAL DESTE
		 *  ALUNO. CONSIDERE QUE A MÉDIA É PONDERADA E QUE O PESO DAS NOTAS É RESPECTIVAMENTE 2, 3 E 5. 
		 */

	}

}
