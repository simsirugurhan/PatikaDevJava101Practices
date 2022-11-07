package averageNotes;

import java.util.Scanner;

public class PalindromeNumber {
	// Java ile bir sayının "Palindrom Sayı" olup olmadığını bulan bir program
	// yapıyoruz.
	static boolean isPalindrome(int number) {
		int temp = number, reverseNumber = 0, lastNumber; // variables of temp, reverseNumber and lastNumber

		// loop
		while (temp != 0) {
			lastNumber = temp % 10;
			reverseNumber = (reverseNumber * 10) + lastNumber;
			temp /= 10;
		}

		// controls
		if (number == reverseNumber) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		int number; // variable of number

		Scanner scan = new Scanner(System.in); // created scanner

		System.out.print("Sayı giriniz: "); // input number
		number = scan.nextInt(); // number assigned to the variable

		// controls
		if (isPalindrome(number)) {
			System.out.println("Palindrom sayıdır."); // printed
		} else {
			System.out.println("Palindrom sayı değildir."); // printed
		}
	}
}
