package Exercicios;

import java.util.Scanner;

public class ExercicioUmIf {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int num1, num2, num3;
		
		System.out.println("Digite o Primeiro n�mero: ");
		num1 = entrada.nextInt();
		
		System.out.println("Digite o segundo n�mero: ");
		num2 = entrada.nextInt();
		
		System.out.println("Digite o terceiro n�mero: ");
		num3 = entrada.nextInt();
		
		
		if (num1 > num2 && num1 > num3) {
			System.out.println("O primeiro n�mero � o maior: " + num1);
		} else if (num2 > num1 && num2 > num3) {
			System.out.println("O segundo n�mero � o maior: " + num2);
		}
		else {
			System.out.println("O Terceiro n�mero � o maior: " + num3 );
		}
		entrada.close();

	}

}
