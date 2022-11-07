package averageNotes;

import java.util.Scanner;

public class FibonacciSequence {

	public static void main(String[] args) {
		// Java d�ng�ler ile fibonacci serisi bulan program yaz�yoruz. Fibonacci
		// serisinin eleman say�s�n� kullan�c�dan al�n.

		int lastElementNumber = 1, elementNumber = 0, newElementNumber = 0; // variables of last element number, element
																		// number and new element number
		int number; // variable of fibonacci number
		String fibonacciNumbers = "0 1"; // variable of fibonacci numbers

		Scanner scan = new Scanner(System.in); // created scanner

		System.out.print("Eleman say�s� giriniz: "); // input number
		number = scan.nextInt(); // number assigned to the variable

		// loop
		for (int i = 1; i < number - 1; i++) {
			newElementNumber = lastElementNumber + elementNumber;
			elementNumber = lastElementNumber;
			lastElementNumber = newElementNumber;
			fibonacciNumbers = fibonacciNumbers + " " + newElementNumber;
		}

		System.out.println(fibonacciNumbers); // printed

	}
}
