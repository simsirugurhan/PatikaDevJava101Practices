package averageNotes;

import java.util.Scanner;

public class FindHoroscope {

	public static void main(String[] args) {
		// Koç Burcu : 21 Mart - 20 Nisan
		// Boğa Burcu : 21 Nisan - 21 Mayıs
		// İkizler Burcu : 22 Mayıs - 22 Haziran
		// Yengeç Burcu : 23 Haziran - 22 Temmuz
		// Aslan Burcu : 23 Temmuz - 22 Ağustos
		// Başak Burcu : 23 Ağustos - 22 Eylül
		// Terazi Burcu : 23 Eylül - 22 Ekim
		// Akrep Burcu : 23 Ekim - 21 Kasım
		// Yay Burcu : 22 Kasım - 21 Aralık
		// Oğlak Burcu : 22 Aralık - 21 Ocak
		// Kova Burcu : 22 Ocak - 19 Şubat
		// Balık Burcu : 20 Şubat - 20 Mart

		int day, month; // variables of day and month

		Scanner scan = new Scanner(System.in); // created scanner

		System.out.print("Doğduğunuz gününüz: "); // input day
		day = scan.nextInt(); // day assigned to the variable
		day = (day > 0 || day < 32) ? day : -1; // day must be between 0 - 32
		
		System.out.print("Doğduğunuz ay: ");
		month = scan.nextInt();
		month = (month > 0 || month < 13) ? month : -1; // month must be between 0 - 13
		
		//controls
		if (day > 0 && month > 0) {
			if ((day >= 21 && month == 3) || (day <= 20 && month == 4)) {
				System.out.println("Koç burcusunuz.");
			} else if ((day >= 21 && month == 4) || (day <= 21 && month == 5)) {
				System.out.println("Boğa burcusunuz.");
			} else if ((day >= 22 && month == 5) || (day <= 22 && month == 6)) {
				System.out.println("İkizler burcusunuz.");
			} else if ((day >= 23 && month == 6) || (day <= 22 && month == 7)) {
				System.out.println("Yengeç burcusunuz.");
			} else if ((day >= 23 && month == 7) || (day <= 22 && month == 8)) {
				System.out.println("Aslan burcusunuz.");
			} else if ((day >= 23 && month == 8) || (day <= 22 && month == 9)) {
				System.out.println("Başak burcusunuz.");
			} else if ((day >= 23 && month == 9) || (day <= 22 && month == 10)) {
				System.out.println("Terazi burcusunuz.");
			} else if ((day >= 23 && month == 10) || (day <= 21 && month == 11)) {
				System.out.println("Akrep burcusunuz.");
			} else if ((day >= 22 && month == 11) || (day <= 21 && month == 12)) {
				System.out.println("Yay burcusunuz.");
			} else if ((day >= 22 && month == 12) || (day <= 21 && month == 1)) {
				System.out.println("Oğlak burcusunuz.");
			} else if ((day >= 22 && month == 1) || (day <= 19 && month == 2)) {
				System.out.println("Kova burcusunuz.");
			} else if ((day >= 20 && month == 2) || (day <= 20 && month == 3)) {
				System.out.println("Balık burcusunuz.");
			}
		} else if (day == -1) {
			System.out.println("Geçerli gün giriniz!");
		} else if (month == -1) {
			System.out.println("Geçerli gün giriniz!");
		} else {
			System.out.println("Geçerli tarih aralığı giriniz!");
		}

	}

}
