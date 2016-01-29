/**
 * 
 */
package zadaci_2016_01_29;

import java.util.Scanner;

/**
 * @author Slavisa
 *
 */

public class Z04_SumDigits {

	/*
	 * 4. Napisati metodu koja izračunava zbir svih brojeva u cijelom broju.
	 * Koristite sljedeći header: public static int sumDigits(long n). Na
	 * primjer, ako pozovemo metodu i proslijedimo joj broj 234 (sumDigits(234))
	 * metoda treba da vrati 9. (2 + 3 + 4 = 9)
	 */

	// metoda koja vraća zbir cifara unijetog broja
	public static int sumDigits(long n) {

		/*
		 * begC http://www.javaforstudents.co.uk/Code_snippets/
		 * Sum_of_digits_of_a_number endC
		 */
		int sum = 0; // postavljamo vrijednost sume na 0

		// sve dok unijeti broj nije 0
		while (n != 0) {
			// sumi dodajemo posljednju cifru
			sum += n % 10;
			// broj dijelimo sa 10, tako da sada zadnja cifra otpada i sada broj
			// sa preostalim ciframa vraćamo ponovo na početak while petlje
			n /= 10;
		}
		// 
		return sum;

	}

	// glavna metoda
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in); // pravimo skener

		System.out.print("Unesite neki broj: "); // ispisuje neki tekst u konzoli

		int number = input.nextInt(); // unosimo broj

		input.close(); // zatvaramo skener

		// pozivamo metodu za sabiranje cifara broja i štampamo rezultat
		System.out.println("Zbir cifara broja " + number + " je " + sumDigits(number) + ".");
	}
}
