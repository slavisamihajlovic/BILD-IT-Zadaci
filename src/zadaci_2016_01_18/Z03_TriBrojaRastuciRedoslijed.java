/**
 * 
 */
package zadaci_2016_01_18;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Slavisa
 *
 */

public class Z03_TriBrojaRastuciRedoslijed {

	/**
	 * 3. Napisati metodu sa sljedećim headerom koja ispisuje tri broja u
	 * rastućem redosljedu:
	 * 
	 * public static void displaySortedNumbers(double num1, double num2, double num3).
	 * 
	 * Napisati program koji pita korisnika da unese tri broja te ispiše ta tri
	 * broja u rastućem redosljedu.
	 */

	public static void displaySortedNumbers(double num1, double num2, double num3) {
		// mećemo brojove u niz
		double[] array = { num1, num2, num3 };
		
		// koristimo Arrays.sort() da sortitamo niz
		Arrays.sort(array);
		
		// ispisujemo brojove u rastućem redoslijedu
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

	public static void main(String[] args) {
		// pravimo skener
		Scanner input = new Scanner(System.in);
		
		// unosimo tri broja
		System.out.print("Unesite prvi broj: ");
		double num1 = input.nextDouble();
		
		System.out.print("Unesite drugi broj: ");
		double num2 = input.nextDouble();
		
		System.out.print("Unesite treći broj: ");
		double num3 = input.nextDouble();

		// zatvaramo skener
		input.close();

		// pozivamo metodu
		displaySortedNumbers(num1, num2, num3);

	}

}