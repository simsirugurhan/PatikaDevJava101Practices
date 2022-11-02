package averageNotes;

import java.util.Scanner;

public class SumDigitsNumber {

	public static void main(String[] args) {
		// Bir sayýnýn basamak sayýlarýnýn toplamýný hesaplayan program yazýnýz.

		int number, total = 0; // variables of number and total
		
		Scanner scan = new Scanner(System.in); // created scanner

		System.out.print("Sayý giriniz: "); // input number
		number = scan.nextInt(); // number assigned to the variable

		// loop
		while(number != 0)
        {
            total += (number%10);
            number = number / 10;
        }
		
        System.out.println("basamak toplamý: " + total); //printed
	}
}
