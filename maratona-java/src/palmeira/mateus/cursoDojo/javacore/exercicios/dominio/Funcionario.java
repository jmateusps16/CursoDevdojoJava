package palmeira.mateus.cursoDojo.javacore.exercicios.dominio;

public class Funcionario extends Pessoa {
	public double[] salario = new double[3];

	@Override
	public void imprimeDados(Pessoa pessoa) {
		System.out.println("Nome: " + this.nome);
		System.out.println("Idade: " + this.idade);

		if (this.salario[2] != 0) {
			System.out.println("Ultimo salario: " + this.salario[2]);
		} else if (this.salario[1] != 0) {
			System.out.println("Ultimo salario: " + this.salario[1]);
		} else if (this.salario[0] != 0){
			System.out.println("Ultimo salario: " + this.salario[0]);
		} else{
			System.out.println("Não foi informado o salário");
		}
	}

	public void imprimeMediaSalario(Funcionario funcionario) {
		int qntSalario = 0;
		double totalSalario = 0;
		for(int i=0;i<this.salario.length;i++) {
			if(this.salario[i]!=0) {
				qntSalario++;
			}
			totalSalario += this.salario[i];
		}
		if(qntSalario==0) {
			System.out.println("Não foi informado o salário");
		}else {
			System.out.println("A média de salario é: "+totalSalario/qntSalario);
		}
	}

}
