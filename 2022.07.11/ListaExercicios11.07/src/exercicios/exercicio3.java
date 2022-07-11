package exercicios;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		
		int menor = 0, maior =0, idade = 0;
		
		Scanner Leia = new Scanner(System.in);
		
		System.out.println("Esse é um programa que conta quantas pessoas tem menos de 21 anos e quantas pessoas tem mais de 50 anos. Para sair do programa coloque -99.");
		
		while(idade != -99) {
		
			System.out.println("Informe a sua idade: ");
			idade = Leia.nextInt();
			
			if (idade < 21) {
				menor++;
			}
			else if (idade>50) {
				maior++;
			}		
				
			}
		
		System.out.println("O total de pessoas com menos de 21 anos: " + menor + " pessoas");
		System.out.println("O total de pessoas com mais de 50 anos: " + maior + " pessoas");
		Leia.close();
	}

}
