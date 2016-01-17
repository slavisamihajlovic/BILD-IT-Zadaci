/**
 * 
 */
package zadaci_2016_01_15;

import java.util.Scanner;

/**
 * @author Slavisa
 *
 */

public class Z02_VowelsAndConsonants {

	/*
	 * 2. Pretpostavimo da su slova A, E, I, O i U samoglasnici. (Smjela
	 * pretpostavka, znam) Napisati program koji pita korisnika da unese string,
	 * te mu ispiše broj samoglasnika i suglasnika u datom stringu.
	 */

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in); // pravimo Scanner

		System.out.println("Unesite string: "); // ispiše nam da unesemo string

		String str = input.nextLine(); // unosimo tekst
		input.close(); // zatvaramo Scanner

		str.toLowerCase(); // pretvaramo unos u mala slova

		int vowels = 0; // postavljamo brojač samoglasnika na 0
		int consonants = 0; // postavljamo brojač suglasnika na 0

		for (int i = 0; i < str.length(); i++) { // petljamo :)
			
			char ch = str.charAt(i); // pretvaramo unos u karaktere
			
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') { // ako je samoglasnik
				vowels++; // povećavamo brojač samoglasnika za 1
			}
			if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u' && ch != ' ') { // ako nije samoglasnik ili razmak
				consonants++; // povećavamo brojač suglasnika za 1
			}
		}
		// ispiše rezultat
		System.out.println("String " + str + " ima " + vowels + " samoglasnika i " + consonants + " suglasnika.");
	}
}