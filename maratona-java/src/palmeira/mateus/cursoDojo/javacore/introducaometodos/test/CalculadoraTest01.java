package palmeira.mateus.cursoDojo.javacore.introducaometodos.test;

import palmeira.mateus.cursoDojo.javacore.introducaometodos.dominio.Calculadora;

public class CalculadoraTest01 {
	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();
		calculadora.somaDoisNumeros(10, 20);
		calculadora.subtraiDoisNumeros(20, 10);
	}
}
