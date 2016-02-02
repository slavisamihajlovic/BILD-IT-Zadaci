/**
 * 
 */
package zadaci_2016_02_01;

import java.util.Scanner;

/**
 * @author Slavisa
 *
 */

public class Z01_ASCII {

	/**
	 * 1. Napisati program koji prima ASCII kod (cijeli broj između 0 i 127) te
	 * ispisuje koji je to karakter. Na primjer, ukoliko korisnik unese 69 kao
	 * ASCII kod, program mu ispisuje da je karakter sa tim brojem karakter E.
	 */
	
	public static void main(String[] args) {

		// pravimo skener
		Scanner input = new Scanner(System.in);

		// boolean za neta�?no postavljen na true
		boolean incorrect = true;

		// ispisuje tekst u konzoli
		System.out.println("Unesite neki broj od 0 do 127: ");

		// dok je neta�?an unos
		while (incorrect) {
			// unosimo broj
			try {
				int number = input.nextInt(); // unosimo broj
				// ako je unešen neki broj od 0 do 127
				if (number >= 0 && number <= 127) {
					System.out.println("ASCII: " + number + " = " + (char) number);
					incorrect = false;
					// ako nije unešen neki broj od 0 do 127
				} else {
					System.out.println("Greška! Unesite broj od 0 do 127: ");
					incorrect = true;

				}
				// hvatamo grešku
			} catch (Exception shikaka) {
				System.out.println("Greška! Unesite broj od 0 do 127: ");
				input.next(); // opet unosimo
			}
		}
		input.close(); // zatvaramo skener
	}
}
