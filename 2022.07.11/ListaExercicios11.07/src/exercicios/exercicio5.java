package exercicios;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		int numero, soma = 0;
		Scanner Leia = new Scanner(System.in);
		do {
			System.out.println("Informe um n�mero: ");
			numero = Leia.nextInt();
			soma+=numero;			
			
		}while(numero != 0 );
		
		System.out.println("A soma dos n�meros digitados �: " + soma );
		Leia.close();
	}

}
