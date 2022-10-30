package averageNotes;

import java.util.Scanner;

public class SortingLargestToSmallest {

	public static void main(String[] args) {
		// Girilen 3 sayýyý "küçükten büyüðe" sýralayan programý yazýnýz.

		int firstNumber, secondNumber, thirdNumber, flag; // variables of numbers

		Scanner scan = new Scanner(System.in); // created scanner

		System.out.print("Ýlk sayý: "); // input first number
		firstNumber = scan.nextInt(); // first number assigned to the variable

		System.out.print("Ýkinci sayý: ");
		secondNumber = scan.nextInt();

		System.out.print("Üçüncü sayý: ");
		thirdNumber = scan.nextInt();

		// controls
		if (firstNumber > secondNumber && firstNumber > thirdNumber) {
			if (secondNumber > thirdNumber) {
				System.out.println(thirdNumber + " < " + secondNumber + " < " + firstNumber);
			} else {
				System.out.println(secondNumber + " < " + thirdNumber + " < " + firstNumber);
			}
		} else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
			if (firstNumber > thirdNumber) {
				System.out.println(thirdNumber + " < " + firstNumber + " < " + secondNumber);
			} else {
				System.out.println(firstNumber + " < " + thirdNumber + " < " + secondNumber);
			}
		} else {
			if (firstNumber > secondNumber) {
				System.out.println(secondNumber + " < " + firstNumber + " < " + thirdNumber);
			} else {
				System.out.println(firstNumber + " < " + secondNumber + " < " + thirdNumber);
			}
		}

	}

}
