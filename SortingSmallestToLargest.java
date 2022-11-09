package averageNotes;

import java.util.Arrays;
import java.util.Scanner;

public class SortingSmallestToLargest {

	public static void main(String[] args) {
		// Java dilinde, dizideki elemanlarý küçükten büyüðe sýralayan programý yazýnýz.
		// Dizinin boyutunu ve dizinin elemanlarýný kullanýcýdan alýnýz.
		int size, value;

		Scanner scan = new Scanner(System.in);
		System.out.print("Eleman sayýsý giriniz: ");
		size = scan.nextInt();

		if (size > 0) {
			int[] arr = new int[size];
			for (int i = 0; i < size; i++) {
				System.out.printf((i + 1) + ". elemaný giriniz: ");
				arr[i] = scan.nextInt();
			}

			for (int i = 0; i < size; i++) {
				for (int j = i + 1; j < size; j++) {
					if (arr[i] > arr[j]) {
						value = arr[i];
						arr[i] = arr[j];
						arr[j] = value;
					}
				}
			}

			System.out.println("Dizi: " + Arrays.toString(arr));
		}

		else {
			System.out.print("Doðru deðer giriniz!");
		}

	}

}