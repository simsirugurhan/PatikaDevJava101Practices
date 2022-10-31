package averageNotes;

import java.util.Scanner;

public class PowersFourAndFive {

	public static void main(String[] args) {
		// Java döngüler ile girilen sayýya kadar olan 4 ve 5'in kuvvetlerini ekrana
		// yazdýran programý yazýyoruz.

		int number; // variable of number

		Scanner scan = new Scanner(System.in); // created scanner

		System.out.print("Sayý giriniz: "); // input number
		number = scan.nextInt(); // number assigned to the variable

		// loop and controls
		for (int i = 1; i <= number; i *= 4) {
			System.out.println("Dördün kuvvetleri: " + i);
		}

		for (int i = 1; i <= number; i *= 5) {
			System.out.println("Beþin kuvvetleri: " + i);
		}

	}

}
