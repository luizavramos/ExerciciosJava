package Exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class ExercicioDoisIf {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int aux;
		
		int [] listaDeNumeros = new int[3];
		for(int i = 0; i < 3; i++) {
			aux = ( i + 1 );
			System.out.println("Digite o " + aux + "º número: ");
			listaDeNumeros[i] = (entrada.nextInt());
			}
		
		Arrays.sort(listaDeNumeros);
		
		System.out.println("Ordem crescente:  ");
		for (int j = 0; j < 3; j++) {
			System.out.println(listaDeNumeros[j] + "  ");
		}	
		entrada.close();
	}

}
