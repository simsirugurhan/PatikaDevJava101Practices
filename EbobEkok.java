package averageNotes;

import java.util.Scanner;

public class EbobEkok {

	public static void main(String[] args) {
		// Java ile iki say�n�n EBOB ve EKOK de�erlerini "While D�ng�s�" kullanarak
		// yaz�n�z.

		int firstNumber, secondNumber; // variables of first number and second number
		double ebob = 0, ekok; // variables of ebob and ekok

		Scanner scan = new Scanner(System.in); // created scanner

		System.out.print("1. Say� giriniz: "); // input first number
		firstNumber = scan.nextInt(); // first number assigned to the variable

		System.out.print("2. Say� giriniz: "); // input second number
		secondNumber = scan.nextInt(); // second number assigned to the variable

		int greaterNumber = firstNumber; // find greater number
		// found
		if (greaterNumber < secondNumber) {
			greaterNumber = secondNumber;
		}

		// loop and control for ebob using while
		int c = firstNumber;
		while (c >= 1) {
			if ((firstNumber % c == 0) && (secondNumber % c == 0)) {
				ebob = c;
				break;
			} else {
				c--;
			}
		}

		// EKOK = (n1*n2) / EBOB
		// printed
		System.out.println("EKOK: " + ((firstNumber * secondNumber) / ebob));
		System.out.println("EBOB: " + ebob);

	}
}
