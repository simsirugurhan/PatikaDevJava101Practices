package averageNotes;

import java.util.Scanner;

public class PowersCalculator {

	public static void main(String[] args) {
		// Java ile kullanýcýnýn girdiði deðerler ile üslü sayý hesaplayan programý "For Döngüsü" kullanarak yapýnýz.

		int number, powers; // variables of number and powers number
		int powersResult = 1; // result variable of powers calculation
		
		Scanner scan = new Scanner(System.in); // created scanner

		System.out.print("Sayý giriniz: "); // input number
		number = scan.nextInt(); // number assigned to the variable

		System.out.print("Üs giriniz: "); // input number
		powers = scan.nextInt(); // number assigned to the variable

		// loop and controls
		for(int i = 1; i <= powers; i++) {
			// number powers calculating
			powersResult = powersResult * number;
		}
			
		System.out.println(number + "^" + powers + ": " + powersResult); //printed
	}

}
