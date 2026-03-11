package lista02;

import java.util.Scanner;

public class Exercicio05_MediaEstoque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Informe a quantidade atual de produtos: ");
		int atualProdutos = teclado.nextInt();
		
		System.out.print("Informe a quantidade mínima de produtos: ");
		int minimaEstoque = teclado.nextInt();
		
		System.out.print("Informe a quantidade máxima de produtos: ");
		int maximaEstoque = teclado.nextInt();
		
		int mediaProdutos = ((maximaEstoque + minimaEstoque) / 2);
		
		if (atualProdutos >= mediaProdutos) {
			System.out.println("Não é necessário efetuar a compra deste produto.");
		} else {
			if (atualProdutos < mediaProdutos) {
				System.out.println("Efetuar a compra deste produto.");
			}
		}
		
		teclado.close();
		
		/*
		 * FAÇA UM PROGRAMA PARA LER A QUANTIDADE ATUAL DE UM PRODUTO EM ESTOQUE. TAMBÉM DEVERÁ SER
		 * INFORMADO A QUANTIDADE MÁXIMA E A QUANTIDADE MÍNIMA QUE ESTE PRODUTO PODE TER EM ESTOQUE. O
		 * PROGRAMA DEVE CALCULAR E ESCREVER A QUANTIDADE MÉDIA ((QUANTIDADE MÉDIA = QUANTIDADE MÁXIMA +
		 * QUANTIDADE MÍNIMA)/2). SE A QUANTIDADE EM ESTOQUE FOR MAIOR OU IGUAL A QUANTIDADE MÉDIA
		 * ESCREVER A MENSAGEM “NÃO É NECESSÁRIO EFETUAR A COMPRA DESTE PRODUTO”, SENÃO ESCREVER A
		 * MENSAGEM “EFETUAR A COMPRA DESTE PRODUTO”
		 */

	}

}
