/**
 * 
 */
package zadaci_2016_01_17;

import java.util.Scanner;

/**
 * @author Slavisa
 *
 */

public class Z04_NajveciElementU2DNizu {

	/**
	 * 4. Napisati metodu koja vraća lokaciju najvećeg elementa u 2D nizu.
	 * Metoda treba da koristi sljedeći header:
	 * 
	 * public static int[ ] locateLargest(double[ ][ ] a)
	 * 
	 * Napisati test program koji pita korisnika da unese 2D niz te mu ispisuje
	 * lokaciju najvećeg elementa u nizu.
	 */

	public static int locateLargest(double[][] a) {

		// određujemo najveći element matrice 
		double max = a[0][0];
		// prvi index
		int index1 = 0;
		// drugi index
		int index2 = 0;
		
		// petlja koja prolazi kroz cijelu matricu
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				// ako je bilo koji broj matrice veci od max
				if (a[i][j] > max) {
					// onda on postaje najveći broj
					max = a[i][j];
					// prvi index najveceg broja matrice
					index1 = i;
					// drugi index najveceg broja matrice
					index2 = j;
				}
			}
		}
		// štampamo rezultat (najveći broj matrice i njegov indeks)
		System.out.println("Najveci broj u matrici je " + max + "\nOn se nalazi na indexu: (" + index1 + ", " + index2 + ")");
		return (int) max;
	}

	public static void main(String[] args) {
		// pravimo skener
		Scanner input = new Scanner(System.in);

		// unosimo broj redova
		System.out.print("Unesite broj redova niza: ");
		int row = input.nextInt();
		// unosimo broj kolona
		System.out.print("Unesite broj kolona niza: ");
		int column = input.nextInt();

		// unos broja redova i kolona
		double[][] matrix = new double[row][column];

		// kaje nam da unesemo elemente
		System.out.print("Unesite " + row + " reda i " + column + " kolone: ");
		// petlja Ivice i Matrice i unos elemenata matrice
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				// unosimo elemente u matricu
				matrix[i][j] = input.nextInt();
				// ispisujemo elemente
				System.out.print(matrix[i][j] + " ");
			}
			// [Enter]
			System.out.println();
		}
		// pozivamo metodu locatelargest(matrix)
		locateLargest(matrix);

		// zatvaramo skener
		input.close();
	}
}