package averageNotes;

import java.util.Scanner;

public class DiamondsWithStars {

	public static void main(String[] args) {
		// Java'da döngüler kullanarak yýldýzlar ile elmas yapýnýz.

		int number; // variable of number
		double total = 0; // variable of total

		Scanner scan = new Scanner(System.in); // created scanner

		System.out.print("Sayý giriniz: "); // input number
		number = scan.nextInt(); // number assigned to the variable

		// loops
		for (int i = 1; i <= number; i++) {
			for (int k = 1; k <= (number - i); k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= ((2 * i) - 1); j++) {
				System.out.print("*");
			}
			System.out.println("");

		}
		for (int i = 1; i < number; i++) {
			for (int j = 1; j <= (number - (number - i)); j++) {
				System.out.print(" ");
			}
			for (int k = (((2 * number) - 3) - ((2 * i) - 1)); k >= 0; k--) {
				System.out.print("*");
			}

			System.out.println("");
		}
	}
}
