package palmeira.mateus.cursoDojo.introducao;

public class Aula04Operadores {
	public static void main(String[] args) {
		//soma (+), subtração (-), divisão (/), multiplicação (*)
		int numero01 = 10;
		int numero02 = 20;
		double resultado = numero01+numero02;
		System.out.println(resultado);
		
		// % resto
		int resto = 21 % 7;
		System.out.println(resto);
		
		// < > <= => == !=
		boolean isDezMaiorQueVinte = 10 > 20;
		boolean isDezMenorQueVinte = 10 < 20;
		boolean isDezIgualVinte = 10 == 20;
		boolean isDezIgualDez = 10 == 10;
		boolean isDezDiferenteVinte = 10 != 20;
		System.out.println("isDezMaiorQueVinte ("+ isDezMaiorQueVinte+")");
		System.out.println("isDezMenorQueVinte ("+ isDezMenorQueVinte+")");
		System.out.println("isDezIgualVinte ("+ isDezIgualVinte+")");
		System.out.println("isDezIgualDez ("+ isDezIgualDez+")");
		System.out.println("isDezDiferenteVinte ("+ isDezDiferenteVinte+")");
		
		// && (and), || (or), ! (not)
		int idade = 28;
		float salario = 10000;
		boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612; 
		boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
		System.out.println("isDentroDaLeiMaiorQueTrinta (" + isDentroDaLeiMaiorQueTrinta+")");
		System.out.println("isDentroDaLeiMenorQueTrinta (" + isDentroDaLeiMenorQueTrinta+")");
		
		double valorTotalContaCorrente = 200;
		double valorTotalContaPoupanca = 10000;
		float valorPlaystation = 5000F;
		boolean isPlaystationCincoCompravel = valorTotalContaCorrente >= valorPlaystation || valorTotalContaPoupanca >= valorPlaystation;
		System.out.println("isPlaystationCincoCompravel ("+ isPlaystationCincoCompravel+")");
		
		// =, += -= *= /= %=
		double bonus = 1800; //1800
		System.out.println(bonus);
		bonus += 1000; //2800
		System.out.println(bonus);
		bonus -= 1000; //1800
		System.out.println(bonus);
		bonus *= 2; //3600
		System.out.println(bonus);
		bonus /= 2; //1800
		System.out.println(bonus);
		bonus %= 2; //0
		System.out.println(bonus);
		
		// ++ --
		int contador = 0;
		contador += 1; //contador = contador + 1;
		contador++;
		contador--;
		++contador;
		--contador;
		System.out.println(contador);
		int contador2 = 0;
		System.out.println(contador2++);
		System.out.println(contador2);
		System.out.println(++contador2);
	}
}
