package de.demmer.dennis;

public class Application {

	
	public static void main(String[] args) {
		
		
//		checkEvenWhile(100);
//		checkEvenFor(100);
		

		//-----------------------------------------------
		
		//      0         1        2         3
		// [  "Hallo" | "Welt" | "Test" | "Java" ]
	
//		String[] stringArray = {"Hallo", "Welt", "Test", "Java"};
		
		
		//-----------------------------------------------
		
		//      0      1        2       3
		// [ "Test1" | ----- | ----- | ----- ]
		String[] stringArray = new String[4];
		
		stringArray[0] = "Test1";


		//-----------------------------------------------
		
		
		char[]  zeichenkette = {'T', 'e', 's', 't', '1'};
		
		String test1 = "Test1";
		
		System.out.println(test1.charAt(0));
		
		
		
		
		// --------- iterieren über ein Array mit einer for-schleife -------------
		
		for(int i = 0; i < stringArray.length ; i++) {
			System.out.println(stringArray[i]);
		}
		
		
		
		
		
	
	}
	
	
	
	static void checkEvenWhile(int length) {
		
		int counter = 0;
		while(counter <= length) {

			if(counter % 2 == 0) {
				System.out.println(counter);
			}
			
//			counter++;
			counter = counter + 1;
		}
	}
	
	
	static void checkEvenFor(int length) {
		

			// counter erstellen | Abbruchbedingung    |    counter verändern
		for(int counter = 0      ; counter <= length   ;  counter++          ) {

			if(counter % 2 == 0) {
				System.out.println(counter);				
			}

		}	
		
	}
	
	
	
	

	
	

}
