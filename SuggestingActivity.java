package averageNotes;

import java.util.Scanner;

public class SuggestingActivity {

	public static void main(String[] args) {
		// Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
		// Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
		// Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner. => Burada 10
		// vermeliydi sanırım fakat 15 girilmiş ödevde, verilene göre yapıldı.
		// Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.

		int temperature; // variable of air temperature degree

		Scanner scan = new Scanner(System.in); // created scanner

		System.out.print("Hava sıcaklığı: "); // input air temperature degree
		temperature = scan.nextInt(); // air temperature degree assigned to the variable

		//controls
		if (temperature < 5) {
			System.out.println("Kayak yapabilirsin.");
		} else if (temperature < 15) {
			System.out.println("Sinemaya gidebilirsin.");
		} else if (temperature < 25 && temperature >= 15) {
			System.out.println("Piknik yapabilirsin.");
		} else {
			System.out.println("Yüzebilirsin");
		}

	}

}
