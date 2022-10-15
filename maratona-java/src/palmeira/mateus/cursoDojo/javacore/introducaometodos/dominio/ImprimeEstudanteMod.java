package palmeira.mateus.cursoDojo.javacore.introducaometodos.dominio;

public class ImprimeEstudanteMod extends ImprimeEstudante{
	@Override
	public void imprime(Estudante estudante) {
		estudante.nome = "Alterado";
		System.out.println("----------");
		System.out.println(estudante.nome);
		System.out.println(estudante.idade);
		System.out.println(estudante.sexo);
	}
}
