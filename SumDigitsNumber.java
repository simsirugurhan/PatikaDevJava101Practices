package averageNotes;

import java.util.Scanner;

public class SumDigitsNumber {

	public static void main(String[] args) {
		// Bir say�n�n basamak say�lar�n�n toplam�n� hesaplayan program yaz�n�z.

		int number, total = 0; // variables of number and total
		
		Scanner scan = new Scanner(System.in); // created scanner

		System.out.print("Say� giriniz: "); // input number
		number = scan.nextInt(); // number assigned to the variable

		// loop
		while(number != 0)
        {
            total += (number%10);
            number = number / 10;
        }
		
        System.out.println("basamak toplam�: " + total); //printed
	}
}
