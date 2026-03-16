package lista03;

import java.util.Scanner;

public class Exercicio03_AnoBissexto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite o ano: ");
		int anoQuestao = teclado.nextInt();
		
		if (anoQuestao % 400 == 0) {
			System.out.print("Ano bissexto");
		}
		else if (anoQuestao % 100 == 0) {
			System.out.print("Não é bissexto");
		}
		else if (anoQuestao % 4 == 0) {
			System.out.print("Ano bissexto");
		}
		else {
			System.out.print("Não é bissexto");
		}
		
		teclado.close();
		
		/*
		 * FAÇA UM PROGRAMA ONDE O USUÁRIO IRÁ INFORMAR UM ANO E O PROGRAMA INFORMARÁ SE ESSE ANO É
		 * UM ANO BISSEXTO.
		 */
		
	}

}
