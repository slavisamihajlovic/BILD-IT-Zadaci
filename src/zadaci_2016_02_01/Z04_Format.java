/**
 * 
 */
package zadaci_2016_02_01;

import java.util.Scanner;

/**
 * @author Slavisa
 *
 */

public class Z04_Format {

	/**
	 * 4. Napisati metodu sa sljedećim headerom: public static String format(int
	 * number, int width) koja vraća string broja sa prefiksom od jedne ili više
	 * nula. Veli�?ina stringa je width argument. Na primjer, ukoliko pozovemo
	 * metodu format(34, 4) metoda vraća 0034, ukoliko pozovemo format(34, 5)
	 * metoda vraća 00034. Ukoliko je uneseni broj veći nego width argument,
	 * metoda vraća samo string broja. Npr. ukoliko pozovemo format(34, 1)
	 * metoda vraća 34.
	 */

	// metoda za formatiranje
	public static String format(int number, int width) {
		
		String num = number + ""; // pretvaramo unijeti broj u string
		String zero = ""; // string koji ćemo koristiti za nule
		
		// ako je broj veći od širine
		if (width > number) {
			return num; // onda samo ispisujemo unijeti broj
		} else { // a ako nije
			// koristimo for petlju
			for (int i = width - num.length(); i > 0; i--) {
				// dodajemo nule
				zero += 0; 
			}
			// ispisujemo nule i broj
			return zero + num;
		}
	}

	public static void main(String[] args) {

		// pravimo skener
		Scanner input = new Scanner(System.in);
		// unosimo broj
		System.out.print("Unesite broj: ");
		int number = input.nextInt();
		// unosimo širinu
		System.out.print("Unesite širinu: ");
		int width = input.nextInt();
		
		// pozivamo metodu format(number, width) i štampamo rezultat 
		System.out.println(format(number, width));

		input.close(); // zatvaramo skener
	}

}
