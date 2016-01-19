/**
 * 
 */
package zadaci_2016_01_18;

import java.util.Scanner;

/**
 * @author Slavisa
 *
 */

public class Z01_NajmanjiFaktoriBroja {

	/**
	 * 1. Napisati program koji pita korisnika da unese neki cijeli broj te
	 * ispisuje njegove najmanje faktore u rastućem redosljedu. Na primjer,
	 * ukoliko korisnik unese 120 program treba da ispiše:
	 * 
	 * 2, 2, 2, 3, 5. (2 * 2 * 2 * 3 * 5 = 120)
	 */

	public static void main(String[] args) {

		// pravimo skener
		Scanner input = new Scanner(System.in);
		
		System.out.print("Unesite cijeli broj: ");
		
		// unosimo broj
		int number = input.nextInt();
		
		// zatvaramo skener
		input.close();

		int num = number;
		int counter = 0;
		// provjeravamo da li je broj djeljiv sa bilo kojim brojem manjim od sebe
		for (int i = 2; i < num; i++) {
			// dok god je broj djeljiv sa 'i', dijelimo ga i štampamo 'i'
			while (number % i == 0) {
				number = number / i;
				System.out.print(i + " ");
				// brojimo najmanje faktore broja
				counter++;
			}
		}
		// ako broj nema manjih faktora, znači da je prost i ne može se podijeliti podijeliti na manje faktore
		if (counter == 0) {
			System.out.println("Broj koji ste unijeli je prost i ne može se podijeliti na manje faktore.");
		}

	}

}