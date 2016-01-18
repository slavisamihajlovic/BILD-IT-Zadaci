/**
 * 
 */
package zadaci_2016_01_17;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Slavisa
 *
 */

public class Z05_SortiranjeRedova2DNiz {

	/**
	 * 5. Implementirati sljedeću metodu da sortira redove u 2D nizu.
	 * 
	 * public static double[ ][ ] sortRows(double[ ][ ] array)
	 * 
	 * Napisati testni program koji pita korisnika da unese 3x3 matricu (ili da
	 * pita korisnika koliku matricu želi unijeti) te mu ispisuje na konzoli
	 * matricu sa sortiranim redovima - od najmanjeg broja do najvećeg.
	 */

	public static double[][] sortRows(double[][] array) {
		// petlja koja petlja :)
		for (int i = 0; i < array.length; i++) {
			// sortiramo redove matrice
			Arrays.sort(array[i]);
		}
		// rezultat je matrica sa sortiranim redovima
		return array;
	}

	public static void main(String[] args) {
		// pravimo skener
		Scanner input = new Scanner(System.in);

		// unos broja redova i kolona matrice
		System.out.print("Unesite broj redova matrice: ");
		int redovi = input.nextInt();
		System.out.print("Unesite broj kolona matrice: ");
		int kolone = input.nextInt();

		// matrica
		double[][] matrix = new double[redovi][kolone];

		System.out.print("\nUnesite " + redovi + " reda i " + kolone + " kolone: \n");
		// unosimo brojove u matricu
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = input.nextDouble();
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		// pozivamo metodu sortRows(matrix)
		double[][] niz = sortRows(matrix);

		// ispisujemo matricu sa sortiranim redovima
		System.out.println("\nSortirani redovi matrice su: ");
		for (int i = 0; i < niz.length; i++) {
			for (int j = 0; j < niz[i].length; j++) {
				System.out.print(niz[i][j] + " ");
			}
			System.out.println();

		}
		// zatvaramo skener
		input.close();
	}

}