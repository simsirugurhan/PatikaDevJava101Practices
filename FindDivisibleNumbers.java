package averageNotes;

import java.util.Scanner;

public class FindDivisibleNumbers {

	public static void main(String[] args) {
		// Java d�ng�ler ile 0'dan girilen say�ya kadar olan say�lardan 3 ve 4'e tam
		// b�l�nen say�lar�n ortalamas�n� hesaplayan program� yaz�n�z.

		int number, totalValue = 0, count = 0; // variables of number, divisible values total and divisible values count

		Scanner scan = new Scanner(System.in); // created scanner

		System.out.print("Say� girin: "); // input number
		number = scan.nextInt(); // number assigned to the variable

		// loop and controls
		for (int i = 0; i <= number; i++) {
			if (i % 3 == 0 && i % 4 == 0 && i > 0) {
				count++;
				totalValue += i;
			}
		}

		System.out.println("3 ve 4'e tam b�l�nen say�lar�n ortalamas�: " + (totalValue / count)); // calculated the
																									// average and
																									// printed

	}

}
