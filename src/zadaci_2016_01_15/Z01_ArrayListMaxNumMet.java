/**
 * 
 */
package zadaci_2016_01_15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author Slavisa
 *
 */

public class Z01_ArrayListMaxNumMet {

	/**
	 * 1. Napisati sljedeću metodu koja vraća najveću vrijednosti u ArrayListu
	 * Integera. Metoda vraća null ukoliko je lista null ili ukoliko lista
	 * sadrži 0 elemenata.
	 * 
	 * public static Integer max(ArrayList<Integer> list)
	 */

	public static Integer max(ArrayList<Integer> list) {
		//ako je lista prazna, vrati null
		Integer max = null;
		for(int i = 0; i < list.size(); i++) {
			// ako lista nije prazna...
			if(!list.isEmpty()) {
				//... nalazimo najveći broj u listi koristeći Collections.max()
				return max = Collections.max(list);
			} 
		}
		return max;
	}
	

	public static void main(String[] args) {
		
		// pravimo skener
		Scanner input = new Scanner(System.in);
		
		// pravimo listu
		ArrayList<Integer> list = new ArrayList<>();
		
		System.out.println("Upišite brojeve: ");
		int number;
		
		do {
			// unosimo brojeve u listu. za prekid unosa unosimo nulu
			number = input.nextInt();
			if(number != 0) {
				list.add(number);
			}
		} while(number != 0);
		
		//zatvaramo skener
		input.close();
		
		// štampamo rezultat
		System.out.println("Najveći broj u listi je: " + max(list));
	}

}