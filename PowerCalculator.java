package averageNotes;

import java.util.Scanner;

public class PowerCalculator {
	// Java dilinde, taban ve üs deðerleri kullanýcýdan alýnan üs alma iþlemini
	// "Recursive" metot kullanarak yapan programý yazýnýz.
	static int result = 1;
	static int power(int base, int exponent) {
		
		if (exponent == 0){
            return 1;
        }

        result = result * base;
        power(base, exponent - 1);
        
		return result;
	}


	public static void main(String[] args) {
		int base, exponent; // variables of base and exponent

		Scanner scan = new Scanner(System.in); // scanner created

		System.out.print("Taban deðeri giriniz :"); // input base number
		base = scan.nextInt(); // base number assigned to variable
		System.out.print("Üs deðeri giriniz :"); // input exponent number
		exponent = scan.nextInt(); // exponent number assigned to variable
		System.out.println("Sonuç: " + power(base, exponent));
	}
}