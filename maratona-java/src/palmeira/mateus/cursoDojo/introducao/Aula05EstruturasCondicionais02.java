package palmeira.mateus.cursoDojo.introducao;

public class Aula05EstruturasCondicionais02 {
	public static void main(String[] args) {
		//idade < 15 categoria infantil
		//idade >= 15 && idade < 18 categoria juvenil
		//idade >= 18 categoria adulto
		
		int idade = 17;
		/* forma com muito código
		if(idade<15){
			System.out.println("Categoria Infantil");
		}else if(idade >= 15 && idade < 18) {
			System.out.println("Categoria Juvenil");
		}else {
			System.out.println("Categoria Adulto");
		}
		*/
		String categoria;
//		if(idade<15) {
//			categoria = "Categoria Infantil";
//		} else if(idade >= 15 && idade < 18) {
//			categoria = "Categoria Juveil";
//		}else {
//			categoria = "Categoria Adulto";
//		}
		categoria = idade<15 ? "Categoria Infantil" : idade >= 15 && idade < 18 ? "Categoria Juvenil" : "Categoria Adulto";
		System.out.println(categoria);
	}
}