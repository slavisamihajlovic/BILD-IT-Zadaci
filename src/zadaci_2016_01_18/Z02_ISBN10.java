/**
 * 
 */
package zadaci_2016_01_18;

import java.util.Scanner;

/**
 * @author Slavisa
 *
 */

public class Z02_ISBN10 {

	/**
	 * 2. ISBN-10 (International Standard Book Number) se sadrži od 10 brojeva:
	 * d1 d2 d3 d4 d5 d6 d7 d8 d9 d10. Posljednji broj,
	 * 
	 * d10, služi kao checksum i njega izračunavamo iz prvih devet brojeva
	 * koristeći se sljedećom formulom: (d1 * 1 + d2 * 2 + d3
	 * 
	 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11. Ukoliko je
	 * checksum 10, zadnji broj označavamo sa X u
	 * 
	 * skladu sa ISBN-10 konvencijom. Napisati program koji pita korisnika da
	 * unese prvih 9 brojeva te ispiše desetocifreni
	 * 
	 * ISBN-10 broj. (Primjer: ukoliko unesemo, kao prvih 9 brojeva, 013601267
	 * program nam ispisuje 0136012671 kao ISBN-10 broj.
	 * 
	 * Ukoliko unesemo 013031997 kao prvih 9 brojeva, program nam ispisuje
	 * 013031997X kao ISBN-10 broj)
	 */

	public static void main(String[] args) {

		// pravimo skener
		Scanner input = new Scanner(System.in);

		// pravimo niz
		int[] array = new int[9];

		System.out.println("Unesite prvih devet brojeva vaseg ISBN-a: ");

		// unosimo 9 cifara ISBN broja
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}

		// formula izračunavanja 10. broja ISBN-a po konvenciji
		int formula = (array[0] * 1 + array[1] * 2 + array[2] * 3 + array[3] * 4 + array[4] * 5 + array[5] * 6 + array[6] * 7
				+ array[7] * 8 + array[8] * 9) % 11;

		System.out.println("Vaš ISBN broj je: ");
		// ispisujemo prvih devet unešenih brojova
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}
		// ako smo po formuli deseti broj jednak 10...
		if (formula == 10) {
			// ... onda po konvenciji štampamo X
			System.out.print("X");
			// u svim ostalim slučajevima...
		} else {
			// štampamo broj koji smo dobili po formuli
			System.out.print(formula);
		}
		// zatvaramo skener
		input.close();
	}

}