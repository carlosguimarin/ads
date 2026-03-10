package lista02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio02_NotaAprovacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DecimalFormat formatador = new DecimalFormat("0.00");
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite a nota da primeira avaliação: ");
		double notaUm = teclado.nextDouble();
		
		System.out.print("Digite a nota da segunda avaliação: ");
		double notaDois = teclado.nextDouble();
		
		double mediaAritmetica = ((notaUm + notaDois)/2);
		
			if (mediaAritmetica >= 7) {
				System.out.println("Você foi aprovado com a nota " + formatador.format(mediaAritmetica) + ".");
				
			} else {
				if (mediaAritmetica < 7) {
					System.out.println("Você foi reprovado pois sua média ficou em " + formatador.format(mediaAritmetica) + " que é menor que 7,00.");
				}
			
			}
		
		teclado.close();
		
		/*
		 *  DESENVOLVA UM PROGRAMA QUE LEIA AS NOTAS DA 1ª E 2ª AVALIAÇÕES DE UM ALUNO. CALCULE A MÉDIA
		 *  ARITMÉTICA SIMPLES E ESCREVA UMA MENSAGEM QUE DIGA SE O ALUNO FOI OU NÃO APROVADO (CONSIDERAR
		 *  QUE NOTA IGUAL OU MAIOR QUE 7 O ALUNO É APROVADO). ESCREVA TAMBÉM A MÉDIA CALCULADA.

		 */
		
	}

}
