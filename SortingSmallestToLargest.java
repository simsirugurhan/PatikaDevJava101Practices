package averageNotes;

import java.util.Arrays;
import java.util.Scanner;

public class SortingSmallestToLargest {

	public static void main(String[] args) {
		// Java dilinde, dizideki elemanlarý küçükten büyüðe sýralayan programý yazýnýz.
		// Dizinin boyutunu ve dizinin elemanlarýný kullanýcýdan alýnýz.
		
		int size, value; //variables of list size and values

		Scanner scan = new Scanner(System.in);  // scanner created
		System.out.print("Eleman sayýsý giriniz: "); //input size of list
		size = scan.nextInt(); // size assigned to variable

		if (size > 0) { // size must be greater than 0
			int[] arr = new int[size]; // array created
			//loop for input values
			for (int i = 0; i < size; i++) {
				System.out.printf((i + 1) + ". elemaný giriniz: "); //input value
				arr[i] = scan.nextInt(); // value assigned to array's index
			}
			
			//sorting loop
			for (int i = 0; i < size; i++) {
				for (int j = i + 1; j < size; j++) {
					//control
					if (arr[i] > arr[j]) {
						value = arr[i];
						arr[i] = arr[j];
						arr[j] = value;
					}
				}
			}

			System.out.println("Dizi: " + Arrays.toString(arr)); //printed
		}

		else {
			System.out.print("Doðru deðer giriniz!"); //error message
		}

	}

}
