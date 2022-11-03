package averageNotes;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		// Klavyeden girilen bir sayýnýn mükemmel sayý olup/olmadýðýný bulan ve sayý
		// mükemmel sayý ise ekrana “mükemmel sayýdýr.” deðilse “mükemmel sayý
		// deðildir.” ifadelerini ekrana yazan programý Java dilinde yazýnýz.
		// Bir sayýnýn kendisi hariç pozitif tam sayý çarpanlarý (kalansýz bölen
		// sayýlarýn) toplamý kendisine eþit olan sayýya mükemmel sayý denir.

		int total = 0, number; // variables of count number, greater and lesser
								// number, number

		Scanner scan = new Scanner(System.in); // created scanner

		System.out.print("Sayý giriniz: "); // input number
		number = scan.nextInt(); // number assigned to the variable

		// loop and control
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				total += i;
			}
		}

		// control and printed
		if (number == total) {
			System.out.println(number + " : Mükemmel sayýdýr.");
		} else {
			System.out.println(number + " : Mükemmel sayý deðildir. ");
		}

	}
}
