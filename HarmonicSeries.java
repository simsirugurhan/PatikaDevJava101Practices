package averageNotes;

import java.util.Scanner;

public class HarmonicSeries {

	public static void main(String[] args) {
		// Java ile girilen sayýnýn harmonik serisini bulan program yazacaðýz.

		int number; // variable of number
		double total = 0; // variable of total
		
		Scanner scan = new Scanner(System.in); // created scanner

		System.out.print("Sayý giriniz: "); // input number
		number = scan.nextInt(); // number assigned to the variable

		// loop
		 for (double i=1;i<=number;i++){
	            total = total + (1 / i);
	        }
		
        System.out.println("Harmonik seri sonucu: " + total); //printed
	}
}
