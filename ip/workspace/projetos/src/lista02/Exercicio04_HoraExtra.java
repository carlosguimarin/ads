package lista02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio04_HoraExtra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DecimalFormat formatador = new DecimalFormat("0.00");
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite o seu salário por hora: " );
		double salarioHora = teclado.nextDouble();
		
		System.out.print("Digite o número de horas contabilizadas no mês: ");
		int horasMes = teclado.nextInt();
		
		System.out.print("Digite a sobra em minutos no mês: ");
		double minutosMes = teclado.nextDouble();
		
		if (horasMes >= 160) {
			System.out.println("O total que você deverá receber é R$ " 
			+ formatador.format(
					((salarioHora * 160)
					+ ((horasMes - 160) * (salarioHora * 1.5)))
					+ ((minutosMes / 60) * (salarioHora * 1.50))));
		
		} else {
			if (horasMes < 160) {
			System.out.println("O total que você deverá receber é R$ " 
			+ formatador.format(
					(salarioHora * horasMes) 
					+ ((minutosMes / 60) * (salarioHora * 1.50))));
		}
				
		teclado.close();
		
		/*
		 * A JORNADA DE TRABALHO DE UM FUNCIONÁRIO É DE 40 HORAS SEMANAIS. PODE OCORRER DO
		 * FUNCIONÁRIO FAZER HORA EXTRA, CUJO CÁLCULO É O VALOR DA HORA REGULAR COM UM ACRÉSCIMO DE 50%.
		 * DESENVOLVA UM PROGRAMA QUE LEIA O NÚMERO DE HORAS TRABALHADAS EM UM MÊS, O SALÁRIO POR HORA
		 * E ESCREVA O SALÁRIO TOTAL DO FUNCIONÁRIO, QUE DEVERÁ SER ACRESCIDO DAS HORAS EXTRAS, CASO
		 * TENHAM SIDO TRABALHADAS (CONSIDERE QUE O MÊS POSSUA 4 SEMANAS EXATAS).
		 */

		}
	
	}
	
}
