package palmeira.mateus.cursoDojo.javacore.introducaoclasses.test;

import palmeira.mateus.cursoDojo.javacore.introducaoclasses.dominio.Estudante;

public class EstudanteTest01 {

	public static void main(String[] args) {
		Estudante estudante = new Estudante();
		
		estudante.nome = "Mateus";
		estudante.idade = 24;
		estudante.sexo = 'M';
		
		System.out.println(estudante.nome+" tem "+estudante.idade+" anos e é do sexo "+estudante.sexo+".");
		
	}
}
