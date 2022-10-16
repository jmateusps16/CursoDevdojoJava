package palmeira.mateus.cursoDojo.javacore.exercicios.teste;

import palmeira.mateus.cursoDojo.javacore.exercicios.dominio.Funcionario;

public class FuncionarioTest01 {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();
		Funcionario funcionario02 = new Funcionario();

		funcionario.nome = "Araujo";
		funcionario.idade = 19;
		funcionario.salario[0]=1000.00;
		funcionario.salario[1]=2000.00;
		funcionario.salario[2]=3000.00;
		funcionario.imprimeDados(funcionario);
		funcionario.imprimeMediaSalario(funcionario);
		
		System.out.println("------------------");
		funcionario02.nome = "Araujo";
		funcionario02.idade = 19;
		funcionario02.imprimeDados(funcionario02);
		funcionario02.imprimeMediaSalario(funcionario02);

	}

}
