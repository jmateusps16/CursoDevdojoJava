package palmeira.mateus.cursoDojo.introducao;

public class TesteZone01 {
	public static void main (String[] args) {
		int valor1 = 10;
		int valor2 = valor1;
		
		System.out.println(valor1 +" e "+ valor2);
		
		valor2 += 1;
		System.out.println(valor1 +" e "+ valor2);
	}
}
