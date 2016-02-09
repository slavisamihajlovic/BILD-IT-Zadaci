/**
 * 
 */
package zadaci_2016_02_08;

// https://docs.oracle.com/javase/7/docs/api/java/math/BigInteger.html
import java.math.BigInteger;

/**
 * @author Slavisa
 *
 */

public class Z01_DivisibleBy2Or3 {

	/**
	 * 1. (Divisible by 2 or 3) Find the first ten numbers with 50 decimal
	 * digits that are divisible by 2 or 3.
	 */

	public static void main(String[] args) {
		
			// pravimo najmanji broj sa 50 decimala - početni broj
			BigInteger number = new BigInteger("10000000000000000000000000000000000000000000000000");
			// postavljamo brojač na 0
			int counter = 0;
			// ispisujemo tekst u konzoli
			System.out.println("\n   Prvih 10 brojeva sa 50 decimala, koji su djeljivi\n   sa 2 ili sa 3 su:\n");
			// uslov sve dok je brojač manji od 10 
			while (counter < 10) {
				// uslov ako je broj djeljiv sa 2 ili sa 3
				if (number.mod(new BigInteger("2")).equals(new BigInteger("0"))
						|| number.mod(new BigInteger("3")).equals(new BigInteger("0"))) {
					// ispisujemo broj koji ispunjava uslov
					System.out.println("   " + number);
					// povećavamo brojač za 1
					counter++;
				}
				// povećavamo number za 1, pa ga ponovo vraćamo u petlju i provjeravamo djeljivost sa 2 ili 3
				number = number.add(new BigInteger("1"));
			}
		}
	}