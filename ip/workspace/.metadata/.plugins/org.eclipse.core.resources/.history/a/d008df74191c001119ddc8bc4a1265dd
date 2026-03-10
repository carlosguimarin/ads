package exemplos;

import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Informe seu salário: ");
		double salario = teclado.nextDouble();
		
		System.out.print("Informe o reajuste em porcentagem: ");
		double reajuste = teclado.nextDouble();
		
		double novoSalario = salario + (salario * reajuste/100);
		
		System.out.print("Seu novo salário é igual à R$ " + novoSalario);
		
		teclado.close();
/*	    teclado.close(); serve para parar de usar o teclado
		alt seta para baixo e cima move a linha
		sysout se usar o ctrl + espaço completa o que preciso esrever
		
	    * Prática de identação
        * blablabla {
        * 
        *      blablabla
        *      blablabla
        *      blablabla{
        *      
        *           blablabla
        *           blablabla
        *           blablabla
        *      }     
        * 
        * }
        * 
        * CTRL + SHIFT + F = Identa para você
        * 
*/
         }
}

//import java.util.Scanner;
//
//public class Salario {
//    public static void main(String[] args) {
//        Scanner teclado = new Scanner(System.in);
//
//        System.out.print("Informe seu salário: ");
//        String entradaSalario = teclado.next();
//        double salario = converterParaDouble(entradaSalario);
//
//        System.out.print("Informe o reajuste em porcentagem: ");
//        String entradaReajuste = teclado.next();
//        double reajuste = converterParaDouble(entradaReajuste);
//
//        // Validação se a conversão deu certo
//        if (salario > 0) {
//            double novoSalario = salario + (salario * reajuste / 100);
//            System.out.printf("Seu novo salário é igual à R$ %.2f%n", novoSalario);
//        } else {
//            System.out.println("Erro: Salário inválido.");
//        }
//
//        teclado.close();
//    }
//
//    public static double converterParaDouble(String valor) {
//        // 1. Remove %, espaços e transforma vírgula em ponto
//        valor = valor.replace("%", "").trim().replace(",", ".");
//
//        // 2. Se o usuário digitou algo como 1.500.00, temos mais de um ponto.
//        // Vamos manter apenas o ÚLTIMO ponto (que é o decimal) e remover os outros.
//        if (valor.indexOf(".") != valor.lastIndexOf(".")) {
//            int ultimoPonto = valor.lastIndexOf(".");
//            String parteInteira = valor.substring(0, ultimoPonto).replace(".", "");
//            String parteDecimal = valor.substring(ultimoPonto);
//            valor = parteInteira + parteDecimal;
//        }
//
//        try {
//            return Double.parseDouble(valor);
//        } catch (NumberFormatException e) {
//            return 0; // Retorna 0 se o que foi digitado não for número
//        }
//    }
//}
