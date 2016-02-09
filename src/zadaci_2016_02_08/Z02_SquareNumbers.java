/**
 * 
 */
package zadaci_2016_02_08;

//https://docs.oracle.com/javase/7/docs/api/java/math/BigInteger.html
import java.math.BigInteger;

/**
 * @author Slavisa
 *
 */

public class Z02_SquareNumbers {

	/**
	 * 2. (Square numbers) Find the first ten square numbers that are greater
	 * than Long.MAX_VALUE. A square number is a number in the form of n2. For
	 * example, 4, 9, and 16 are square numbers. Find an efficient approach to
	 * run your program fast.
	 */

	public static void main(String[] args) {

		// štampamo tekst u konzoli
		System.out.println("\n   Najveći long je: " + Long.MAX_VALUE);
		// najveću vrijednost long-a pretvaramo u string
		String maxLong = Long.MAX_VALUE + "";
		// broj od kog krećemo je maxLong + 1
		BigInteger number = new BigInteger(maxLong).add(new BigInteger("1"));
		// postavljamo brojač na 0
		int counter = 0;
		// štampamo tekst u konzoli
		System.out.println("\n   Prvih deset brojeva na kvadrat,\n   koji su veći od najvećeg long-a su:\n");
		// while petlja radi sve dok je uslov da je brojač manji od 10
		while (counter < 10) {
			// kvadriramo broj
			BigInteger square = number.pow(2);
			// štampamo tekst u konzoli
			System.out.println("   " + square);
			// povećavamo number za 1
			number = number.add(new BigInteger("1"));
			// povećavamo brojač za 1
			counter++;
		}
	}
}