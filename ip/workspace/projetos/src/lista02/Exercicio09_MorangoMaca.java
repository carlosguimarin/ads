package lista02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio09_MorangoMaca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DecimalFormat formatador = new DecimalFormat("0.00");
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite quantos kg de morangos você comprou: ");
		double kgmorango = teclado.nextDouble();
		
		System.out.print("Digite quantos kg de de maçãs você comprou: ");
		double kgmaca = teclado.nextDouble();
		
		double valormorango = 0;
		double valormaca = 0;
		
		double kgtotal = (kgmorango + kgmaca);
				
		if (kgmorango <= 5) {
			valormorango = 2.50;
		} else {
			valormorango = 2.20;
		}
		if (kgmaca <= 5) {
			valormaca = 1.80;
		} else {
			valormaca = 1.50;
		}
		double valortotal = ((kgmorango * valormorango) + (kgmaca * valormaca));
		
		if (kgtotal > 8 || valortotal > 25) {
			valortotal = (valortotal * 0.90);
		}
		System.out.println("Valor total à pagar: " + formatador.format(valortotal));
		teclado.close();
		
		/*
		 * UMA FRUTEIRA ESTÁ VENDENDO FRUTAS COM A SEGUINTE TABELA DE PREÇOS
		 * 
		 * 							 ATÉ 5 KG         ACIMA DE 5 KG
		 * 				MORANGO   R$ 2,50 POR KG      R$ 2,20 POR KG
		 * 				MAÇÃ      R$ 1,80 POR KG      R$ 1,50 POR KG
		 * 
		 * SE O CLIENTE COMPRAR MAIS DE 8 KG EM FRUTAS OU O VALOR TOTAL DA COMPRA ULTRAPASSAR R$ 25,00,
		 * RECEBERÁ AINDA UM DESCONTO DE 10% SOBRE ESTE TOTAL. DESENVOLVA UM PROGRAMA PARA LER A
		 * QUANTIDADE (EM KG) DE MORANGOS E A QUANTIDADE (EM KG) DE MAÇAS ADQUIRIDAS E ESCREVA O VALOR A
		 * SER PAGO PELO CLIENTE.
		 */
	}

}
