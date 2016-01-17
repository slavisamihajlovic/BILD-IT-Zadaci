/**
 * 
 */
package zadaci_2016_01_15;

/**
 * @author Slavisa
 *
 */

public class Z04_BrojPonavljanjaBrojeva {

	/**
	 * 4. Napišite program koji generiše 100 nasumičnih cijelih brojeva između 0
	 * i 9 te ispisuje koliko se puta koji broj ponovio.
	 */

	public static void main(String[] args) {

		// pravimo niz brojeva od 0 do 9
		int[] array = new int[10];
		
		// pravimo promjenljivu counter i dodjeljujemo joj vrijednost 1 
		int counter = 1;

		System.out.println("100 nasumično generisanih brojeva:\n");
		
		// generišemo 100 nasumicnih brojeva u niz od 0 do 9 i brojimo koliko se koji ponovio		
		for (int i = 1; i <= 100; i++) {
			int number = (int) (Math.random() * 10);
			array[number]++;
			
			// štampamo niz od 100 brojeva u 10 redova
			if (counter < 10) {
				System.out.print(number + "  ");
				counter++;
			} else {
				System.out.printf(number + "\n");
				counter = 1;
			}
		}
		
		System.out.println();

		// štampamo rezultat
		for (int i = 0; i < array.length; i++) {
			System.out.println("Broj " + i + " se ponovio " + array[i] + " puta.");

		}
	}
}