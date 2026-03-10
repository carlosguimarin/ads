package exemplos;

import java.util.Scanner;

public class Exemplo04_Conditional_Switch_Case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Boas vindas Semestral!");
		System.out.println("Digite 1 para primeiro semestre");
		System.out.println("Digite 2 para segundo semestre");
		
		System.out.print("Digite um valor: ");
		int opcao = teclado.nextInt();
		
		switch(opcao) {
			case 1: {
				System.out.println("Bem vindo ao primeiro semestre do ano!");
				break;
			}
			case 2: {
				System.out.println("Bem vindo ao segundo semestre do ano!");
				break;
			}
			default: {
				System.out.println("Digite uma opção válida!");
				break;
			}
		}
		teclado.close();

	}

}
