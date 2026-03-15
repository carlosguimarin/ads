package lista03;

import java.util.Scanner;

public class Exercicio01_DiaSemana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite um número de 1 à 7: ");
		int numeroSemana = teclado.nextInt();
		
		switch (numeroSemana) {
			case 1: {
				System.out.println("Segunda-Feira");
				break;
			}
			case 2: {
				System.out.println("Terça-Feira");
				break;
			}
			case 3: {
				System.out.println("Quarta-Feira");
				break;
			}
			case 4: {
				System.out.println("Quinta-Feira");
				break;
			}
			case 5: {
				System.out.println("Sexta-Feira");
				break;
			}
			case 6: {
				System.out.println("Sábado");
				break;
			}
			case 7: {
				System.out.println("Domingo");
				break;
			}
		}
		
		teclado.close();
		
		/*
		 * DESENVOLVA UM PROGRAMA ONDE O USUÁRIO IRÁ DIGITAR UM NÚMERO DE 1 A 7 E O PROGRAMA DEVERÁ
		 * APRESENTAR O DIA DA SEMANA ESCRITO POR EXTENSO (1 – DOMINGO, 2 – SEGUNDA, 3 – TERÇA...).
		 */
				
		
	}

}
