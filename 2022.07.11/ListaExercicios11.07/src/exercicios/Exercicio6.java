package exercicios;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		int numero, soma = 0, contador = 0; 
		double media;
		
		Scanner Leia = new Scanner(System.in);
		System.out.println("Bem vindo ao programa. Caso queira sair tecle 0.");
		
		do {
			System.out.println("Informe um número: ");
			numero = Leia.nextInt();
			if (numero % 3 == 0 && numero != 0) {
				soma += numero;
				contador++;
			}
			
		}while(numero != 0);
		
		media = (soma/contador);
		
		System.out.println("A média dos números múltiplos de 3 é " + media);
		
		Leia.close();
		
	}

}
