/**
 * 
 */
package zadaci_2016_01_16;

import java.util.Scanner;

/**
 * @author Slavisa
 *
 */
public class Z02_RandomQuestions {

	/**
	 * 2. Napisati metodu koja prima jedan argument, broj pitanja, te generiše
	 * toliko nasumičnih, jednostavnih pitanja oduzimanja tipa: „Koliko je
	 * 5-2?". Metoda treba da broji broj tačnih i netačnih odgovora te ih
	 * ispiše korisniku.
	 */

	public static void question() {
		// pravimo skener
		Scanner input = new Scanner(System.in);
		// neka linija koda koja je tu da nas zbuni :)
		System.out.print("Unesite koliko želite pitanja: ");
		// unosimo koliko želimo pitanja da nam bude postavljeno
		int numOfQuestions = input.nextInt();
		// brojač tačnih odgovora
		int correct = 0;
		// brojač netačnih odgovora
		int incorrect = 0;
		// petlja koja petlja
		for (int i = 0; i < numOfQuestions; i++) {
			// nasumično generišemo prvi broj
			int broj1 = (int) (Math.random() * 20);
			// nasumično generišemo prvi broj
			int broj2 = (int) (Math.random() * 30);
			// postavlja nam pitanje
			System.out.print("Koliko je: " + broj1 + "+" + broj2 + "? ");
			// unosimo odgovor
			int korisnikovRez = input.nextInt();
			// ako unesemo tačan rezultat...
			if (korisnikovRez == (broj1 + broj2)) {
				// ...povećava se counter tačnih za 1...
				correct++;
				// ... a, ako netačno...
			} else {
				// ...povećava se counter netačnih za 1
				incorrect++;
			}

		}
		// zatvaramo skener
		input.close();
		
		// štampamo rezultat
		System.out.println("Tačno ste odgovorili na " + correct + " pitanja, a netačno na " + incorrect + " pitanja.");
	}

	public static void main(String[] args) {
		// pozivamo metodu question()
		question();
	}

}