package exercicios;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		int[][] matriz = new int[3][3];
		int soma = 0, somaDiagonal;
		Scanner Leia = new Scanner(System.in);
		
		for(int l = 0; l < 3 ; l++) {
			for(int c = 0; c < 3; c++ ) {
				matriz[l][c] = Leia.nextInt();
				soma += matriz[l][c];
			}
		}
		somaDiagonal = matriz[0][0] + matriz[1][1] + matriz[2][2];
		System.out.println("A soma dos valores da matriz é: " + soma);
		System.out.println("A soma dos valores da diagonal da matriz é: " + somaDiagonal);
	}

}
