package averageNotes;

import java.util.Scanner;

public class CombinationCalculator {

	public static void main(String[] args) {
		// C(n,r) = n! / (r! * (n-r)!)

		int number, r; // variables of number and r number
		int factorialNumber = 1, factorialR = 1, factorialDifference = 1; // variables factorial of number, factorial of r
		int result; // result variable of combination calculation
		
		Scanner scan = new Scanner(System.in); // created scanner

		System.out.print("Sayý giriniz: "); // input number
		number = scan.nextInt(); // number assigned to the variable

		System.out.print("Kaç elemanlý grup: "); // input number
		r = scan.nextInt(); // number assigned to the variable

		// loop and controls
		for (int i = 1; i <= number; i++) {
			// factorial number
			factorialNumber = factorialNumber * i;
		}

		for (int i = 1; i <= r; i++) {
			//factorial r
			factorialR = factorialR * i;
		}
		
		for(int i = 1; i <= (number-r); i++) {
			//factorial number - r or factorial difference
			factorialDifference = factorialDifference * i;
		}
		
		//calculating
		result = (factorialNumber / (factorialR * factorialDifference)); 
		
		System.out.println("Kombinasyon sonucu: " + result); //printed
	}

}
