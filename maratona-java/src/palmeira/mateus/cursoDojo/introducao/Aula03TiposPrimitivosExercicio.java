package palmeira.mateus.cursoDojo.introducao;

/*
 * Prática -> Criar variáveis para os campos desctiros abaixo entre <> e imprima a seguinte messagem:
 * Eu <nome>, morando no endereço <endereço>, confirmo que recebi o salário de <salário> na data <data>
 * */

public class Aula03TiposPrimitivosExercicio {
	public static void main(String[] args) {
		String nome = "Mateus";
		String endereco = "Rua joão fernandes vieira, N 102, Vila Torres Galvão, Paulista - PE";
		double salario = 10000;
		String dataRecebimentoSalario = "18/08/2022";
		String relatorio = ("Eu "+nome+", morando no endereço "+endereco+", confirmo que recebi o salário de "+salario+" na data "+dataRecebimentoSalario);
		System.out.println(relatorio);
	}
}
