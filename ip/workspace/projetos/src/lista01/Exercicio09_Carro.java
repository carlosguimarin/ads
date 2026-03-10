package lista01;

import java.util.Scanner;

public class Exercicio09_Carro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Informe qual o carro você deseja comprar: ");
		String nomeCarro = teclado.nextLine();
		
		System.out.print("Informe o valor de fábrica do carro: ");
		double valorFabrica = teclado.nextDouble();
		
		System.out.println("Então o valor do " + nomeCarro + (" que você deseja comprar sairá por R$ " 
		+ ((valorFabrica * 1.28) * 1.45)));
		
		
//		Distribuidor = 28%
//		Impostos = 45%
				
		/*
		 *  O CUSTO DE UM CARRO NOVO PARA O CONSUMIDOR É A SOMA DO CUSTO DE FÁBRICA COM A PORCENTAGEM
		 *  DO DISTRIBUIDOR E DOS IMPOSTOS (APLICADOS AO CUSTO DE FÁBRICA). SUPONDO QUE O PERCENTUAL DO
		 *  DISTRIBUIDOR SEJA DE 28% E DOS IMPOSTOS DE 45%. ESCREVA UM ALGORITMO PARA LER O MODELO DE UM
		 *  CARRO, O SEU CUSTO DE FÁBRICA E ESCREVA O MODELO DO CARRO E SEU CUSTO FINAL AO CONSUMIDOR. 
		 */
		
		teclado.close();
	
	}

}
