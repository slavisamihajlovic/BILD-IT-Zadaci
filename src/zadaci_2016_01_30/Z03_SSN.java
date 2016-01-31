/**
 * 
 */
package zadaci_2016_01_30;

import java.util.Scanner;

/**
 * @author Slavisa
 *
 */

public class Z03_SSN {

	/**
	 * 3. Napisati program koji pita korisnika da unese Social Security Number
	 * (SSN) u formatu DDD-DD-DDDD gdje D predstavlja broj. Program treba da
	 * provjerava da li je broj unesešen u ispravnom formatu. Ukoliko nije,
	 * program pita korisnika da pokuša ponovo. Ukoliko jeste unešen u pravom
	 * formatu, program završava sa radom.
	 */

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in); // pravimo skener

		boolean incorrect = true; // pravimo boolean za netačno

		// ispisuje tekst u konzoli
		System.out.println("Unesite Social Security Number u formatu XXX-XX-XXXX: ");

		// do while
		do {
			// pokušavamo
			try {

				String ssn = input.nextLine(); // unosimo string

				char[] c = ssn.toCharArray(); // pretvaramo string u char array
				
				// provjeravamo dužinu unijetog stringa i da li su '-' i brojevi na pravim mjestima
				if (c.length == 11 && c[3] == '-' && c[6] == '-' && Character.isDigit(c[0]) && Character.isDigit(c[1])
						&& Character.isDigit(c[2]) && Character.isDigit(c[4]) && Character.isDigit(c[5])
						&& Character.isDigit(c[7]) && Character.isDigit(c[8]) && Character.isDigit(c[9])
						&& Character.isDigit(c[10])) {
					// štampamo ukoliko je tačno
					System.out.println("Dobro ste unijeli! Vaš SSN je: " + ssn);
					incorrect = false;
				} else {
					// štampamo ukoliko je netačno unijeto
					System.out.println("Netačan unos, pokušajte ponovo, koristite format XXX-XX-XXXX: ");
				}
			} catch (Exception shikaka) { // hvatamo grešku
				input.nextLine(); // i ponovo unosimo SSN
			}
			
		} while (incorrect); // sve dok ne pogodimo
		
		input.close(); // zatvaramo skener
	}

}
