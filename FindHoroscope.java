package averageNotes;

import java.util.Scanner;

public class FindHoroscope {

	public static void main(String[] args) {
		// Ko� Burcu : 21 Mart - 20 Nisan
		// Bo�a Burcu : 21 Nisan - 21 May�s
		// �kizler Burcu : 22 May�s - 22 Haziran
		// Yenge� Burcu : 23 Haziran - 22 Temmuz
		// Aslan Burcu : 23 Temmuz - 22 A�ustos
		// Ba�ak Burcu : 23 A�ustos - 22 Eyl�l
		// Terazi Burcu : 23 Eyl�l - 22 Ekim
		// Akrep Burcu : 23 Ekim - 21 Kas�m
		// Yay Burcu : 22 Kas�m - 21 Aral�k
		// O�lak Burcu : 22 Aral�k - 21 Ocak
		// Kova Burcu : 22 Ocak - 19 �ubat
		// Bal�k Burcu : 20 �ubat - 20 Mart

		int day, month; // variables of day and month

		Scanner scan = new Scanner(System.in); // created scanner

		System.out.print("Do�du�unuz g�n�n�z: "); // input day
		day = scan.nextInt(); // day assigned to the variable
		day = (day > 0 || day < 32) ? day : -1; // day must be between 0 - 32
		
		System.out.print("Do�du�unuz ay: ");
		month = scan.nextInt();
		month = (month > 0 || month < 13) ? month : -1; // month must be between 0 - 13
		
		if (day > 0 && month > 0) {
			if ((day >= 21 && month == 3) || (day <= 20 && month == 4)) {
				System.out.println("Ko� burcusunuz.");
			} else if ((day >= 21 && month == 4) || (day <= 21 && month == 5)) {
				System.out.println("Bo�a burcusunuz.");
			} else if ((day >= 22 && month == 5) || (day <= 22 && month == 6)) {
				System.out.println("�kizler burcusunuz.");
			} else if ((day >= 23 && month == 6) || (day <= 22 && month == 7)) {
				System.out.println("Yenge� burcusunuz.");
			} else if ((day >= 23 && month == 7) || (day <= 22 && month == 8)) {
				System.out.println("Aslan burcusunuz.");
			} else if ((day >= 23 && month == 8) || (day <= 22 && month == 9)) {
				System.out.println("Ba�ak burcusunuz.");
			} else if ((day >= 23 && month == 9) || (day <= 22 && month == 10)) {
				System.out.println("Terazi burcusunuz.");
			} else if ((day >= 23 && month == 10) || (day <= 21 && month == 11)) {
				System.out.println("Akrep burcusunuz.");
			} else if ((day >= 22 && month == 11) || (day <= 21 && month == 12)) {
				System.out.println("Yay burcusunuz.");
			} else if ((day >= 22 && month == 12) || (day <= 21 && month == 1)) {
				System.out.println("O�lak burcusunuz.");
			} else if ((day >= 22 && month == 1) || (day <= 19 && month == 2)) {
				System.out.println("Kova burcusunuz.");
			} else if ((day >= 20 && month == 2) || (day <= 20 && month == 3)) {
				System.out.println("Bal�k burcusunuz.");
			}
		} else if (day == -1) {
			System.out.println("Ge�erli g�n giriniz!");
		} else if (month == -1) {
			System.out.println("Ge�erli g�n giriniz!");
		} else {
			System.out.println("Ge�erli tarih aral��� giriniz!");
		}

	}

}
