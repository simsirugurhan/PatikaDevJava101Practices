package averageNotes;

import java.util.Scanner;

public class PowersFourAndFive {

	public static void main(String[] args) {
		// Java d�ng�ler ile girilen say�ya kadar olan 4 ve 5'in kuvvetlerini ekrana
		// yazd�ran program� yaz�yoruz.

		int number; // variable of number

		Scanner scan = new Scanner(System.in); // created scanner

		System.out.print("Say� giriniz: "); // input number
		number = scan.nextInt(); // number assigned to the variable

		// loop and controls
		for (int i = 1; i <= number; i *= 4) {
			System.out.println("D�rd�n kuvvetleri: " + i);
		}

		for (int i = 1; i <= number; i *= 5) {
			System.out.println("Be�in kuvvetleri: " + i);
		}

	}

}
