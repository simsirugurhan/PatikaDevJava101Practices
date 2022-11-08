package averageNotes;

public class HarmonicAverage {

	public static void main(String[] args) {
		// Dizideki say�lar�n harmonik ortalamas�n� hesaplayan program� yaz�n�z.

		// Harmonik Ortalama form�l� : n (eleman say�s�) / elemanlar�n harmonik serisi

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
