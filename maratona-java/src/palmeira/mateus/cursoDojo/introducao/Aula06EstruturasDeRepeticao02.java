package palmeira.mateus.cursoDojo.introducao;

import java.util.Iterator;

public class Aula06EstruturasDeRepeticao02 {
	public static void main(String[] args) {
		//Imprima todos os numeros pares de 0 até 1000000
		int paresAte = 1000000;
		for (int i = 0; i <= paresAte; i++) {
			if (i%2==0) {
				System.out.println(i);
			}
		}	
	}
}
