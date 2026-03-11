package lista02;

import java.util.Scanner;

public class Exercicio06_Futebol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite o nome do primeiro time: ");
		String timeUm = teclado.next();
		
		System.out.print("Digite quantos gols ele fez: ");
		int golsUm = teclado.nextInt();
		
		System.out.print("Digite o nome do segundo time: ");
		String timeDois = teclado.next();
		
		System.out.print("Digite quanto gols ele fez: ");
		int golsDois = teclado.nextInt();
		
		if (golsUm > golsDois) {
			System.out.println("O " + timeUm + " vence com " + golsUm + " gols.");
		}
		
		if (golsDois > golsUm) {
			System.out.println("O " + timeDois + " vence com " + golsDois + " gols.");
		} else {
			if (golsUm == golsDois) {
				System.out.println("O jogo terminou em empate.");
			}
		}
		
		teclado.close();
		
		/*
		 * CRIE UM PROGRAMA PARA LER O NOME DE 2 TIMES DE FUTEBOL E O NÚMERO DE GOLS MARCADOS NA
		 * PARTIDA (PARA CADA TIME). ESCREVA O NOME DO VENCEDOR. CASO NÃO HAJA VENCEDOR DEVERÁ SER
		 * IMPRESSA A PALAVRA “EMPATE”.
		 */

	}

}
