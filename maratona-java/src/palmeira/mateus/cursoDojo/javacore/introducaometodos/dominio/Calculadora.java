package palmeira.mateus.cursoDojo.javacore.introducaometodos.dominio;

public class Calculadora {

	// Metodo com parâmetros
	public void somaDoisNumeros(double val1, double val2) {
		System.out.println(val1 + val2);
	}

	public void subtraiDoisNumeros(double val1, double val2) {
		System.out.println(val1 - val2);
	}

	public void multiplicaDoisNumeros(double val1, double val2) {
		System.out.println(val1 * val2);
	}

	// Metodo com retorno
	public double divideDoisNumeros(double val1, double val2) {
		if (val2 == 0) {
			return 0;
		}
		return val1 / val2;
	}

	public void divideDoisNumeros02(double val1, double val2) {
		if (val2 == 0) {
			System.out.println("Não existe divisão por zero");
			return; // Retorno em função void não passa valores
		}
		System.out.println(val1 / val2);
	}

	public void alteraDoisNumeros(int val1, int val2) {
		val1 = 99;
		val2 = 33;
		System.out.println("Dentro do alteraDoisNumeros");
		System.out.println("Val1: " + val1);
		System.out.println("Val2: " + val2);
	}

	// manipulação de array
	public void somaArray(int[] numeros) {
		int soma = 0;
		for (int i : numeros) {
			soma += i;
		}
		System.out.println(soma);
	}

	// usando o VarArgs
	public void somaVarArgs(int... numeros) {
		int soma = 0;
		for (int i : numeros) {
			soma += i;
		}
		System.out.println(soma);
	}
}
