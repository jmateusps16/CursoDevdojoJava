package palmeira.mateus.cursoDojo.javacore.exercicios.dominio;

public class Funcionario extends Pessoa {
	public double[] salarios;

	@Override
	public void imprimeDados(Pessoa pessoa) {
		System.out.println("Nome: " + this.nome);
		System.out.println("Idade: " + this.idade);
		imprimeSalarios();
	}

	private void imprimeSalarios() {
		if (this.salarios == null) {
			System.out.println("Salário não informado");
		} else {
			System.out.print("Ultimos Salarios: ");
			for (double salario : salarios) {
				System.out.print(salario + " R$, ");
			}
			System.out.println("");
		}
	}

	public void imprimeMediaSalario(Funcionario funcionario) {
		if (this.salarios == null) {
			return;
		}
		double media = 0;
		for (double salario : salarios) {
			media += salario;
		}
		media /= salarios.length;
		System.out.println("Média dos salários: " + media);
	}

}
