package averageNotes;

import java.util.Scanner;

public class AddingEvenAndMultipleFourNumber {

	public static void main(String[] args) {
		// Java d�ng�ler ile tek bir say� girilene kadar kullan�c�dan giri�leri kabul
		// eden ve girilen de�erlerden �ift ve 4'�n katlar� olan say�lar� toplay�p
		// ekrana basan program� yaz�yoruz.

		int number, totalValue = 0; // variables of number, total value

		Scanner scan = new Scanner(System.in); // created scanner

		// loop and controls
		do {
			System.out.print("Say� girin: "); // input number
			number = scan.nextInt(); // number assigned to the variable

			if (number % 2 == 0 && number % 4 == 0) {
				totalValue += number; // addition
			}

		} while (number > 0 && number % 2 != 1);

		System.out.println("Say�lar�n toplam�: " + totalValue); // printed

	}

}
