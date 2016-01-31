/**
 * 
 */
package zadaci_2016_01_30;

import java.util.Scanner;

/**
 * @author Slavisa
 *
 */

public class Z05_Pyramid {

	/**
	 * 5. Napisati program koji pita korisnika da unese cijeli broj te ispisuje
	 * piramidu svih brojeva do tog broja. (Na primjer, ukoliko korisnik unese 7
	 * vrh piramide je broj 1, red ispod vrha piramide je 2 1 2, red ispod je 3
	 * 2 1 2 3, red ispod 4 3 2 1 2 3 4 itd.)
	 * 
	 *         1
	 *        212
	 *       32123
	 *      4321234
	 *     543212345 
	 *    65432123456 
	 *   7654321234567
	 */

	public static void main(String[] args) {

		// pravimo skener
		Scanner input = new Scanner(System.in);

		// ispisuje tekst u konzoli
		System.out.println("Unesite broj: ");
		
		// unosimo do kojeg broja piramidu želimo
		int number = input.nextInt();
		
		// T kao Trogir :)
		int t = 1;

		// zapetljaj crijeva
		for (int i = 1; i <= number * 2; i += 2) {
			System.out.print(" "); // [SPACE]
			for (int j = 1; j <= i; j++) {
				System.out.print(t + " "); // ispisujemo redove piramide

			}
			System.out.println(); // [ENTER]
			t++;
		}
		
		input.close(); // zatvaramo skener
	}
}


//	public static void main(String[] args) {
//
//		Scanner input = new Scanner(System.in);
//
//		System.out.println("Unesite broj 7: ");
//
//		int number = input.nextInt();
//
//		input.close();
//
//		System.out.println("             1");
//		System.out.println("           2 1 2");
//		System.out.println("         3 2 1 2 3");
//		System.out.println("       4 3 2 1 2 3 4");
//		System.out.println("     5 4 3 2 1 2 3 4 5");
//		System.out.println("   6 5 4 3 2 1 2 3 4 5 6");
//		System.out.println(" 7 6 5 4 3 2 1 2 3 4 5 6 7");
//	}
//
//}

