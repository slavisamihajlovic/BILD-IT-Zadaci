/**
 * 
 */
package zadaci_2016_01_29;

/**
 * @author Slavisa
 *
 */
public class Z03_SumResults {

	/**
	 * 3. Napisati program koji sabira sljedeću seriju 1/3 + 3/5 + 5/7 + 7/9 +
	 * 9/11 + 11/13 ..... + 95/97 + 97/99.
	 */

	public static void main(String[] args) {

		double x, y; // inicijalizujemo x i y
		double sum = 0; // postavljamo sumu na 0
		
		// petlja u kojoj dodjeljujemo vrijednosti varijabli 'x' i 'y',
		// povećavamo ih za 2, dijelimo
		for (x = 1, y = 3; y <= 99; x += 2, y += 2) {
			
			System.out.print(x + " / " + y + " = "); // štampamo "x/y = "
			System.out.printf("%.2f", (x / y)); // štampamo rezultat (x/y) zaokruženo na dvije decimale
			System.out.println(); // novi red
			sum = (sum + (x / y)); // svaki puta dodajemo zbiru vrijednost "(x/y)"
		}
		// štampamo rezultat zaokružen na dvije decimale
		System.out.printf("\nUkupan zbir svih rezultata je: " + "%.2f", sum);
	}
}
