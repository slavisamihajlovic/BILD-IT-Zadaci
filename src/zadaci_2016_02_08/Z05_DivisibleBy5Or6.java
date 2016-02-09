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

public class Z05_DivisibleBy5Or6 {

	/**
	 * 5. (Divisible by 5 or 6) Find the first ten numbers greater than
	 * Long.MAX_VALUE that are divisible by 5 or 6.
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
		System.out.println(
				"\n   Prvih 10 brojeva koji su veći od najvećeg\n   longa i koji su djeljivi sa 5 ili 6 su:\n");
		// petlja radi dok je brojač manji od 10
		while (counter < 10) {
			// uslov u kom gledamo da li je ostatak djeljenja sa 5 ili 6 jednak
			// 0, tj. da li je broj djeljiv
			if (number.mod(new BigInteger("5")).equals(new BigInteger("0"))
					|| number.mod(new BigInteger("6")).equals(new BigInteger("0"))) {
				// štampamo broj, ako je uslov ispunjen
				System.out.println("   " + number + " > " + maxLong);
				// povećavamo brojač za 1, ako je uslov ispunjen
				counter++;
			}
			// povećavamo number za 1
			number = number.add(new BigInteger("1"));
		}
	}

}