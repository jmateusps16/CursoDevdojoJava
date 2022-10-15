package palmeira.mateus.cursoDojo.javacore.introducaometodos.test;

import palmeira.mateus.cursoDojo.javacore.introducaometodos.dominio.Calculadora;

public class CalculadoraTest01 {
	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();
		calculadora.somaDoisNumeros(10, 20);
		calculadora.subtraiDoisNumeros(20, 10);
		calculadora.multiplicaDoisNumeros(10, 20);
		
//		double resultado  = calculadora.divideDoisNumeros(20, 2);
//		System.out.println(resultado);
		
		System.out.println(calculadora.divideDoisNumeros(20, 2));
	}
}
