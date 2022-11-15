package averageNotes;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessNumberGame {

	public static void main(String[] args) {
		// Java dilinde programýn 0-100 arasýnda rastgele seçtiði bir sayýyý
		// kullanýcýnýn tahmin etmesini istediðimiz bir "Sayý Tahmin Oyunu" yapýyoruz.

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
					System.out.println("Tahmininiz doðrudur sayý : " + number);
					break;
				} else {
					System.out.println("Hatalý sayý girdiniz, Kalan Hakkýnýz: " + (5 - chance));
					if (select < number) {
						System.out.println(select + " Sayýsý gizli sayýdan küçüktür");
					} else {
						System.out.println(select + " Sayýsý gizli sayýdan büyüktür");
					}

				}

			} else {
				i--;
				chance--;
				System.out.println("0-100 arasý olmalýdýr! Kalan hakkýnýz : " + (5 - chance));

			}
			if (chance == 5 && number != select) {
				System.out.println(
						"Kaybettiniz, Tahminleriniz : " + Arrays.toString(selected) + "Gizli Sayý : " + number);
			}
		}

	}

}
