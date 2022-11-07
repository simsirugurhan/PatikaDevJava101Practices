package averageNotes;

import java.util.Scanner;

public class PrimeNumberCalculator {
	// Java dilinde "Recursive" metot kullanarak, kullanýcýdan alýnan sayýnýn "Asal"
	// sayý olup olmadýðýný bulan programý yazýn.

    static void prime(int number,int control){
    	//controls
        if (control == number) {
            System.out.print(number + " asal sayýdýr."); // printed
            return;
        } else if (number % control == 0) {
            System.out.print(number + " asal sayý deðildir."); // printed
            return;
        }

        prime(number, control + 1); // recursive
    }

	public static void main(String[] args) {
		int number; // variable of number

		Scanner scan = new Scanner(System.in); // scanner created

		System.out.print("Sayý giriniz :"); // input number
		number = scan.nextInt(); // number assigned to variable

		prime(number,2); // calling method
    
	}
}