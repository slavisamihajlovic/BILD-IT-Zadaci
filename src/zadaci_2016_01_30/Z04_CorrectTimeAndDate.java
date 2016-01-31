/**
 * 
 */
package zadaci_2016_01_30;

import java.util.Date;
import java.text.*;
/**
 * @author Slavisa
 *
 */

public class Z04_CorrectTimeAndDate {

	/**
	 * 4. Napisati metodu koja vraća datum i trenutačno vrijeme.
	 */

	
	/*begC
	 * https://www.youtube.com/watch?v=JtAplwiTOXc
	 * https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html
	 * endC */
	
	// metoda koja vraća tačno vrijeme i datum
	public static void timeAndDate() {
		
		// pravimo datum
		Date date = new Date();
		
		// format datuma
		SimpleDateFormat datum = new SimpleDateFormat("d.MM.y");
		
		// format vremena
		SimpleDateFormat vrijeme = new SimpleDateFormat("hh:mm:ss aa");
		
		// štampamo datum
		System.out.println("  Datum: " + datum.format(date));
		
		// štampamo vrijeme
		System.out.println("Vrijeme: " + vrijeme.format(date));
	}
	
	// glavna metoda
	public static void main(String[] args) {
		
		// pozivamo metodu timeAndDate
		timeAndDate();
		
	}

}
