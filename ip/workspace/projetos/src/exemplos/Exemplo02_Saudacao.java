package exemplos;

import java.util.Scanner;

public class Exemplo02_Saudacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Sejam bem vindos a Progamação com Java");
		System.out.println("Hello world!!!");
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Informe o seu nome: ");
		String nome = teclado.nextLine();
		
		System.out.println("Olá mestre " + nome);
		teclado.close();
	}

}
