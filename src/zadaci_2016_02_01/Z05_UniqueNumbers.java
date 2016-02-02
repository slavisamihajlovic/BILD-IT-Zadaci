/**
 * 
 */
package zadaci_2016_02_01;

import java.util.*;

/**
 * @author Slavisa
 *
 */

public class Z05_UniqueNumbers {

	/**
	 * 5. Napisati program koji u�?itava 10 brojeva te ispisuje koilko je
	 * jedinstvenih brojeva unijeto te sve jedinstvene brojeve koji su unijeti,
	 * razmaknute jednim spaceom. Ukoliko se neki broj pojavljuje više puta,
	 * broj treba ispisati samo jednom.
	 */

	public static void main(String[] args) {

		// pravimo skener
		Scanner input = new Scanner(System.in);
		
		// broja�? jedinstvenih
		int unique = 0;
		
		// ispisuje tekst u konzoli
		System.out.println("Unesite deset brojova: ");
		
		// pravimo array u koji ćemo unijeti deset brojova
		int[] array = new int[10];


		// unosimo brojove u array
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}

		input.close(); // zatvaramo skener
		
		// sortiramo brojove u array-u
		Arrays.sort(array);

		// pravimo listu
		ArrayList<Integer> uniqueList = new ArrayList<Integer>();

		// brojovi koje unesemo sortirani po veli�?ini
		System.out.println("\nSortirani unijeti brojovi: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

		// for petlja pomoću koje tražimo jedinstvene brojove
		for (int i = 1; i < array.length; i++) {
			// poredimo svaki broj sa prethodnim brojem u array-u
			if (array[i - 1] != (array[i])) { // ako nije isti ko prethodni
				uniqueList.add(array[i]); // dodajemo broj u listu jedinstvenih
				unique++; // povećavamo broja�? duplih
			}
		}

		// štampamo rezultat
		System.out.println("\n\nBroj jedinstvenih unijetih brojova je: " + unique);
		System.out.print("Jedinstveni brojovi su: ");
		// štampamo jedinstvene brojove
		for (Integer u : uniqueList) {
			System.out.print(u + " ");
		}
	}
}
