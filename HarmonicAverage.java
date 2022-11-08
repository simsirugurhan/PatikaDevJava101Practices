package averageNotes;

public class HarmonicAverage {

	public static void main(String[] args) {
		// Dizideki sayýlarýn harmonik ortalamasýný hesaplayan programý yazýnýz.

		// Harmonik Ortalama formülü : n (eleman sayýsý) / elemanlarýn harmonik serisi

		int[] numbers = { 1, 2, 3, 4, 5 }; // list of integers
		double sum = 0; // sum harmonic numbers
		double average; // variable of harmonic average

		// loop
		for (double number : numbers) {
			sum = sum + (1 / number); // sum
		}

		average = numbers.length / sum; // calculating

		System.out.println("Harmonik ortalama: " + average); // printed
	}
}
