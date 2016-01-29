/**
 * 
 */
package zadaci_2016_01_29;

import java.util.Scanner;


/**
 * @author Slavisa
 *
 */

public class Z05_PrintMatrix {
	
	/**
	 * 5. Napisati metodu koja ispisuje n x n matricu
	 * koristeci sledeci header:
	 * public static void printMatrix(int n)
	 * Svaki element u matrici je ili 0 ili 1
	 * generisan nasumicno. Napisati test program
	 * koji pita korisnika da unese "n", te ispisuje
	 * nxn kao u primjeru:
	 * 
	 * 0  1  0
	 * 0  0  0
	 * 1  1  1
	 */

	/*begC
	* D:\Slavisa\workspace\demo\practice\PrintMatrix.java
	* imo sam ovo urađeno od prije, pa sam ga kopirao. samo sam još dodao
	* komentare, jer prije ga nijesam bijo izkomentaris'o :)
	* endC*/
	
	// metoda za štampanje matrice 
	public static void printMatrix(int[][] matrix) {
		// petlja pomoću koje popunjavamo i štampamo matricu random vrijednostima '0' i '1'
		for(int row = 0; row < matrix.length; row++) { // loop za redove
			for(int column = 0; column < matrix[row].length; column++) { // loop za kolone
				matrix[row][column] = (int)(Math.random() * 2); // generiše vrijednosi 0 i 1
				System.out.print(matrix[row][column] + " "); // štampa 0 ili 1, zatim pravi razmak
			}
			System.out.println(); // prelazi u novi red
		}
	}
	
	// glavna metoda
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); // pravimo skener
		System.out.println("Unesite broj redova i kolona: "); // ispisuje tekst u konzoli
		int number = input.nextInt(); // unosimo veličinu matrice
		input.close(); // zatvaramo skener
		int[][] matrix = new int[number][number]; // pravimo matricu
		
		// pozivamo metodu za štampanje matrice
		printMatrix(matrix);
		
	}
	
}
