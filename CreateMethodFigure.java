package averageNotes;

import java.util.Scanner;

public class CreateMethodFigure {
	// Java dilinde kullanıcıdan alınan n değerine göre aşağıdaki kurala uyan döngü
	// kullanmadan bir "Recursive" metot yazın.

	// Kural : Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan 5
	// rakamını çıkarın. Her çıkarma işlemi sırasında ekrana son değeri yazdırın.
	// Sayı negatif veya 0 olduktan sonra tekrar 5 ekleyin. Yine her ekleme
	// işleminde sayının son değerini ekrana yazdırın.

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

		System.out.print("Sayı giriniz :"); // input number
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