package averageNotes;

import java.util.Scanner;

public class PowerCalculator {
	// Java dilinde, taban ve �s de�erleri kullan�c�dan al�nan �s alma i�lemini
	// "Recursive" metot kullanarak yapan program� yaz�n�z.
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

		System.out.print("Taban de�eri giriniz :"); // input base number
		base = scan.nextInt(); // base number assigned to variable
		System.out.print("�s de�eri giriniz :"); // input exponent number
		exponent = scan.nextInt(); // exponent number assigned to variable
		System.out.println("Sonu�: " + power(base, exponent));
	}
}