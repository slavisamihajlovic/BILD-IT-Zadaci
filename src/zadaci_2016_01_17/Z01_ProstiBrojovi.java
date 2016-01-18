/**
 * 
 */
package zadaci_2016_01_17;

import java.util.Scanner;

/**
 * @author Slavisa
 *
 */

public class Z01_ProstiBrojovi {

	/**
	 * 1. Napisati metodu koja prima 2 argumenta: početni broj i krajnji broj te
	 * printa sve proste brojeve u zadanom rangu. BONUS: metoda može primati i
	 * treći argument, broj brojeva za isprintati po liniji.
	 */

	public static void printPrimeNumber(int first, int last, int perLine) {

		// postavljamo brojač na 0
		int counter = 0;
		// petlja za ispis prostih brojeva
		for (int number = first; number <= last; number++) {
			// pozivamo metodu koja provjerava da li su brojOvi prosti
			if (primeNumber(number)) {
				counter++;
				// ispisujemo brojeve po liniji, koliko smo odredili
				if (counter % perLine == 0) {
					System.out.println(number + " ");
				} else {
					System.out.print(number + " ");
				}
			}
		}
	}

	public static boolean primeNumber(int number) {
		// postavljamo brojač na 0
		int counter = 0;
		// početna vrijednost djelioca 1
		int divisor = 1;

		// petlja koja provjerava da li je broj prost
		while (divisor <= number) {
			if (number % divisor == 0) {
				counter++;
			}
			divisor++;
		}
		// vraća kad broj jest prost
		return (counter == 2);
	}

	public static void main(String[] args) {

		// pravimo skener
		Scanner input = new Scanner(System.in);

		// unosimo od kojeg broja tražimo
		System.out.print("Unesite prvi broj: ");
		int first = input.nextInt();

		// unosimo do kojeg broja tražimo
		System.out.print("Unesite drugi broj: ");
		int last = input.nextInt();
		// unosimo koliko brojeva po liniji želimo da bude ispisano
		System.out.print("Koliko brojeva po liniji da bude ispisato: ");
		int perLine = input.nextInt();

		// ispisujemo sve proste brojeve
		System.out.println("Prvih " + last + " prostih brojeva su: ");
		// pozivamo metodu printPrimeNumber()
		printPrimeNumber(first, last, perLine);

		// zatvaramo skener
		input.close();
	}

}
