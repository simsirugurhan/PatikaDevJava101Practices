package averageNotes;

import java.util.Scanner;

public class SuggestingActivity {

	public static void main(String[] args) {
		// S�cakl�k 5'dan k���k ise "Kayak" yapmay� �ner.
		// S�cakl�k 5 ve 15 aras�nda ise "Sinema" etkinli�ini �ner.
		// S�cakl�k 15 ve 25 aras�nda ise "Piknik" etkinli�ini �ner. => Burada 10
		// vermeliydi san�r�m fakat 15 girilmi� �devde, verilene g�re yap�ld�.
		// S�cakl�k 25'ten b�y�k ise "Y�zme" etkinli�ini �ner.

		int temperature; // variable of air temperature degree

		Scanner scan = new Scanner(System.in); // created scanner

		System.out.println("Hava s�cakl���: "); // input air temperature degree
		temperature = scan.nextInt(); // air temperature degree assigned to the variable

		//controls
		if (temperature < 5) {
			System.out.println("Kayak yapabilirsin.");
		} else if (temperature < 15) {
			System.out.println("Sinemaya gidebilirsin.");
		} else if (temperature < 25 && temperature >= 15) {
			System.out.println("Piknik yapabilirsin.");
		} else {
			System.out.println("Y�zebilirsin");
		}

	}

}
