package lista02;

import java.util.Scanner;

public class Exercicio03_TorneioXadrez {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite a hora de início do torneio: ");
		int horaInicio = teclado.nextInt();
		
		System.out.print("Digite a hora de fim do torneio: ");
		int horaFim = teclado.nextInt();
		
		if (horaFim > horaInicio) {
			System.out.println("O torneio durou " + (horaFim - horaInicio) + " horas.");
			
		} else {
			if (horaInicio > horaFim) {
				System.out.println("O torneiro durou " + ((24 - horaInicio) + horaFim) + " horas.");
			}
			
		}		
		
		teclado.close();
		
		/*
		 *  CRIE UM PROGRAMA QUE LEIA A HORA DE INÍCIO E A HORA DE FIM DE UM JOGO DE XADREZ (CONSIDERE
		 *  APENAS HORAS INTEIRAS, SEM OS MINUTOS) E CALCULE A DURAÇÃO DO JOGO EM HORAS, SABENDO-SE QUE O
		 *  TEMPO MÁXIMO DE DURAÇÃO DO JOGO É DE 24 HORAS E QUE O JOGO PODE INICIAR EM UM DIA E TERMINAR NO DIA SEGUINTE.
		 */
		
	}

}
