package exemplos;

import java.util.Scanner;

public class Exemplo06_Repeticao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Informe um número para a tabuada: ");
		int numero = teclado.nextInt();
		
		System.out.println(numero +" x 1 = "+ 1 * numero );
		System.out.println(numero +" x 2 = "+ 2 * numero );
		System.out.println(numero +" x 3 = "+ 3 * numero );
		System.out.println(numero +" x 4 = "+ 4 * numero );
		System.out.println(numero +" x 5 = "+ 5 * numero );
		System.out.println(numero +" x 6 = "+ 6 * numero );
		System.out.println(numero +" x 7 = "+ 7 * numero );
		System.out.println(numero +" x 8 = "+ 8 * numero );
		System.out.println(numero +" x 9 = "+ 9 * numero );
		System.out.println(numero +" x 10 = "+ 10 * numero );
		System.out.println("-------------------------------");
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(numero + " x " + i + " = " + i * numero);
		}
		teclado.close();
		
	}

}
