package lista02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio10_DescontoProduto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DecimalFormat formatador = new DecimalFormat("0.00");
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite o nome do produto: ");
		String nomeProduto = teclado.nextLine();
		
		System.out.print("Digite a quantidade adquirida: ");
		double quantidade = teclado.nextDouble();
		
		System.out.print("Digite o preço unitário: ");
		double precoUnitario = teclado.nextDouble();
		
		double totalPagar = 0;
		double desconto = 0;
						
		if (quantidade <= 5) {
			totalPagar = (quantidade * precoUnitario) * 0.98;
			desconto = (quantidade * precoUnitario) - totalPagar;
		}
		
		if (quantidade > 5 && quantidade <= 10) {
			totalPagar = (quantidade * precoUnitario) * 0.97;
			desconto = (quantidade * precoUnitario) - totalPagar;
			
		} else if (quantidade > 10){
			totalPagar = (quantidade * precoUnitario) * 0.95;
			desconto = (quantidade * precoUnitario) - totalPagar;
		}
		
		System.out.println("Você recebeu R$ " 
		+ formatador.format(desconto) 
		+ " de desconto e o total a pagar ficou R$ " 
		+ formatador.format(totalPagar) + ".");
		
		
//		double total = quantidade * precoUnitario;
//		double percentualDesconto;
//
//		if (quantidade <= 5) {
//			percentualDesconto = 0.02;
//		} else if (quantidade > 5 && quantidade <= 10) {
//			percentualDesconto = 0.03;
//		} else {
//			percentualDesconto = 0.05;
//		}
//
//		double desconto = total * percentualDesconto;
//		double totalPagar = total - desconto;
//
//		System.out.println("Você recebeu R$ "
//				+ formatador.format(desconto)
//				+ " de desconto e o total a pagar ficou R$ "
//				+ formatador.format(totalPagar) + ".");
		
		teclado.close();
		
		/* FAÇA UM PROGRAMA PARA LER O NOME DE UM PRODUTO, A QUANTIDADE ADQUIRIDA E O PREÇO UNITÁRIO.
		 * CALCULE E ESCREVA O TOTAL (TOTAL = QUANTIDADE ADQUIRIDA * PREÇO UNITÁRIO), O DESCONTO E O TOTAL A
		 * PAGAR (TOTAL A PAGAR = TOTAL - DESCONTO), SABENDO-SE QUE:
		 *  SE QUANTIDADE <= 5 O DESCONTO SERÁ DE 2%
		 *  SE QUANTIDADE > 5 E QUANTIDADE <=10 O DESCONTO SERÁ DE 3%
		 *  SE QUANTIDADE > 10 O DESCONTO SERÁ DE 5%
		 */
					
	}

}
