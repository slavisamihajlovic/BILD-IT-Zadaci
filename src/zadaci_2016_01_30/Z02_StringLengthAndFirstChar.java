/**
 * 
 */
package zadaci_2016_01_30;

import java.util.Scanner;

/**
 * @author Slavisa
 *
 */

public class Z02_StringLengthAndFirstChar {

	/**
	 * 2. Napisati program koji pita korisnika da unese neki string te mu
	 * ispisuje dužinu tog stringa kao i prvo slovo stringa.
	 */

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in); // pravimo skener
		
		System.out.println("Unesite string: "); // ispisuje tekst u konzoli
		
		String str = input.nextLine(); // upisujemo string
		
		input.close(); // zatvaramo skener
				
		// računamo dužinu stringa koristeći .length()
		System.out.println("Dužina stringa je: " + str.length());

		// koristimo .charAt(0), kako bi vidjeli koje slovo se nalazi na indeksu 0, tj. prvo slovo
		System.out.println("Prvo slovo stringa je: " + str.charAt(0));
	}

}
