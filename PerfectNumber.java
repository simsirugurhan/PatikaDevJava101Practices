package averageNotes;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		// Klavyeden girilen bir sayının mükemmel sayı olup/olmadığını bulan ve sayı
		// mükemmel sayı ise ekrana “mükemmel sayıdır.” değilse “mükemmel sayı
		// değildir.” ifadelerini ekrana yazan programı Java dilinde yazınız.
		// Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen
		// sayıların) toplamı kendisine eşit olan sayıya mükemmel sayı denir.

		int total = 0, number; // variables of total and number

		Scanner scan = new Scanner(System.in); // created scanner

		System.out.print("Sayı giriniz: "); // input number
		number = scan.nextInt(); // number assigned to the variable

		// loop and control
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				total += i;
			}
		}

		// control and printed
		if (number == total) {
			System.out.println(number + " : Mükemmel sayıdır.");
		} else {
			System.out.println(number + " : Mükemmel sayı değildir. ");
		}

	}
}
