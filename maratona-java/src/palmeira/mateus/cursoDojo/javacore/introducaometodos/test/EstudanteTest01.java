package palmeira.mateus.cursoDojo.javacore.introducaometodos.test;

import palmeira.mateus.cursoDojo.javacore.introducaometodos.dominio.Estudante;
import palmeira.mateus.cursoDojo.javacore.introducaometodos.dominio.ImprimeEstudante;

public class EstudanteTest01 {

	public static void main(String[] args) {
		Estudante estudante01 = new Estudante();
		Estudante estudante02 = new Estudante();
		ImprimeEstudante impressora = new ImprimeEstudante();
		
		estudante01.nome = "Alfredo";
		estudante01.sexo = 'M';
		estudante01.idade = 16;
		
		estudante02.nome = "Carol";
		estudante02.sexo = 'F';
		estudante02.idade = 21;
		
		//Cada impressão precisa incluir mais código pra cada estudante.
//		System.out.println(estudante01.nome);
//		System.out.println(estudante01.sexo);
//		System.out.println(estudante01.idade);
//		System.out.println("\n------------------\n");
//		System.out.println(estudante02.nome);
//		System.out.println(estudante02.sexo);
//		System.out.println(estudante02.idade);
		
		//com o metodo olha como ficou mais simples
		System.out.println("\nCom metodo\n");
		impressora.imprime(estudante01);
		impressora.imprime(estudante02);
		
		//Quando passa o objeto no metodo, ele utiliza a mesma referencia do objeto.

	}

}
