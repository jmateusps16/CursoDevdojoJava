package palmeira.mateus.cursoDojo.javacore.introducaoclasses.test;

import palmeira.mateus.cursoDojo.javacore.introducaoclasses.dominio.Professor;

public class ProfessorTest01 {

	public static void main(String[] args) {
		Professor professor = new Professor();

		professor.nome = "Alisson";
		professor.idade = 31;
		professor.sexo = 'M';

//		System.out.println(professor.nome);
//		System.out.println(professor.idade);
//		System.out.println(professor.sexo);
		System.out.println("Nome: "+ professor.nome + ", Idade: "+ professor.idade + " anos, Sexo: "+professor.sexo);
	}

}
