package lista01;

import java.util.Scanner;

public class Exercicio08_Salario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Informe seu salário: ");
		double salario = teclado.nextDouble();
		
		System.out.print("Informe o reajuste em porcentagem: ");
		double reajuste = teclado.nextDouble();
		
		double novoSalario = salario + (salario * reajuste/100);
		
		System.out.print("Seu salário era R$" + salario + " e com o reajuste ficará R$ " + novoSalario);
		
		teclado.close();
	}

}
