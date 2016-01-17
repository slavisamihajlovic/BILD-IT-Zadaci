/**
 * 
 */
package zadaci_2016_01_15;

import java.util.Scanner;

/**
 * @author Slavisa
 *
 */

public class Z03_NajveciZajednickiDjelilac {

	/**
	 * 3. Napisati metodu koja prima dva cijela broja kao argumente te vraća
	 * najveći zajednički djelilac za ta dva broja.
	 * 
	 * PRIMJER:
	 * 
	 * Unesite prvi broj: 125
	 * Unesite drugi broj: 2525
	 * Najveći zajednički djelilac za brojeve 125 i 2525 je 25.
	 */

	public static int naZaD(int num1, int num2) {
		// najvećem zajedničkom djeliocu dajemo vrijednost 1
		int naZaD = 1;
		for (int i = 2; i <= num1 && i <= num2; i++) {
			// ako su unešeni brojovi djeljivi sa 'i', onda je 'i' najveći zajednički djelilac
			if (num1 % i == 0 && num2 % i == 0)
				naZaD = i;
		}
		// vraća rezultat
		return naZaD;
	}

	public static void main(String[] args) {

		// unosimo dva broja
		Scanner input = new Scanner(System.in);

		System.out.println("Unesite prvi broj: ");
		int num1 = input.nextInt();

		System.out.println("Unesite drugi broj: ");
		int num2 = input.nextInt();

		// zatvaramo skener
		input.close();

		// štampamo rezultat
		System.out.println("Najveći zajednički djelilac za brojeve: " + num1 + " i " + num2 + " je: " + naZaD(num1, num2) + ".");

	}

}
