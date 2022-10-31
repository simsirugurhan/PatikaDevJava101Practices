package averageNotes;

import java.util.Scanner;

public class AddingEvenAndMultipleFourNumber {

	public static void main(String[] args) {
		// Java döngüler ile tek bir sayý girilene kadar kullanýcýdan giriþleri kabul
		// eden ve girilen deðerlerden çift ve 4'ün katlarý olan sayýlarý toplayýp
		// ekrana basan programý yazýyoruz.

		int number, totalValue = 0; // variables of number, total value

		Scanner scan = new Scanner(System.in); // created scanner

		// loop and controls
		do {
			System.out.print("Sayý girin: "); // input number
			number = scan.nextInt(); // number assigned to the variable

			if (number % 2 == 0 && number % 4 == 0) {
				totalValue += number; // addition
			}

		} while (number > 0 && number % 2 != 1);

		System.out.println("Sayýlarýn toplamý: " + totalValue); // printed

	}

}
