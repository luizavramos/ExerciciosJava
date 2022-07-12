package exercicios;

import java.util.Random;

public class exercicio2 {

	public static void main(String[] args) {
	    Random gerador = new Random (6);
	    int[] dado = new int[10];
	    int soma = 0, maior = 0, contador = 0, media;
	    
	    for (int i = 0; i < 10; i++) {
		    dado[i] = gerador.nextInt(1,7);
		    soma += dado[i];
		    if (dado[i] > maior) {
		    	maior = dado[i];
		    }
		    
	    }
		    
		for (int i=0; i<10; i++) {
			System.out.println(dado[i]);
			if (dado[i] == maior) {
				contador++;
			}
		}
	     media = soma/10;
	     System.out.println("A média aritmética dos lançamentos é: " + media);
	     System.out.println("A quantidade de vezes que ocorreram a maior pontuação foi: " + contador);
		

	}

}
