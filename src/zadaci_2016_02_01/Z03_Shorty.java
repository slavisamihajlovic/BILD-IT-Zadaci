/**
 * 
 */
package zadaci_2016_02_01;

import java.util.Scanner;

/**
 * @author Slavisa
 *
 */

public class Z03_Shorty {

	/**
	 * 3. U javi, short vrijednost se sprema u samo 16 bita. Napisati program
	 * koji pita korisnika da unese short broj te mu ispiše svih 16 bita za dati
	 * cijeli broj. Na primjer, ukoliko korisnik unese broj 5 - program mu
	 * ispisuje 0000000000000101
	 */

	public static void main(String[] args) {

		// pravimo skener
		Scanner input = new Scanner(System.in);
		// ispisuje tekst u konzoli
		System.out.println("Unesite broj: ");
		// unosimo broj
		short number = input.nextShort();

		// pretvaramo unijeti broj u binarni i u string
		String s = Integer.toBinaryString(number);
		// string za nule
		String zero = "";
		// koristimo petlju da bi dodali nule ispred broja
		for (int i = 16 - s.length(); i > 0; i--) {
			// dodajemo nule ispred broja
			zero += 0;
		}

		// štampamo nule i broj
		System.out.println(zero + s);

		input.close(); // zatvaramo skener

	}

}
