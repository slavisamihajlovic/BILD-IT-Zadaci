/**
 * 
 */
package zadaci_2016_01_16;

import java.io.File;
import java.util.Scanner;

/**
 * @author Slavisa
 *
 */

public class Z03_NumOfCharWordLineInFile {

	/**
	 * 3. Napišite program koji će brojati broj karaktera, riječi i linija
	 * teksta u nekom fileu. Riječi trebaju biti odvojene jednim spaceom. Ime
	 * file proslijediti kao argument u vaš program.
	 */
	
	public static void main(String[] args) throws Exception {
		
		// instanciramo fajl
		File file = new File("Lincoln.txt");
		// pravimo skener
		Scanner input = new Scanner(file);
		
		// brojači karaktera, riječi i linija postavljeni na 0
		int numOfChars = 0;
		int numOfWords = 0;
		int numOfLines = 0;
		
		while(input.hasNext()) {
			// očitavamo sav sadržaj iz fajla
			String stork = input.nextLine();
			// za ovi eksperiment nam ne trebaju spejsovi, tako da ih odma možemo bačiti :)
			String characters = stork.replaceAll(" ", "");
			// brojimo karaktere
			numOfChars += characters.length();
			// brojimo riječi odvajajući ih spejsom
			numOfWords += stork.split(" ").length;
			// brojimo linije
			numOfLines++;
		}

		// štampamo rezultat (broj karaktera)
		System.out.println("Fajl " + file.getName() + " sadrži "+ numOfChars + " karaktera.");
		// štampamo rezultat (broj riječi)
		System.out.println("Fajl " + file.getName() + " sadrži "+ + numOfWords + " riječi.");
		// štampamo rezultat (broj linija)
		System.out.println("Fajl " + file.getName() + " sadrži " + numOfLines + " linija.");
		// zatvaramo skener
		input.close();
	}
}