package averageNotes;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		// Klavyeden girilen bir say�n�n m�kemmel say� olup/olmad���n� bulan ve say�
		// m�kemmel say� ise ekrana �m�kemmel say�d�r.� de�ilse �m�kemmel say�
		// de�ildir.� ifadelerini ekrana yazan program� Java dilinde yaz�n�z.
		// Bir say�n�n kendisi hari� pozitif tam say� �arpanlar� (kalans�z b�len
		// say�lar�n) toplam� kendisine e�it olan say�ya m�kemmel say� denir.

		int total = 0, number; // variables of count number, greater and lesser
								// number, number

		Scanner scan = new Scanner(System.in); // created scanner

		System.out.print("Say� giriniz: "); // input number
		number = scan.nextInt(); // number assigned to the variable

		// loop and control
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				total += i;
			}
		}

		// control and printed
		if (number == total) {
			System.out.println(number + " : M�kemmel say�d�r.");
		} else {
			System.out.println(number + " : M�kemmel say� de�ildir. ");
		}

	}
}
