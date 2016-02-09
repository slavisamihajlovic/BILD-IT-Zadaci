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

public class Z03_LargePrimeNumbers {

	/**
	 * 3. (Large prime numbers) Write a program that finds five prime numbers
	 * larger than Long.MAX_VALUE.
	 */

	public static void main(String[] args) {

		// štampamo tekst u konzoli
		System.out.println("\n   Najveći long je: " + Long.MAX_VALUE);
		// najveću vrijednost long-a pretvaramo u string
		String maxLong = Long.MAX_VALUE + "";
		// štampamo tekst u konzoli
		System.out.println("\n   Prvih pet prostih brojeva koji su\n   veći od najvećeg longa su:\n");
		// broj od kog krećemo je maxLong + 1
		BigInteger number = new BigInteger(maxLong).add(new BigInteger("1"));
		// postavljamo brojač na 0
		int counter = 0;
		// uslov
		while (counter < 5) {
			// uslov u kojem ispitujemo da li je prost sa metodom koja nam se
			// nalazi u big integer klasi
			if (number.isProbablePrime(100)) {
				// štampamo broj, ako je uslov ispunjen
				System.out.println("   " + number + " > " + maxLong);
				// povećavamo brojač za 1
				counter++;
			}
			// povećavamo number za 1
			number = number.add(new BigInteger("1"));
		}
	}
}