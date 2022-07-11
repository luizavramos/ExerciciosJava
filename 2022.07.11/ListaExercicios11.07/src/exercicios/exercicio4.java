package exercicios;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		
		int idade, sexo, opcoes, contador = 1, calma = 0, mulher = 0, homem = 0, outros = 0, nervosas = 0, menos18 = 0 ;
		
		Scanner Leia = new Scanner(System.in);
		
	 while(contador < 151) {
			System.out.println("Informe a sua idade: ");
			idade = Leia.nextInt();
			
			System.out.println("Informe o seu sexo : 1-feminino / 2-masculino / 3-Outros ");
			sexo = Leia.nextInt();
			
			System.out.println("Tecle 1 se você for uma pessoa calma, 2 se você for uma pessoa nervosa ou 3 se você for uma pessoa agressiva: ");
			opcoes = Leia.nextInt();
			
			if(opcoes == 1) {
				calma++;
			}
			if(opcoes == 1 && sexo == 1 ) {
				mulher++;
			}
			if (opcoes == 2 && sexo == 2) {
				homem++;
			}
			if (opcoes == 1 && sexo == 3) {
				outros++;
			}
			if (opcoes == 2 && idade > 40) {
				nervosas++;
			}
			if (opcoes == 1 && idade < 18) {
				menos18++;
			}
			contador++;
		}
		System.out.println("o número de pessoas calmas: " + calma);	
		
		System.out.println("o número de mulheres nervosas: " + mulher);
		
		System.out.println("o número de homens agressivos: " + homem);
		
		System.out.println("o número de outros calmos: " + outros);
		
		System.out.println("o número de pessoas nervosas com mais de 40 anos: " + nervosas);
		
		System.out.println("o número de pessoas calmas com menos de 18 anos: " + menos18);
		
		Leia.close();
	}

}
