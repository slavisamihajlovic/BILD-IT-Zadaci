/**
 * 
 */
package zadaci_2016_01_16;

import java.util.Scanner;

/**
 * @author Slavisa
 *
 */

public class Z04_PrintMatrix {
	
	/**
	 * 4. Napisati metodu koja ispisuje n x n matricu
	 * koristeci sledeci header:
	 * public static void printMatrix(int n)
	 * Svaki element u matrici je ili 0 ili 1
	 * generisan nasumicno. Napisati test program
	 * koji pita korisnika da unese "n", te ispisuje
	 * nxn kao u primjeru:
	 * 0  1  0
	 * 0  0  0
	 * 1  1  1
	 */

	public static void printMatrix(int[][] matrix) {
		
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = (int)(Math.random() * 2);
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Unesite broj redova i kolona: ");
		int n = input.nextInt();
		
		input.close();
		
		int[][] matrix = new int[n][n];
		
		printMatrix(matrix);
		
		
		
	}
	
}
