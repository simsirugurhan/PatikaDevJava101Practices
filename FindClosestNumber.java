package averageNotes;

import java.util.Scanner;

public class FindClosestNumber {

	public static void main(String[] args) {
		// Dizideki elemanlarýn girilen sayýdan küçük en yakýn sayýyý ve en büyük en
		// yakýn sayýyý bulan programý yazýnýz.

		int[] numbers = { 15, 12, 788, 1, -1, -778, 2, 0 }; // list of numbers
		int min, max, listMin, listMax; // variables of min and max value, min and max values for case
		int value; // variable of input number

		Scanner scan = new Scanner(System.in); // scanner created
		System.out.print("Sayý girin: "); // input value
		value = scan.nextInt(); // value assigned to variable

		// loop
		min = numbers[0];
		max = numbers[0];

		// find min and max of list
		for (int number : numbers) {

			if (number < min) {
				min = number;
			} else if (number > max) {
				max = number;
			}

		}
		// find min and max for case
		listMin = min;
		listMax = max;

		// loop
		for (int number : numbers) {

			if (number > listMin && number < value) {
				listMin = number;
			} else if (number < listMax && number > value) {
				listMax = number;
			}

		}

		// print
		System.out.println("Girilen sayýdan küçük en yakýn sayý : " + listMin);
		System.out.println("Girilen sayýdan büyük en yakýn sayý : " + listMax);
	}
}
