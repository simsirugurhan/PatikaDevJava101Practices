package averageNotes;

import java.util.Scanner;

public class PrimeNumberCalculator {
	// Java dilinde "Recursive" metot kullanarak, kullan�c�dan al�nan say�n�n "Asal"
	// say� olup olmad���n� bulan program� yaz�n.

    static void prime(int number,int control){
    	//controls
        if (control == number) {
            System.out.print(number + " asal say�d�r."); // printed
            return;
        } else if (number % control == 0) {
            System.out.print(number + " asal say� de�ildir."); // printed
            return;
        }

        prime(number, control + 1); // recursive
    }

	public static void main(String[] args) {
		int number; // variable of number

		Scanner scan = new Scanner(System.in); // scanner created

		System.out.print("Say� giriniz :"); // input number
		number = scan.nextInt(); // number assigned to variable

		prime(number,2); // calling method
    
	}
}