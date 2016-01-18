/**
 * 
 */
package zadaci_2016_01_16;

/**
 * @author Slavisa
 *
 */

public class Z01_PrestupneGodine {

	/**
	 * 1. Napisati program koji ispisuje sve prestupne godine, 10 po liniji, od
	 * godine 101 do 2100, odvojene jednim spaceom. Također ispisati i ukupan
	 * broj prijestupnih godina u ovom vremenskom periodu.
	 */
	
public static void main(String[] args) {
		
		//postavljamo brojač na 0
		int prestupne = 0;
		
		//ne znam šta ova linija koda radi :D
		System.out.println("Prestupne godine od 101. do 2100. godine su: \n");
		
		//petlja od 101 do 2100
		for(int i = 101; i <= 2100; i++){
			
			// gledamo da li je prestupna godina (ako je djeljiva sa 4 i ako nije djeljiva sa 100 ili je djeljiva sa 400
			if(i % 4 == 0 && (i % 100 != 0 || i % 400 == 0)){
				//prelazimo u novi red, nakon što se ispiše 10 godina
				if(prestupne != 0 && prestupne % 10 == 0){
					System.out.println();
				}
				//brojimo prestupne godine
				prestupne++;
				
				//štampamo godine
				System.out.print(i + " ");
				
			}
			
		}
		//štampamo rezultat
		System.out.println("\n\nBroj prestupnih godina u periodu od 101. do 2100. godine je: " + prestupne);
	}

}