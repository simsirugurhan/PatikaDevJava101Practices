package averageNotes;

import java.util.ArrayList;
import java.util.List;

public class DublicateEvensArray {

	public static void main(String[] args) {
		// Bir sayı dizisindeki tekrar eden çift sayıları belirten bir program yaz

		int[] numbers = { 1, 2, 2, 3, 4, 5, 6, 7, 7, 8, 8, 8, 8, 8, 8, 9, 9, 10, 11, 11, 12, 12, 13, 14, 14 };
		int last = numbers[0];
		List<Integer> evens = new ArrayList<>();

		for (int i = 1; i < numbers.length; i++) {
			if (last == numbers[i] && last % 2 == 0) {
				evens.add(numbers[i]);
			}
			last = numbers[i];
		}

		for (int even : evens) {
			if (last == even) {

			} else {
				System.out.print(" " + even);
			}
			last = even;
		}

	}

}
