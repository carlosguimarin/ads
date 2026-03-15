package lista02;

import java.util.Scanner;

public class Exercicio11_NotaConceito {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite a nota da avaliação 1: ");
		double avaliacaoUm = teclado.nextDouble();
		
		System.out.print("Digite a nota da avaliação 2: ");
		double avaliacaoDois = teclado.nextDouble();
		
		System.out.print("Digite a nota da avaliação 3: ");
		double avaliacaoTres = teclado.nextDouble();
		
		System.out.print("Digite a media dos exercícios: ");
		double mediaExercicios = teclado.nextDouble();
		
		double mediaAproveitamento = ((avaliacaoUm + (avaliacaoDois * 2) + (avaliacaoTres * 3) + mediaExercicios)) / 7;
		String notaConceito = "0";
		
		if (mediaAproveitamento >= 9) {
			notaConceito = "A";
		}
		
		if (mediaAproveitamento >= 7.5 && mediaAproveitamento < 9) {
			notaConceito = "B";
		}
		
		if (mediaAproveitamento >= 6 && mediaAproveitamento < 7.5) {
			notaConceito = "C";
		}
		
		else if (mediaAproveitamento < 6) {
			notaConceito = "D";
		}
		
		System.out.println("Você finalizou o semestre com " + notaConceito + ".");
		
		teclado.close();
		
		/*
		 * FAÇA UM PROGRAMA PARA LER AS 3 NOTAS OBTIDAS POR UM ALUNO NAS 3 AVALIAÇÕES E A MÉDIA DOS
		 * EXERCÍCIOS QUE FAZEM PARTE DA AVALIAÇÃO. CALCULE A MÉDIA, USANDO A FÓRMULA ABAIXO E ESCREVA O
		 * CONCEITO DO ALUNO DE ACORDO COM A TABELA DE CONCEITOS MAIS ABAIXO:
		 * 
		 * MÉDIA DE APROVEITAMENTO = (N1 + (N2 * 2) + (N3 * 3) + MÉDIA DOS EXERCÍCIOS)) / 7
		 * 
		 * AATRIBUIÇÃO DE CONCEITOS OBEDECE A TABELA ABAIXO:
		 * 
		 *	   MÉDIA DE APROVEITAMENTO 					    CONCEITO
		 *			> = 9,0 									A
		 *		 > = 7,5 E < 9,0 								B
		 *		 > = 6,0 E < 7,5 								C
		 * 			< 6,0										D
		 */
		
	}

}
