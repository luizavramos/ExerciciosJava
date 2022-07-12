package exercicios;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		int[] vetor = new int [5];
		int aux = 0;
		Scanner Leia = new Scanner(System.in);
		
		for (int i = 0; i < 5; i++) {
		
			System.out.println(" Informe o " + (i+1) +"º número. ");
			vetor[i] = Leia.nextInt();
			if (aux < vetor[i]) {
				aux = vetor[i];
			}
		}
		System.out.println("O maior número é: " + aux);
		
		

	}

}
