package palmeira.mateus.cursoDojo.introducao;

public class Aula07Arrays01 {
	public static void main(String[] args) {
//		int idade01 = 15;
//		int idade02 = 20;
//		int idade03 = 21;

//		int[] idades = null; //variavel do tipo referencia
		int[] idades = new int[3]; // declarando corretamente, obs que java precisa que informe o tamanho do array
									// =/
		// todo array inicia em 0, nesse exemplo os indices validos são (0, 1, 2)
		idades[0] = 21;
		idades[1] = 15;
		idades[2] = 11;
		System.out.println(idades[0]);
		System.out.println(idades[1]);
		System.out.println(idades[2]);
	}
}
