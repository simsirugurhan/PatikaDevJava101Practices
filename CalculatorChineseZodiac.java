package averageNotes;

import java.util.Scanner;

public class CalculatorChineseZodiac {

	public static void main(String[] args) {
		// Çin zodyağı hesaplanırken kişinin doğum yılının 12 ile bölümünde kalana göre
		// bulunur.
		// Doğum Tarihi %12 = 0 ➜ Maymun
		// Doğum Tarihi %12 = 1 ➜ Horoz
		// Doğum Tarihi %12 = 2 ➜ Köpek
		// Doğum Tarihi %12 = 3 ➜ Domuz
		// Doğum Tarihi %12 = 4 ➜ Fare
		// Doğum Tarihi %12 = 5 ➜ Öküz
		// Doğum Tarihi %12 = 6 ➜ Kaplan
		// Doğum Tarihi %12 = 7 ➜ Tavşan
		// Doğum Tarihi %12 = 8 ➜ Ejderha
		// Doğum Tarihi %12 = 9 ➜ Yılan
		// Doğum Tarihi %12 = 10 ➜ At
		// Doğum Tarihi %12 = 11 ➜ Koyun

		int year; // variable of birth year

		Scanner scan = new Scanner(System.in); // created scanner

		System.out.print("Doğum yılı girin: "); // input year
		year = scan.nextInt(); // year assigned to the variable

		// controls
		if (year % 12 == 0) {
			System.out.println("Çin Zodyağı Burcunuz: Maymun");
		} else if (year % 12 == 1) {
			System.out.println("Çin Zodyağı Burcunuz: Horoz");
		} else if (year % 12 == 2) {
			System.out.println("Çin Zodyağı Burcunuz: Köpek");
		} else if (year % 12 == 3) {
			System.out.println("Çin Zodyağı Burcunuz: Domuz");
		} else if (year % 12 == 4) {
			System.out.println("Çin Zodyağı Burcunuz: Fare");
		} else if (year % 12 == 5) {
			System.out.println("Çin Zodyağı Burcunuz: Öküz");
		} else if (year % 12 == 6) {
			System.out.println("Çin Zodyağı Burcunuz: Kaplan");
		} else if (year % 12 == 7) {
			System.out.println("Çin Zodyağı Burcunuz: Tavşan");
		} else if (year % 12 == 8) {
			System.out.println("Çin Zodyağı Burcunuz: Ejderha");
		} else if (year % 12 == 9) {
			System.out.println("Çin Zodyağı Burcunuz: Yılan");
		} else if (year % 12 == 10) {
			System.out.println("Çin Zodyağı Burcunuz: At");
		} else if (year % 12 == 11) {
			System.out.println("Çin Zodyağı Burcunuz: Koyun");
		} else {
			System.out.println("Hatalı veri girdiniz!"); // error of data
		}

	}

}
