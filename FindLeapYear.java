package averageNotes;

import java.util.Scanner;

public class FindLeapYear {

	public static void main(String[] args) {
		// Genel bir kural olarak, artık yıllar 4 rakamının katı olan yıllardır:
		// 1988, 1992, 1996, 2000, 2004, 2008, 2012, 2016, 2020, 2024 gibi.
		// 100'ün katı olan yıllardan sadece 400'e kalansız olarak bölünebilenler artık
		// yıldır:
		// Örneğin 1200, 1600, 2000 yılları artık yıldır ancak 1700, 1800 ve 1900 artık
		// yıl değildir.
		// Sadece 400'e tam olarak bölünebilenlerin artık yıl kabul edilmesinin nedeni,
		// bir astronomik yılın 365,25 gün değil, yaklaşık olarak 365,242 gün olmasından
		// kaynaklanan hatayı gidermektir.

		int year; // variable of year

		Scanner scan = new Scanner(System.in); // created scanner

		System.out.print("Doğum yılı girin: "); // input year
		year = scan.nextInt(); // year assigned to the variable

		// controls
		if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
			System.out.println(year + " bir artık yıldır!");
		} else {
			System.out.println(year + " bir artık yıldır değildir!"); // error of data
		}

	}

}
