/**
 * 
 */
package zadaci_2016_01_17;

import java.util.Scanner;

/**
 * @author Slavisa
 *
 */
public class Z02_NajmanjiElement {

	/**
	 * 2. Napisati metodu koja nalazi najmanji element u nizu decimalnih
	 * vrijednosti koristeći se sljedećim headerom:
	 * 
	 * public static double min(double[ ] array)
	 * 
	 * Napišite potom test program koji pita korisnika da unese deset brojeva,
	 * te poziva ovu metodu da vrati najmanji element u nizu.
	 */

	public static double min(double niz[]) {

		// određujemo najmanji element niza
		double min = niz[0];

		for (int i = 1; i < niz.length; i++) {
			// ako je neki element broj niza manji od najmanjeg elementa
			if (niz[i] < min) {
				// onda on postaje najmanji element niza
				min = niz[i];
			}
		}
		// ispisujemo najmanji element niza
		System.out.println("Najmanji element niza je: " + min);
		return min;
	}

	public static void main(String[] args) {

		// pravimo skener
		Scanner input = new Scanner(System.in);

		// kaje unesite broj...
		System.out.print("Unesite broj elemenata u nizu: ");
		
		// ... mi unosimo
		int duzina = input.nextInt();

		// unosimo broj dužine niza
		double brojevi[] = new double[duzina];

		System.out.println("Unesite " + duzina + " elemenata niza: ");
		// ubacujemo elemente u niz
		for (int i = 0; i < brojevi.length; i++) {
			brojevi[i] = input.nextDouble();
		}

		// pozivamo metodu min(brojevi)
		min(brojevi);

		// zatvaramo skener
		input.close();
	}

}