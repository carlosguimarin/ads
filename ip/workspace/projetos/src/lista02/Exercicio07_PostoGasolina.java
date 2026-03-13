package lista02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio07_PostoGasolina {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DecimalFormat formatador = new DecimalFormat("0.00");
		Scanner teclado = new Scanner(System.in);

		System.out.print("Digite o combustível abastecido com A para Ácool e G para Gasolina: ");
		String combustivel = teclado.nextLine();

		System.out.print("Digite quantos litros foram abastecidos: ");
		double litrosAbastecidos = teclado.nextDouble();

		double alcool = 6.20;
		double gasolina = 6.90;
		
		switch(combustivel) {
			case "A": { 
				if (litrosAbastecidos <= 20) {
					System.out.println("Total a pagar: R$ " + formatador.format((litrosAbastecidos * alcool) * 0.97));
				} else {
					System.out.println("Total a pagar: R$ " + formatador.format((litrosAbastecidos * alcool) * 0.95));
				}
				break;
			}
			case "G": {
				if (litrosAbastecidos <= 20) {
					System.out.println("Total a pagar: R$ " + formatador.format((litrosAbastecidos * gasolina) * 0.96));
				} else {
					System.out.println("Total a pagar: R$ " + formatador.format((litrosAbastecidos * gasolina) * 0.94));
				}
				break;
			}
		}
		
//		if (combustivel.equals("A")) {
//
//		    if (litrosAbastecidos <= 20) {
//		        System.out.println("Total a pagar: R$ " + formatador.format((litrosAbastecidos * alcool) * 0.97));
//		    } else {
//		        System.out.println("Total a pagar: R$ " + formatador.format((litrosAbastecidos * alcool) * 0.95));
//		    }
//
//		} else if (combustivel.equals("G")) {
//
//		    if (litrosAbastecidos <= 20) {
//		        System.out.println("Total a pagar: R$ " + formatador.format((litrosAbastecidos * gasolina) * 0.96));
//		    } else {
//		        System.out.println("Total a pagar: R$ " + formatador.format((litrosAbastecidos * gasolina) * 0.94));
//		    }
//
//		}
		
		teclado.close();
		
		/*
		 * UM POSTO DE COMBUSTÍVEL ESTÁ VENDENDO SEUS COMBUSTÍVEIS COM A SEGUINTE TABELA
		 * DE DESCONTOS:
		 * 
		 * ÁLCOOL ATÉ 20 LITROS, DESCONTO DE 3% POR LITRO ACIMA DE 20 LITROS, DESCONTO
		 * DE 5% POR LITRO
		 * 
		 * GASOLINA ATÉ 20 LITROS, DESCONTO DE 4% POR LITRO ACIMA DE 20 LITROS, DESCONTO
		 * DE 6% POR LITRO
		 * 
		 * DESENVOLVA UM PROGRAMA QUE LEIA O NÚMERO DE LITROS VENDIDOS E O TIPO DE
		 * COMBUSTÍVEL (CODIFICADO DA SEGUINTE FORMA: A -> ÁLCOOL, G -> GASOLINA),
		 * CALCULE E IMPRIMA O VALOR A SER PAGO PELO CLIENTE SABENDO-SE QUE O PREÇO DO
		 * LITRO DA GASOLINA É R$ 6,90 E O PREÇO DO LITRO DO ÁLCOOL É R$ 6,20.
		 */
	}
}