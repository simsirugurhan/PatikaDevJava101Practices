package averageNotes;

import java.util.Scanner;

public class FindLeapYear {

	public static void main(String[] args) {
		// Genel bir kural olarak, art�k y�llar 4 rakam�n�n kat� olan y�llard�r:
		// 1988, 1992, 1996, 2000, 2004, 2008, 2012, 2016, 2020, 2024 gibi.
		// 100'�n kat� olan y�llardan sadece 400'e kalans�z olarak b�l�nebilenler art�k
		// y�ld�r:
		// �rne�in 1200, 1600, 2000 y�llar� art�k y�ld�r ancak 1700, 1800 ve 1900 art�k
		// y�l de�ildir.
		// Sadece 400'e tam olarak b�l�nebilenlerin art�k y�l kabul edilmesinin nedeni,
		// bir astronomik y�l�n 365,25 g�n de�il, yakla��k olarak 365,242 g�n olmas�ndan
		// kaynaklanan hatay� gidermektir.

		int year; // variable of year

		Scanner scan = new Scanner(System.in); // created scanner

		System.out.print("Do�um y�l� girin: "); // input year
		year = scan.nextInt(); // year assigned to the variable

		// controls
		if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
			System.out.println(year + " bir art�k y�ld�r!");
		} else {
			System.out.println(year + " bir art�k y�ld�r de�ildir!"); // error of data
		}

	}

}
