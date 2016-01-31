/**
 * 
 */
package zadaci_2016_01_30;

import java.util.Scanner;

/**
 * @author Slavisa
 *
 */

public class Z01_PalindromeCheck {

	/**
	 * 1. Napisati program koji pita korisnika da unese cijeli trocifreni broj
	 * te provjerava da li je unijeti broj palindrom. Broj je palindrom ukoliko
	 * se čita isto i sa lijeva na desno i sa desna na lijevo npr. 121, 131,
	 * itd.
	 */

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in); // pravimo skener
		
		System.out.println("Uneseite neki broj: "); // ispisuje tekst u konzoli
		
		int number = input.nextInt(); //unosimo broj
		
		input.close(); // zatvaramo skener
		
		// pravimo n i dajemo mu vrijednos od number, kako bi sačuvali
		// vrijednost number za poređenje na kraju
		int n = number;
		
		int backward = 0; // 
		// okrećemo broj naopako, da bi ga mogli porediti sa unesenom vrijednošću
		while (n != 0) { // sve dok n nije 0,
			backward = backward * 10; // radi ovo,
			backward = backward + n % 10; // ovo
			n = n / 10; // i ovo :)
		}
		
		// poredimo unijeti i naopaki broj
		if (number == backward) { // ako je isti
			System.out.println("Uneseni broj " + number + " je palindrom."); // onda je palindrom
		} else { // ako nije isti
			System.out.println("Uneseni broj " + number + " nije palindrom."); // onda nije isti
		}
	}

}
