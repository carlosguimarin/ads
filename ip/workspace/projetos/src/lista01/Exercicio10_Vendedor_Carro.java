package lista01;

import java.util.Scanner;

public class Exercicio10_Vendedor_Carro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Informe o seu salário fixo: ");
		double salarioFixo = teclado.nextDouble();
		
		System.out.print("Informe sua comissão fixa por carro vendido: ");
		double comissaoFixa = teclado.nextDouble();
		
		System.out.print("Informe o número de carros vendidos: ");
		int carrosVendidos = teclado.nextInt();
		
		System.out.print("Informe o valor total de sua vendas: ");
		double valorTotal = teclado.nextDouble();
		
		double salarioFinal = (salarioFixo + (comissaoFixa * carrosVendidos) + (valorTotal * 0.05));
		
		System.out.print("O total do seu salário final será R$ " + salarioFinal);
		
		teclado.close();
		
//		Comissão Fixa
//		5% do valor total de vendas
//		
//		USUÁRIO PRECISA INFORMAR
				
//		NÚMERO DE CARROS VENDIDOS
//		VALOR DE SUAS VENDAS
//		SALÁRIO FIXO
//		VALOR QUE RECEBE POR CARRO VENDIDO = VALOR CARRO * COMISSAO FIXA
//		
//		APRESENTAR SALÁRIO FINAL
		
		/*
		 * UMA REVENDEDORA DE CARROS USADOS PAGA AO SEU VENDEDOR UM SALÁRIO FIXO POR MÊS, MAIS UMA
		 * COMISSÃO FIXA PARA CADA CARRO VENDIDO E MAIS 5% DO VALOR DAS VENDAS POR ELE EFETUADAS. ESCREVA
		 * UM ALGORITMO QUE LEIA O NÚMERO DE CARROS POR ELE VENDIDOS, O VALOR TOTAL DE SUAS VENDAS, O
		 * SALÁRIO FIXO E O VALOR QUE ELE RECEBE POR CARRO VENDIDO. O ALGORITMO DEVE CALCULAR E
		 * APRESENTAR O SALÁRIO FINAL DO VENDEDOR.
		 */
	}

}
