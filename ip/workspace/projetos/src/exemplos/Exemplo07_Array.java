package exemplos;

import java.util.Scanner;

public class Exemplo07_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		String[] listaNomes = new String[5];
		for(int i = 0; i < listaNomes.length; i++) {
			System.out.print("Informe um nome: ");
			listaNomes[i] = teclado.nextLine();
		}
		
		for(int i = listaNomes.length-1; i >= 0; i--) {
			System.out.print(listaNomes[i] + " ");
		}
		
		teclado.close();
		
	}

}
