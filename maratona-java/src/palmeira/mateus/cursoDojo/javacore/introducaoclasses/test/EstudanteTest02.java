package palmeira.mateus.cursoDojo.javacore.introducaoclasses.test;

import palmeira.mateus.cursoDojo.javacore.introducaoclasses.dominio.Estudante;

public class EstudanteTest02 {

	public static void main(String[] args) {
		Estudante estudante = new Estudante();
		Estudante estudante2 = new Estudante();
		
		//Acessando atributo e adicionando valor
		estudante.nome = "Noroa";
		System.out.println(estudante.idade);
		System.out.println(estudante.sexo);
		System.out.println(estudante.nome);
		
		System.out.println("\n -----------------------");
		
		//Iniciado com valores padrões
		System.out.println(estudante2.idade);
		System.out.println(estudante2.sexo);
		System.out.println(estudante2.nome);

	}

}
