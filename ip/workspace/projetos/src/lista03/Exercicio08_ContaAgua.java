package lista03;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio08_ContaAgua {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DecimalFormat formatador = new DecimalFormat("0.00");
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite a leitura do mês corrente em m³: ");
		int mesAtual = teclado.nextInt();
		
		System.out.print("Digite a leitura do mês passado em m³: ");
		int mesPassado = teclado.nextInt();
		
		System.out.print("Digite se o endereço é Residencial ou Predial: ");
		String tipoEndereco = teclado.nextLine();
		
		double taxaMinima = 35;
		double taxaEsgoto = 35;
		double valorMetro = 0;
		
		double valorAgua = ((mesAtual - mesPassado) * valorMetro) + (taxaMinima + taxaEsgoto);
		
		if ((mesAtual - mesPassado) < 10 && tipoEndereco == "Residencial") {
			valorMetro = 1;
		} else if ((mesAtual - mesPassado) >= 10 && (mesAtual - mesPassado) <= 25  && tipoEndereco == "Residencial") {
			valorMetro = 2.50;			
		} else if ((mesAtual - mesPassado) > 25 && tipoEndereco == "Residencial") {
			valorMetro = 4.25;
		} else {
			if ((mesAtual - mesPassado) < 10 && tipoEndereco == "Predial") {
				valorMetro = 1.30;
			} else if ((mesAtual - mesPassado) >= 10 && (mesAtual - mesPassado) <= 25  && tipoEndereco == "Predial") {
				valorMetro = 2.90;			
			} else if ((mesAtual - mesPassado) > 25 && tipoEndereco == "Predial") {
				valorMetro = 4.50;
			}
		}
		
		System.out.println("Você gastou em água R$ " + valorAgua);		
		
		//		leitura atual - leitura anterior
		
		teclado.close();
		
		/*
		 * ESCREVA UM PROGRAMA QUE CALCULE A CONTA DE ÁGUA. PARA ISSO O USUÁRIO IRÁ INFORMAR A LEITURA
		 * ATUAL DO MEDIDOR E A LEITURA DO MÊS PASSADO DO MEDIDOR (EM METROS CÚBICOS – M³). IRÁ INFORMAR SE
		 * A CONTA É RESIDENCIAL OU PREDIAL. CASO A LEITURA SEJA RESIDENCIAL SEGUIRÁ A PRIMEIRA TABELA, CASO
		 * SEJA PREDIAL A LEITURA SEGUE A SEGUNDA TABELA ABAIXO. SABE-SE TAMBÉM QUE EXISTE A TAXA MÍNIMA NO
		 * VALOR DE R$ 35,00 E A TAXA DE COLETA DE ESGOTO NO VALOR DE R$ 35,00 TANTO PARA AS CONTAS
		 * RESIDENCIAIS QUANTO PREDIAIS.
		 * 
		 * 				    CONSUMO RESIDENCIAL 			VALOR POR M³
		 * 					  MENOR DE 10M³ 				  R$ 1,00
		 *					 ENTRE 10 E 25M³ 				  R$ 2,50
		 * 					  ACIMA DE 25M³ 				  R$ 4,25
		 * 
		 * 					 CONSUMO PREDIAL 				VALOR POR M³
		 *					  MENOR DE 10M³ 				  R$ 1,30
		 * 					 ENTRE 10 E 25M³ 				  R$ 2,90
		 * 					  ACIMA DE 25M³					  R$ 4,50
		 */
		
	}

}
