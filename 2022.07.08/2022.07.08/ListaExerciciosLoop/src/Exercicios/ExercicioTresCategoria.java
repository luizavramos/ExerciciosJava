package Exercicios;

import java.util.Scanner;

public class ExercicioTresCategoria {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int idade;
		
		System.out.println("Informe a sua idade: ");
		idade = entrada.nextInt();
		
		if (idade >= 10 && idade <= 14){
			System.out.println("Você está na categoria Infantil.");
		} else if (idade >= 15 && idade <= 17) {
			System.out.println("Você está na categoria Juvenil. ");
		} else if (idade >= 18 && idade <= 25) {
			System.out.println("Você está na categoria Adulta. ");
		} else {
			System.out.println("Infelizmente não há categorias onde você se encaixe. ");
		}		

		entrada.close();
	}

}
