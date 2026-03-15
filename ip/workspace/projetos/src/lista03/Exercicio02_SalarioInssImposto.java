package lista03;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio02_SalarioInssImposto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DecimalFormat formatador = new DecimalFormat("0.00");
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite seu salário bruto: ");
		double salarioBruto = teclado.nextDouble();
		
		double percentualImposto;
		
		if (salarioBruto < 1000) {
			percentualImposto = 0.05;
		} else if (salarioBruto >= 1000 && salarioBruto <= 3000) {
			percentualImposto = 0.10;
		} else {
			percentualImposto = 0.20;
		}
		
		double salarioDescontadoInss = (salarioBruto * 0.90);
		double impostos = salarioDescontadoInss * percentualImposto;
		
		System.out.println("Seu salário líquido será: R$ " + formatador.format(salarioDescontadoInss - impostos));
		
		teclado.close();
		
		/*
		 * FAÇA UM PROGRAMA QUE CALCULE E APRESENTE O SALÁRIO LÍQUIDO DE UM FUNCIONÁRIO. O USUÁRIO IRÁ
		 * INFORMAR O SALÁRIO BRUTO. SABE-SE QUE O DESCONTO DO INSS CORRESPONDE A DE 10% DO SALÁRIO
		 * BRUTO E O IMPOSTO DE RENDA SEGUE A TABELA ABAIXO:
		 * 
		 *							 SALÁRIO (DESCONTADO O INSS) 			  IMPOSTO
		 * 								MENOR QUE R$ 1000,00 					5%
		 * 							ENTRE R$ 1000,00 E R$ 3000,00 				10%
		 * 								ACIMA DE R$ 3000,00 					20%
		 */
		 
	}

}
