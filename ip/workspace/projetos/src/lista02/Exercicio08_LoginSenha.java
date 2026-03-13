package lista02;

import java.util.Scanner;

public class Exercicio08_LoginSenha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Usuário: ");
		int usuario = teclado.nextInt();
		
		switch(usuario) {
			case 12345: {
				System.out.print("Senha: ");			
				int senha = teclado.nextInt();
					if (senha == 54321) {
						System.out.println("ACESSO PERMITIDO!");
					} else {
						System.out.println("SENHA INCORRETA!");
					}
			}
			break;
		}
		
		if (usuario != 12345) {
			System.out.println("USUÁRIO INVÁLIDO!");
		}
		
//		if (usuario == 12345) {
//
//		    System.out.print("Senha: ");
//		    int senha = teclado.nextInt();
//
//		    if (senha == 54321) {
//		        System.out.println("ACESSO PERMITIDO!");
//		    } else {
//		        System.out.println("SENHA INCORRETA!");
//		    }
//
//		} else {
//		    System.out.println("USUÁRIO INVÁLIDO!");
//		}
		
		teclado.close();
		
		/*
		 * SUPONHA QUE O CÓDIGO DE ACESSO DE UM USUÁRIO A UM SISTEMA SEJA IGUAL A 12345 E QUE A SENHA DE
		 * ACESSO SEJA 54321. FAÇA UM PROGRAMA PARA LER O CÓDIGO DE ACESSO DO USUÁRIO. CASO ESTE CÓDIGO
		 * SEJA DIFERENTE DO CÓDIGO ARMAZENADO INTERNAMENTE O PROGRAMA DEVE APRESENTAR A MENSAGEM
		 * “USUÁRIO INVÁLIDO!”. CASO O CÓDIGO SEJA CORRETO, DEVE SER LIDO A SENHA. SE ESTA SENHA ESTIVER
		 * INCORRETA O PROGRAMA DEVE MOSTRAR A MENSAGEM “SENHA INCORRETA!”. CASO A SENHA ESTEJA
		 * CORRETA, DEVE SER MOSTRADA A MENSAGEM “ACESSO PERMITIDO!”.
		 */
	}
	
}