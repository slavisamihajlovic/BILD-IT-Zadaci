/**
 * 
 */
package zadaci_2016_01_18;

import java.util.ArrayList;
import java.util.Scanner;

public class Z05_ProsjekCijelihBrojeva {

	/**
	 * Zadatak: 5. Napisati program koji učitava neodređeni broj cijelih brojeva
	 * (nula prekida unos) te ispisuje koliko je brojeva bilo iznad ili jednako
	 * prosjeku svih unešenih brojeva a koliko je bilo brojeva ispod prosjeka.
	 * Pretpostavimo da je maksimalan niz brojeva koje korisnik može unijeti
	 * 100.
	 */

	public static void main(String[] args) {

		// pravimo skener
		Scanner input = new Scanner(System.in);

		int number;
		// postavljamo brojače na 0
		double sum = 0;
		double average = 0;

		int aboveAverage = 0;
		int belowAverage = 0;

		// pravimo Array listu
		ArrayList<Integer> list = new ArrayList<>();

		System.out.println("Unesite brojeve: ");
		do {
			// unosimo brojeve
			number = input.nextInt();
			// ako unesemo 100 brojeve, izlazimo iz petlje
			if (list.size() == 100) {
				break;
			}
			// sve dok broj nije 0
			if (number != 0) {
				// dodajemo brojeve u listu
				list.add(number);
				// sabiremo brojeve
				sum = sum + number;
			}
			// kad unesemo nulu...
		} while (number != 0);

		// ... zatvaramo skener...
		input.close();

		// ... i računamo prosjek
		average = sum / list.size();

		for (Integer l : list) {
			// ako je broj u listi iznad prosjeka...
			if (l >= Math.round(average)) {
				// ... povećavamo brojač brojeva iznad prosjeka
				aboveAverage++; // count numbers above average
				// ako je broj u listi ispod prosjeka...
			} else if (l < Math.round(average)) {
				// ... povećavamo brojač brojeva ispod prosjeka
				belowAverage++;
			}

		}

		// štampamo prosjek i koliko je brojeva iznad i koliko ispod prosjeka
		System.out.println("Prosjek je: " + average);
		System.out.println("Iznad prosjeka: " + aboveAverage);
		System.out.println("Ispod prosjeka: " + belowAverage);
	}

}