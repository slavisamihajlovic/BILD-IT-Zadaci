/**
 * 
 */
package zadaci_2016_01_16;

import java.util.Scanner;

/**
 * @author Slavisa
 *
 */

public class Z05_CoinToss {

	/**
	 * 5. Napisati metodu koja prima jedan argument te simulira bacanje novčića
	 * toliko puta. Nakon što se simulacija završi, program ispisuje koliko puta
	 * je novčić pokazao glavu a koliko puta pismo.
	 */

	public static void coinToss(int numOfToss) {

		// postavljamo brojač glave na 0
		int heads = 0;
		// postavljamo brojač pisma na 0
		int tails = 0;

		// petlja petlji plete petra :)
		for (int i = 0; i < numOfToss; i++) {
			// nasumične vrijednosti 0 i 1
			int result = (int)(Math.round(Math.random()*1));
			// ako je 0...
			if (result == 0) {
				// ... povećavamo broj glava za 1
				heads++;
			} else {
				tails++;
			}

		}
		// štampamo rezultat
		System.out.println("Novčić je bačen " + numOfToss + " puta.\n" + heads + " puta je bila glava, a " + tails + " puta pismo.");
	}

	public static void main(String[] args) {

		// pravimo skener
		Scanner input = new Scanner(System.in);

		// pitanje
		System.out.print("Unesite broj bacanja novčića: ");

		// unosimo koliko želimo puta da se novčić baci
		int numOfToss = input.nextInt();

		// zatvaramo skener
		input.close();

		// pozivamo metodu coinToss
		coinToss(numOfToss);

	}

}
