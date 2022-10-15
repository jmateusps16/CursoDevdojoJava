package palmeira.mateus.cursoDojo.javacore.introducaometodos.test;

import palmeira.mateus.cursoDojo.javacore.introducaometodos.dominio.Estudante;
import palmeira.mateus.cursoDojo.javacore.introducaometodos.dominio.ImprimeEstudanteMod;

public class EstudanteTest02 {
	public static void main(String[] args) {
		Estudante estudante01 = new Estudante();
		Estudante estudante02 = new Estudante();
		ImprimeEstudanteMod impressora = new ImprimeEstudanteMod();
		
		estudante01.nome = "Alfredo";
		estudante01.sexo = 'M';
		estudante01.idade = 16;
		
		estudante02.nome = "Carol";
		estudante02.sexo = 'F';
		estudante02.idade = 21;
		
		//Por passar a referência o metodo ImprimeEstudanteMod está alterando o estado do OBJETO.
		//MUITO CUIDADO!
		System.out.println("\nCom metodo\n");
		impressora.imprime(estudante01);
		impressora.imprime(estudante02);


	}
}
