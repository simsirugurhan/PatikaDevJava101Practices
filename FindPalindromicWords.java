package averageNotes;

import java.util.Scanner;

public class FindPalindromicWords {

	static boolean isPalindrome(String word) {
		for (int i = 0, j = word.length() - 1; i < j; i++, j--) {
			if (word.charAt(i) != word.charAt(j)) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// Java dilinde kullanýcýnýn girdiði kelimenin "Palindromik" olup olmadýðý
		// bulan bir program yazýyoruz.

		// Eðer bir kelimenin tersten okunuþu yine ayný kelimeyi veriyorsa o kelime
		// "Palindromik Kelime'dir".

		try (Scanner scan = new Scanner(System.in)) {
			String word = "";

			while (!word.equals("0")) {
				System.out.print("Bir kelime yazýn: ");
				word = scan.next();

				if (isPalindrome(word) && !word.equals("0")) {
					System.out.println("* " + word + " palindrom bir kelimedir.");
				} else if (!isPalindrome(word) && !word.equals("0")) {
					System.out.println("* " + word + " palindrom bir kelime deðildir.");
				}
			}
		}
	}

}
