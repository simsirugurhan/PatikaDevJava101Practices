package averageNotes;

public class PrimeNumberOneToHundred {

	public static void main(String[] args) {
		// Java ile 1 - 100 arasýndaki asal sayýlarý ekrana yazdýran programý yazýnýz.

		int number = 100; // variable of number
		boolean isPrime = false; // variable of is prime, if it is prime, isPrime will be true, if it is not
									// prime, isPrime will be false.
		String primeNumbers = ""; // variable of prime numbers

		// controls and loops
		for (int i = number; i >= 2; i--) {

			for (int j = i - 1; j > 1; j--) {

				if (i % j == 0) {
					isPrime = false;
					break;
				} else {
					isPrime = true;
				}

			}

			if (isPrime) {
				primeNumbers = primeNumbers + i + " ";
			}
		}

		System.out.println(primeNumbers); //printed

	}
}
