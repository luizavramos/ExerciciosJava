package exercicios;

public class Exercicio1 {

	public static void main(String[] args) {
		int resto;
		
		System.out.println("Números entre 1000 e 1999 que quando dividos por 11 obtemos o resto igual a 5:");
		
		for (int i = 1000; i < 2000; i++ ) {
			resto = i % 11;
			if (resto == 5) {
				System.out.println(i);
			}
		}

	}

}
