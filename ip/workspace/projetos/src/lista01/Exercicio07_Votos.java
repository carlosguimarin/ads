package lista01;

import java.util.Scanner;

public class Exercicio07_Votos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Informe o número de votos válidos: ");
		int votosValidos = teclado.nextInt();
		
		System.out.print("Informe o número de votos brancos: ");
		int votosBrancos = teclado.nextInt();
		
		System.out.print("Informe o número de votos nulos: ");
		int votosNulos = teclado.nextInt();
		
		int votosTotal = (votosValidos + votosBrancos + votosNulos);
		
		System.out.print("Caro usuário o número total de votos foram "+ (votosTotal) + " e deste total " 
		+ ((votosValidos*100)/votosTotal) + "% dos votos computados foram válidos " 
		+ ((votosBrancos*100)/votosTotal) + "% dos votos computados foram brancos e " 
		+ ((votosNulos*100)/votosTotal) + "% dos votos computados foram nulos.");
				
		teclado.close();
		
		/*
		 *  CRIE UM ALGORITMO PARA LER O NÚMERO TOTAL DE ELEITORES DE UM MUNICÍPIO, O NÚMERO DE VOTOS
		 *  BRANCOS, NULOS E VÁLIDOS. O ALGORITMO DEVE CALCULAR E ESCREVER O PERCENTUAL QUE CADA UM
		 *  REPRESENTA EM RELAÇÃO AO TOTAL DE ELEITORES. 
		 */
	}

}
