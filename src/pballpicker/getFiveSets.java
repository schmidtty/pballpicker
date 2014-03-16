package pballpicker;

import java.util.Random; 


public class getFiveSets {

	public static void main(String args[]) {

		int i = 0, val = 0;
		String valString = ""; 
		
		

		for (i = 1; i <= 5; i++) {
			valString = getRandomFive();
			System.out.print(valString);

			val = pballNumber();
			System.out.println("^"+Integer.toString(val));
		}
	}
	
	public static String getRandomFive() {
		int x, lottoCounter = 0;
		String randString = "", xString ="";
		
		Random lottoRand = new Random();
		
		x = lottoRand.nextInt(59)+1;
		randString = Integer.toString(x);

		do {
			lottoCounter++;
			do {
				x = lottoRand.nextInt(59)+1;
				xString = Integer.toString(x);
			} while ( randString.contains(xString));
			randString = randString + "^" + Integer.toString(x) ;
				
		} while ((lottoCounter < 4) );
		
		return randString;
	}
	
	public static int pballNumber() {
		Random pballRand = new Random();
		return ( pballRand.nextInt(35)+1);
	}
	
	
}
