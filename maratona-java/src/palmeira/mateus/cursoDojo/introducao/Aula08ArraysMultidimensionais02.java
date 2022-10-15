package palmeira.mateus.cursoDojo.introducao;

public class Aula08ArraysMultidimensionais02 {
	public static void main(String[] args) {
		// Declaração basica
		int[][] arrayInt = new int[3][];

		// Inicialização
		arrayInt[0] = new int[2];
		arrayInt[1] = new int[3];
		arrayInt[2] = new int[6];

		// Outra forma de declarar e iniciar um array
		int[][] arrayInt2 = { { 1, 2 }, { 3, 4, 5 }, { 6, 7, 8, 9, 10, 11 } };

		//Andando dentro do Array Multidimensional com ForEach
		for (int[] arrayBase : arrayInt) {
			System.out.println("\n------");
			for (int num : arrayBase) {
				System.out.print(num + " ");
			}
		}
		
		//Andando no outro array
		System.out.println("\n\n--------------------");
		for (int[] arrayBase : arrayInt2) {
			System.out.println("\n------");
			for (int num : arrayBase) {
				System.out.print(num + " ");
			}
		}
	}
}
