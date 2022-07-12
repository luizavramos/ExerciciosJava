package exercicios;

import java.util.Random;

public class exercicio3 {

	public static void main(String[] args) {
		Random gerador = new Random();
		
	    int[][] N1 = new int[4][6];
	    int[][] N2 = new int[4][6];
	    int[][] M1 = new int[4][6];
	    int[][] M2 = new int[4][6];
	    
	    for (int l = 0; l < 4; l++) {
	    	for(int c = 0; c < 6; c++) {
	    		N1[l][c] = gerador.nextInt(10);
	    		N2[l][c] = gerador.nextInt(10);
	    	}
	    }
	   for (int l = 0; l < 4; l++){
		   for(int c = 0; c < 6; c++) {
			   M1[l][c] = N1[l][c] + N2[l][c];
			   M2[l][c] = N1[l][c] - N2[l][c];
			   
		   }
	   }
	   System.out.println("Matriz M1");
	   for (int l = 0; l < 4; l++){
		   System.out.println("\n");
		   for(int c = 0; c < 6; c++) {
			System.out.print(M1[l][c] + "|");   
			  
		   }
	   }
	   System.out.println("\n");
	   System.out.println("Matriz M2");
	   for (int l = 0; l < 4; l++){
		   System.out.println("\n");
		   for(int c = 0; c < 6; c++) {
			   System.out.print(M2[l][c] + "|");   
			   
		   }
	   }
	}

}
