package averageNotes;

import java.util.Scanner;

public class GreaterAndLesserNumber {

	public static void main(String[] args) {
		// Java ile klavyeden girilen N tane sayma say�s�ndan en b�y�k ve en k���k
		// say�lar� bulan ve bu say�lar� ekrana yazan program� yaz�n.

		int count, greater = 0, lesser = Integer.MAX_VALUE, number; // variables of count number, greater and lesser
																	// number, number

		Scanner scan = new Scanner(System.in); // created scanner

		System.out.print("Ka� say� gireceksiniz: "); // input count of number
		count = scan.nextInt(); // first number assigned to the variable

		// loop and control
		for (int i = 1; i <= count; i++) {
			System.out.print(i + ". say� giriniz: "); // input number
			number = scan.nextInt(); // number assigned to the variable
			if (number > greater) {
				greater = number; // find greater number
			}
			if (number < lesser) {
				lesser = number; // find lesser number
			}
		}

		// printed
		System.out.println("En B�y�k: " + greater);
		System.out.println("En K���k: " + lesser);

	}
}
