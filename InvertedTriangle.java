package averageNotes;

import java.util.Scanner;

public class InvertedTriangle {

	public static void main(String[] args) {
		// Java ile basamak sayýsýnýn kullanýcýdan alýnan ve döngüler kullanýlarak,
		// yýldýzlar(*) ile ekrana ters üçgen çizen programý yazýn.

		int number; // variable of number

		Scanner scan = new Scanner(System.in); // created scanner

		System.out.print("Basamak sayýsý giriniz: "); // input number
		number = scan.nextInt(); // number assigned to the variable

		// loops
		for(int i = 0; i <= number; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * number - ( 2 * i + 1)); k++){
                System.out.print("*");
            }
            System.out.println();
        }
		
	}
}
