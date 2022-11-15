package averageNotes;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessNumberGame {

	public static void main(String[] args) {
		// Java dilinde program�n 0-100 aras�nda rastgele se�ti�i bir say�y�
		// kullan�c�n�n tahmin etmesini istedi�imiz bir "Say� Tahmin Oyunu" yap�yoruz.

		Random rand = new Random();
		int number = rand.nextInt(101);
		
		Scanner scan = new Scanner(System.in);
		
		int chance = 0;
		int select = 0;
		int[] selected = new int[5];

		for (int i = 0; i < 5; i++) {
			selected[chance++] = select;
			System.out.print("Tahmininizi giriniz:");
			select = scan.nextInt();

			if (select > 0 && select < 100) {
				if (select == number) {
					System.out.println("Tahmininiz do�rudur say� : " + number);
					break;
				} else {
					System.out.println("Hatal� say� girdiniz, Kalan Hakk�n�z: " + (5 - chance));
					if (select < number) {
						System.out.println(select + " Say�s� gizli say�dan k���kt�r");
					} else {
						System.out.println(select + " Say�s� gizli say�dan b�y�kt�r");
					}

				}

			} else {
				i--;
				chance--;
				System.out.println("0-100 aras� olmal�d�r! Kalan hakk�n�z : " + (5 - chance));

			}
			if (chance == 5 && number != select) {
				System.out.println(
						"Kaybettiniz, Tahminleriniz : " + Arrays.toString(selected) + "Gizli Say� : " + number);
			}
		}

	}

}
