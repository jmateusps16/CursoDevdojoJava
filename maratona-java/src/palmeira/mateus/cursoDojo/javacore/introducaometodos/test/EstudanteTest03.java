package palmeira.mateus.cursoDojo.javacore.introducaometodos.test;

import palmeira.mateus.cursoDojo.javacore.introducaometodos.dominio.Estudante;

public class EstudanteTest03 {
	public static void main(String[] args) {
		Estudante estudante01 = new Estudante();
		Estudante estudante02 = new Estudante();

		estudante01.nome = "Alfredo";
		estudante01.sexo = 'M';
		estudante01.idade = 16;

		estudante02.nome = "Carol";
		estudante02.sexo = 'F';
		estudante02.idade = 21;

		estudante01.imprime();
		estudante02.imprime();
		

	}
}
