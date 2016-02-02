/**
 * 
 */
package zadaci_2016_02_01;

import java.util.Scanner;

/**
 * @author Slavisa
 *
 */

public class Z02_Unicode {

	/**
	 * 2. Napisati program koji prima karakter te vraća njegov Unicode. Primjer:
	 * ukoliko korisnik unese karakter E program mu vraća 69 kao unicode za taj
	 * karakter.
	 */

	public static void main(String[] args) {

		// pravimo skener
		Scanner input = new Scanner(System.in);

		// boolean za nata�?no postavljen na true
		boolean incorrect = true;
		
		// za unos karaktera
		String c = "";
		
		// ispisuje tekst u konzoli
		System.out.println("Unesite jedan karakter: ");
		
		// dok je neta�?no
		while (incorrect) {
			// pokušavamo
			try {
				// unosimo karakter
				c = input.next();
				// uslov
				if (c.length() == 1) { // ako je dobro
					System.out.println("Unicode za " + c + " je " +  (int) c.charAt(0));
					incorrect = false;
				} else { // ako nije dobro
					System.out.println("Nije dobro. Pokušajte ponovo: ");
					incorrect = true;
				}
				// hvatamo grešku
			} catch (Exception shikaka) {
				
			}
		}
		input.close(); // zatvaramo skener
	}
}
