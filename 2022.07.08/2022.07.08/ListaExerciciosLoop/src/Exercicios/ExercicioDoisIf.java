package Exercicios;


import java.util.Scanner;

public class ExercicioDoisIf {

	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		
		int aux, aux2;
		
		int [] listaDeNumeros = new int[3];
		
		for(int i = 0; i < 3; i++) {
			aux = ( i + 1 );
			System.out.println("Digite o " + aux + "º número: ");
			listaDeNumeros[i] = (entrada.nextInt());
			if (listaDeNumeros[0] < listaDeNumeros[i]){
				aux2 = listaDeNumeros[0];
				listaDeNumeros[0] = listaDeNumeros[i];
				listaDeNumeros[i] = aux2;
			} 
		}
		
		for(int i = 0; i < 3; i++) {
			if (listaDeNumeros[1] < listaDeNumeros[i]){
				aux2 = listaDeNumeros[1];
				listaDeNumeros[1] = listaDeNumeros[i];
				listaDeNumeros[i] = aux2;
			} 
		}
		
		for(int i = 0; i < 3; i++) {
			if (listaDeNumeros[2] < listaDeNumeros[i]){
				aux2 = listaDeNumeros[2];
				listaDeNumeros[2] = listaDeNumeros[i];
				listaDeNumeros[i] = aux2;
			} 
		}		
		
		
		System.out.println("Ordem crescente:  ");
		for (int j = 0; j < 3; j++) {
			System.out.println(listaDeNumeros[j] + "  ");
		}	
		entrada.close();
	}

}
