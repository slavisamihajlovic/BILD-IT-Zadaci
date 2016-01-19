/**
 * 
 */
package zadaci_2016_01_18;

/**
 * @author Slavisa
 *
 */

public class Z04_StoNasumicnihKaraBrojeva {

	/**
	 * 4. Napisati metodu koja printa 100 nasumičnih uppercase karaktera i 100
	 * nasumičnih brojeva, 10 po liniji.
	 */

	// metoda za ispis karaktera
	public static void hundreadRandomChars() {	
		
		// pravimo string sa karakterima alfa, beta, gama delta... :)
		String array = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		// petlja koja petlja 100x
		for(int i = 0; i < 100; i++) {
			// prelazimo u novi red svakih deset puta
			if(i % 10 == 0) {
				System.out.println();
			}
			// nasumično generičemo karaktere iz niza
			char ch = array.charAt((char)(Math.random()*26));
			// ispisujemo karaktere
			System.out.print(ch + " ");
		}
	}
	
	// metoda za ispis brojeva
	public static void hundreadRandomNumbers() {	
		
		// petlja koja petlja 100x
		for(int i = 0; i < 100; i++) {
			// prelazimo u novi red svakih deset puta
			if(i % 10 == 0) {
				System.out.println();
			}
			// generišemo nasumične brojeve od 0 do 9
			int broj = (int)(Math.random()*10);
			// ispisujemo brojove
			System.out.print(broj + " ");
		}
	}

	public static void main(String[] args) {
		
		// pozivamo metodu hundreadRandomChars()
		System.out.println("Nasumični karakteri: \n====================");
		hundreadRandomChars();
		
		// [ENTER]
		System.out.println();
		
		// pozivamo metodu hundreadRandomNumbers()
		System.out.println("\nNasumični brojevi: \n==================");
		hundreadRandomNumbers(); // pozivanje metode nasumicnih brojeva
	}
}