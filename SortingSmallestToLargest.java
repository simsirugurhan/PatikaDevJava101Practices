package averageNotes;

import java.util.Arrays;
import java.util.Scanner;

public class SortingSmallestToLargest {

	public static void main(String[] args) {
		// Java dilinde, dizideki elemanlar� k���kten b�y��e s�ralayan program� yaz�n�z.
		// Dizinin boyutunu ve dizinin elemanlar�n� kullan�c�dan al�n�z.
		int size, value;

		Scanner scan = new Scanner(System.in);
		System.out.print("Eleman say�s� giriniz: ");
		size = scan.nextInt();

		if (size > 0) {
			int[] arr = new int[size];
			for (int i = 0; i < size; i++) {
				System.out.printf((i + 1) + ". eleman� giriniz: ");
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
			System.out.print("Do�ru de�er giriniz!");
		}

	}

}