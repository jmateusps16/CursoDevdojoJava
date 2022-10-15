package palmeira.mateus.cursoDojo.javacore.introducaoclasses.test;

import palmeira.mateus.cursoDojo.javacore.introducaoclasses.dominio.Carro;

public class CarroTest01 {

	public static void main(String[] args) {
		Carro carro01 = new Carro();
		Carro carro02 = new Carro();

		carro01.nome = "Fiat";
		carro01.modelo = "Toro";
		carro01.anoModelo = 2022;
		carro01.cor = "Preto";

		System.out.println("Informação do Carro: " + carro01.nome + " " + carro01.modelo + ", ano " + carro01.anoModelo
				+ ", cor " + carro01.cor);
		
		carro02.nome = "Renault";
		carro02.modelo = "Captur";
		carro02.anoModelo = 2022;
		carro02.cor = "Branco";
		
		System.out.println("Informação do Carro: " + carro02.nome + " " + carro02.modelo + ", ano " + carro02.anoModelo
				+ ", cor " + carro02.cor);

	}

}
