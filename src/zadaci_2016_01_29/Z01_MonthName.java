/**
 * 
 */
package zadaci_2016_01_29;

import java.util.ArrayList;

/**
 * @author Slavisa
 *
 */

public class Z01_MonthName {

	/**
	 * 1. Napisati program koji nasumično generiše cijeli broj između 1 i 12 te
	 * ispisuje ime mjeseca za taj broj. (Januar za 1, Ferbruar za 2....)
	 */

	public static void main(String[] args) {
		
		// generišemo nasumični broj o 0 do 11
		int number = (int) ((Math.random() * 12));
		
		// pravimo array listu
		ArrayList<String> month = new ArrayList<String>();
		
		// u listu dodajemo mjesece, malo peršuna, mrkve, bibera... :)
		month.add("Januar (一月)");
		month.add("Februar (二月)");
		month.add("Mart (三月)");
		month.add("April (四月)");
		month.add("Maj (五月)");
		month.add("Jun (六月)");
		month.add("Jul (七月)");
		month.add("Avgust (八月)");
		month.add("Septembar (九月)");
		month.add("Oktobar (十月)");
		month.add("Novembar (十一月)");
		month.add("Decembar (十二月)");
		
		// štampamo rezultat
//		System.out.print("Mjesec pod rednim brojem ");
		
		// nasumičnom broju dodajemo 1, kako bi na broju 1 bijo januvar, na broju 2 februvar...
		System.out.print((number + 1) + ". " + month.get(number));
		
	}

}
