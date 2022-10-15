package palmeira.mateus.cursoDojo.introducao;

public class Aula07Arrays02 {
	public static void main(String[] args) {
		// Valores padrões em array "vazio"
		// byte, short, int, long, floart e double = 0
		// char = '\u0000' = ' '
		// boolean = false
		// String = null

		/*
		 * String[] nomes = new String[3]; nomes[0] = "Goku"; nomes[1] = "Kurosaki";
		 * nomes[2] = "Luffy";
		 * 
		 * for (int i = 0; i < nomes.length; i++) System.out.println(nomes[i]);
		 */
		int tamanhoArray = 3;
		String[] nomes = new String[tamanhoArray];
		nomes[0] = "teste0";
		nomes[1] = "teste1";
		nomes[2] = "teste2";

		for (int i = 0; i < nomes.length; i++) {
			System.out.println(nomes[i]);
		}
	}
}
