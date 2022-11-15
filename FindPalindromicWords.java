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
		// Java dilinde kullan�c�n�n girdi�i kelimenin "Palindromik" olup olmad���
		// bulan bir program yaz�yoruz.

		// E�er bir kelimenin tersten okunu�u yine ayn� kelimeyi veriyorsa o kelime
		// "Palindromik Kelime'dir".

		try (Scanner scan = new Scanner(System.in)) {
			String word = "";

			while (!word.equals("0")) {
				System.out.print("Bir kelime yaz�n: ");
				word = scan.next();

				if (isPalindrome(word) && !word.equals("0")) {
					System.out.println("* " + word + " palindrom bir kelimedir.");
				} else if (!isPalindrome(word) && !word.equals("0")) {
					System.out.println("* " + word + " palindrom bir kelime de�ildir.");
				}
			}
		}
	}

}
