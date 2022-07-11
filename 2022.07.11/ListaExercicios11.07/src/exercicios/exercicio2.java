package exercicios;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		int pares = 0, impares = 0, numeros; 
		Scanner Leia = new Scanner(System.in);
		
		for (int i = 1; i < 11; i++) {
			
			System.out.println("Informe o " + i + "º número: ");
			numeros = Leia.nextInt();
			
			if (numeros % 2 == 0) {
				pares++;
				}
			else {
				impares++;
			}
			
			}
		System.out.println("Quantidade de números ímpares: " + impares);		
		System.out.println("Quantidade de números pares: " + pares);
		Leia.close();

	
	}

}
