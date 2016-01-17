/**
 * 
 */
package zadaci_2016_01_15;

import java.util.Scanner;

/**
 * @author Slavisa
 *
 */

public class Z05_PonavljanjeNajvecegBrojaUNizu {

	/**
	 * 5. Napisati program koji učitava niz brojeva, pronalazi najveći broj te
	 * ispisuje koliko se puta taj broj ponavlja. Pretpostavimo da se unos
	 * brojeva završava sa nulom.
	 */
	
		public static void main(String[] args) {
			
			// pravimo skener
			Scanner input = new Scanner(System.in);
			
			// pravimo promjenljivu kojoj ćemo kasnije dodjeljivati vrijednosti
			int number;
			
			// postavljamo brojač na 0
			int counter = 0;

			// stavljamo da je 0 najveći broj
			int max = 0;
			
			do {
				System.out.print("Unesite broj: ");
				// unosimo broj
				number = input.nextInt();
				
				// ako unešeni broj nije nula i veći je od najvećeg (max) broja
				if(number != 0 && number > max) {
					// najveći (max) broj, postaje taj unijeti broj
					max = number;
				} else if(number == max) {
					// a ako su najveći (max) broj i unijeti broj jednaki, onda povećamo brojač za 1
					counter++;
				}
			// program radi sve dok ne unesemo nulu
			} while(number != 0);
			
			// zatvaramo skener
			input.close();
			
			// štampamo rezultat
			System.out.println("Najveći broj je: " + max + ", a ponovio se " + counter + " puta.");
			
		}

	}