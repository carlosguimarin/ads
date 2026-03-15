package lista02;

import java.util.Scanner;

public class Exercicio12_Aposentadoria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		String nome = teclado.nextLine();
		
		System.out.print("Em que ano você nasceu: ");
		int nascimento = teclado.nextInt();
		
		System.out.print("Em que ano você engressou na nossa empresa: ");
		int anoEmpresa = teclado.nextInt();
		
		int anoAtual = 2026;
		
		if (nascimento <= 1961  || anoEmpresa <= 1996 || nascimento <= 1966 && anoEmpresa <= 2001) {
			System.out.println("O colaborador " 
					+ nome + " de " 
					+ (anoAtual - nascimento) 
					+ " anos de idade completa esse ano " 
					+ (anoAtual - anoEmpresa) 
					+ " anos que trabalha com a gente." );
			System.out.println("REQUERER APOSENTADORIA");
		} else {
			System.out.println("O colaborador " 
					+ nome + " de " 
					+ (anoAtual - nascimento) 
					+ " anos de idade completa esse ano " 
					+ (anoAtual - anoEmpresa) 
					+ " anos que trabalha com a gente." );
			System.out.println("NÃO REQUERER APOSENTADORIA");

				}
				
		teclado.close();
		
		/* UMA EMPRESA QUER VERIFICAR SE UM EMPREGADO ESTÁ QUALIFICADO PARA A APOSENTADORIA OU NÃO.
		 * PARA ESTAR EM CONDIÇÕES, UM DOS SEGUINTES REQUISITOS DEVE SER SATISFEITO:
		 * 
		 *  TER NO MÍNIMO 65 ANOS DE IDADE.
		 *  TER TRABALHADO NO MÍNIMO 30 ANOS.
		 *  TER NO MÍNIMO 60 ANOS E TER TRABALHADO NO MÍNIMO 25 ANOS.
		 * 
		 * COM BASE NAS INFORMAÇÕES ACIMA, DESENVOLVA UM PROGRAMA QUE LEIA O NOME DO EMPREGADO, O ANO
		 * DE SEU NASCIMENTO E O ANO DE SEU INGRESSO NA EMPRESA. O PROGRAMA DEVERÁ INFORMAR O NOME, A
		 * IDADE, O TEMPO DE SERVIÇO DO EMPREGADO E A MENSAGEM “REQUERER APOSENTADORIA” OU “NÃO
		 * REQUERER APOSENTADORIA”.
		 */
		
	}

}
