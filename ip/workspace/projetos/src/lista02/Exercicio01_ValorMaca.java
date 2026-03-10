package lista02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio01_ValorMaca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DecimalFormat formatador = new DecimalFormat("0.00");
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite quantas maçãs você comprou: ");
		int numeroMaca = teclado.nextInt();
		
				if (numeroMaca < 12) {
					
					double valorUnitario = 1.30;
					System.out.println("Você gastou R$ " + formatador.format(valorUnitario * numeroMaca) + " em maçãs.");
				}
				else {
					if (numeroMaca >= 12) {
					
					double valorAtacado = 1.00;
					System.out.println("Você gastou R$ " + formatador.format(valorAtacado * numeroMaca) + " em maçãs.");
				
				}
			}
		
		teclado.close();
		
		/*
		 *  EM UMA FEIRA, AS MAÇÃS CUSTAM R$ 1,30 CADA SE FOREM COMPRADAS MENOS DE UMA DÚZIA, E R$ 1,00SE 
		 *  FOREM COMPRADAS PELO MENOS 12. ESCREVA UM PROGRAMA QUE LEIA O NÚMERO DE MAÇÃS
		 *  COMPRADAS, CALCULE E ESCREVA O CUSTO TOTAL DA COMPRA.
		 */
	}

}
