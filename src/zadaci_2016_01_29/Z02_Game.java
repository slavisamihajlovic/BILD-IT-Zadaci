/**
 * 
 */
package zadaci_2016_01_29;

import java.util.Scanner;

/**
 * @author Slavisa
 *
 */

public class Z02_Game {

	/**
	 * 2. Napisati program koji igra sa protivnikom rock-paper-scissors.
	 * (papir-bunar-makaze ili tako nekako po naški) Program nasumično generiše
	 * brojeve 0, 1 i 2 koji predstavljaju papir, bunar i makaze. Program pita
	 * korisnika da unese 0, 1 ili 2 te mu ispisuje poruku da li je korisnik
	 * pobijedio, da li je računar pobijedio ili je bilo neriješeno.
	 */

	public static void main(String[] args) {
		
		// pravimo skener
		Scanner input = new Scanner(System.in);
		// štampa neki tekst u konzoli
		System.out.println("---------------------------------");
		System.out.println("| 0-Rock | 1-Paper | 2-Scissors |");
		System.out.println("---------------------------------");
		System.out.println(">>---> Unesite 0, 1, ili 2 <---<<");
		System.out.println("---------------------------------\n");
		
		// string array sa tri elementa
		String[] options = { "Kamen", "Papir", "Makaze" };

		// igra je pokrenuta
		boolean playing = true;
		
		// kompjuter bira nasumično 0, 1 ili 2
		int computer = (int) ((Math.random() * 2));
		
		// privremena vrijednost 0, korisnik će poslije mijenjati unosom preko tastature
		int option = 0;

		// da vidimo šta je izabrao kompjuter, pa da ga zajebemo :D
		System.out.println("Kompjuter je odabrao: " + options[computer]);

		// do while petlja
		do {
			// pokušavamo
			try {
				
				option = input.nextInt(); // unosimo 0, 1, 2 ili nešto pogrešno

				if (option == computer) {
					System.out.println("\nNoSolved!\n");
					playing = false;
				} else if (option == 0 && computer == 1) {
					System.out.println("\nKompjuter je pobijedijo!\n");
					playing = false;
				} else if (option == 0 && computer == 2) {
					System.out.println("\nPobijedijo si!\n");
					playing = false;
				} else if (option == 1 && computer == 0) {
					System.out.println("\nPobijedijo si!\n");
					playing = false;
				} else if (option == 1 && computer == 2) {
					System.out.println("\nKompjuter je pobijedijo!\n");
					playing = false;
				} else if (option == 2 && computer == 0) {
					System.out.println("\nKompjuter je pobijedijo!\n");
					playing = false;
				} else if (option == 2 && computer == 1) {
					System.out.println("\nPobijedijo si!\n");
				} else {
					System.out.println("Unesite 0, 1 ili 2: ");
					playing = true;
				}
			  // hvatamo grešku i nudimo korisniku da ponovo pokuša unijeti 0, 1 ili 2
			} catch (Exception shikaka) {
				System.out.println("Unesite 0, 1 ili 2: ");
				input.nextLine(); // ponovo unosimo riješenje

			}
		} while (playing); // sve dok je igra pokrenuta

		// na kraju vidimo šta smo odabrali, a šta je kompjuter
		System.out.println("Odabrali ste: " + options[option]);
		System.out.println("Kompjuter je odabrao: " + options[computer]);

		// zatvaramo skener
		input.close();
	}
}
