package Exercicios;

import java.util.Scanner;

public class ExercicioQuatroParImpar {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int numero; 
		double aux;
		
		System.out.println("Informe um n�mero: ");
		numero = entrada.nextInt();
		
		if (numero %2 == 0){
			aux = Math.pow(numero,(0.5));
			System.out.println("Este n�mero � par! E a raiz quadrada dele �: " + aux);
			}
		else {
			aux = Math.pow(numero, 2.0);
			System.out.println("Este n�mero � �mpar! E elevado ao quadrado �: " + aux);
		}
		entrada.close();
	}

}
