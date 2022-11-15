package averageNotes;

import java.util.Arrays;

public class FrequencyElements {

	public static void main(String[] args) {
		//Java dilinde, dizideki elemanların kaç kez tekrar edildiğini yani frekanslarını bulan programı yazınız.
		
		int[] array = { 10, 20, 20, 10, 10, 20, 5, 20 }; // variable of our list
		int[] frequency = new int[array.length]; // variable of frequency of elements
		
		System.out.println(Arrays.toString(array)); //array printed
		
		//loop for frequency
		for (int i = 0; i < array.length; i++) {
			frequency[i] = 1; // all elements frequency is 1 at first
			for (int j = 0; j < array.length; j++) {
				// control if same value
				if ((i != j) && (array[i] == array[j])) {
					frequency[i]++; // frequency +1
				}
			}
		}

		//loop for control repeat
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if ((i != j) && (array[i] == array[j])) {
					array[j] = 0; // do not repeat this number, therefore 0
				}
			}
		}

		System.out.println("Tekrar Sayýlarý");
		//loop for printing
		for (int i = 0; i < array.length; i++) {
			if (array[i] != 0) //repeat controller
				System.out.println(array[i] + " sayýsý " + frequency[i] + " kere tekrar edildi."); // printed
		}

	}

}
