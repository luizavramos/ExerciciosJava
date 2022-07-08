package Exercicios;

import java.util.Scanner;

public class ExercicioQuatroParImpar {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int numero; 
		double aux;
		
		System.out.println("Informe um número: ");
		numero = entrada.nextInt();
		
		if (numero %2 == 0){
			aux = Math.pow(numero,(0.5));
			System.out.println("Este número é par! E a raiz quadrada dele é: " + aux);
			}
		else {
			aux = Math.pow(numero, 2.0);
			System.out.println("Este número é ímpar! E elevado ao quadrado é: " + aux);
		}
		entrada.close();
	}

}
