package palmeira.mateus.cursoDojo.javacore.introducaometodos.dominio;

public class Calculadora {
	
	//Metodo com parâmetros
	public void somaDoisNumeros(double val1, double val2) {
		System.out.println(val1 + val2);
	}

	public void subtraiDoisNumeros(double val1, double val2) {
		System.out.println(val1 - val2);
	}

	public void multiplicaDoisNumeros(double val1, double val2) {
		System.out.println(val1 * val2);
	}

	//Metodo com retorno
	public double divideDoisNumeros(double val1, double val2) {
		if (val2 == 0) {
			return 0;
		}
		return val1 / val2;
	}
}
