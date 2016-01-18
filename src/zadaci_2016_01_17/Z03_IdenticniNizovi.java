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

public class Z03_IdenticniNizovi {

	/**
	 * 3. Nizovi niz1 i niz2 su striktno identični ukoliko su svi njihovi
	 * elementi na istim pozicijama jednaki. Napisati metodu koja vraća true
	 * ukoliko su nizovi niz1 i niz2 striktno identični. Koristiti sljedeći
	 * header:
	 * 
	 * public static boolean equals(int[ ] niz1, int[ ] niz2)
	 * 
	 * Napisati testni program koji pita korisnika da unese dva niza cijelih
	 * brojeva te provjerava da li su striktno identični.
	 */

	public static boolean equals(int[] niz1, int[] niz2) {
		// ako nizovi nijesu jednaki, vrOti false
		boolean boole = false;
		// koristimo equals() metod da provjerimo jednakost nizova 
		if (Arrays.equals(niz1, niz2)) {
			// ako su nizovi jednaki vr0ti true
			return true;
		}
		// a ako nisu, zna se
		return boole;
	}

	public static void main(String[] args) {
		
		// pravimo skener
		Scanner input = new Scanner(System.in);
		
		// prvi niz
		int[] niz1 = new int[5];
		// drugi niz
		int[] niz2 = new int[5];

		// kaje de unesemo članove prvog niza
		System.out.print("Unesite članove prvog niza: ");
		for (int i = 0; i < niz1.length; i++) {
			// sad unosimo i unosimo...
			niz1[i] = input.nextInt();
		}
		
		// kaje de unesemo članove prvog niza
		System.out.print("Unesite članove drugog niza: ");
		for (int i = 0; i < niz2.length; i++) {
			// ...i unosimo i unosimo...
			niz2[i] = input.nextInt();
		}
		// zatvaramo skener
		input.close();

		// štampamo rezultat
		System.out.println(equals(niz1, niz2));

	}
}