package palmeira.mateus.cursoDojo.javacore.introducaometodos.test;

import palmeira.mateus.cursoDojo.javacore.introducaometodos.dominio.Calculadora;

public class CalculadoraTest02 {
	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();
		int num1 = 1;
		int num2 = 2;
		
		//Metodo que manipula dados primitivos, não altera valores, ele copia.
		calculadora.alteraDoisNumeros(num1, num2);
		System.out.println("----------------");
		System.out.println("Num1: "+num1);
		System.out.println("Num2: "+num2);
	}
}
