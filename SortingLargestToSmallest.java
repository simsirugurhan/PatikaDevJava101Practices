package averageNotes;

import java.util.Scanner;

public class SortingLargestToSmallest {

	public static void main(String[] args) {
		// Girilen 3 say�y� "k���kten b�y��e" s�ralayan program� yaz�n�z.

		int firstNumber, secondNumber, thirdNumber, flag; // variables of numbers

		Scanner scan = new Scanner(System.in); // created scanner

		System.out.print("�lk say�: "); // input first number
		firstNumber = scan.nextInt(); // first number assigned to the variable

		System.out.print("�kinci say�: ");
		secondNumber = scan.nextInt();

		System.out.print("���nc� say�: ");
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
