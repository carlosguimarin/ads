package exemplos;

public class Exemplo08_Matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] matrizA = {{1,2,3},{4,5,6},{7,8,9}};
		
		for(int linha = 0; linha < matrizA.length; linha++) {
			for(int coluna = 0; coluna < matrizA[linha].length; coluna++) {
				System.out.print(matrizA[linha][coluna] + " ");
			}
			System.out.println();
		}
		System.out.println("------------");
		int diagonal = 0;
		for(int i = 0; i < matrizA.length; i++) {
			for(int j = 0; j < matrizA[i].length; j++) {
				if(i == j) {
					diagonal += matrizA[i][j];
				}
			}
		}
		System.out.println("O valor na diagonal é: " + diagonal);
		
	}

}
