package averageNotes;

import java.util.Scanner;

public class CreateMethodFigure {
	// Java dilinde kullan�c�dan al�nan n de�erine g�re a�a��daki kurala uyan d�ng�
	// kullanmadan bir "Recursive" metot yaz�n.

	// Kural : Girilen say� 0 veya negatif oldu�u yere kadar girilen say�dan 5
	// rakam�n� ��kar�n. Her ��karma i�lemi s�ras�nda ekrana son de�eri yazd�r�n.
	// Say� negatif veya 0 olduktan sonra tekrar 5 ekleyin. Yine her ekleme
	// i�leminde say�n�n son de�erini ekrana yazd�r�n.

	static void figure(int number, int original, int control) {
		// controls
		if((control == 0 && number > (original * -1)) ||(control == 1 && number < (original * -1))) {
			return;
		}else {
			if (number > 0) {
				System.out.print(number + " ");
				if (control == 0) {
					figure(number + 5, original, 0);
					return;
				} else {
					figure(number - 5, original, 1);
					return;
				}
			} else if (number == 0) {
				System.out.print(number + " ");

				if (control == 0) {
					figure(number + 5, original, 0);
					return;
				} else {
					figure(number - 5, original, 1);
					return;
				}
			} else {
				System.out.print(number + " ");
				if (control == 0) {
					figure(number + 5, original, 0);
					return;
				} else {
					figure(number - 5, original, 1);
					return;
				}
				// if number is from negative to zero control will be 0
			}
		}
	}

	public static void main(String[] args) {
		int number, control; // variables of number and control

		Scanner scan = new Scanner(System.in); // scanner created

		System.out.print("Say� giriniz :"); // input number
		number = scan.nextInt(); // number assigned to variable
		
		if (number < 0) {
			control = 0; // if number is negative control will be 0
			figure(number, number, control); // calling method
		} else if (number > 0) {
			control = 1; // if number is positive control will be 1
			figure(number, number, control); // calling method
		} else {
			System.out.println("0 girmeyiniz"); // if number is 0, print error message
		}
	}
}