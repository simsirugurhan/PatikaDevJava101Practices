package averageNotes;

import java.util.Scanner;

public class GroceryStore {

	public static void main(String[] args) {
		/*
		 * Armut : 2,14 TL
		 *Elma : 3,67 TL
		 *Domates : 1,11 TL
		 *Muz: 0,95 TL
		 *Patlýcan : 5,00 TL
		 */
		int pear, apple, tomato, banana, aubergine; //Created variables for kg
		double total, pearPrice = 2.14, applePrice = 3.67, tomatoPrice = 1.11, bananaPrice = 0.95, auberginePrice = 5.0; //prices of fruits
		
		Scanner scan = new Scanner(System.in); //created scanner for input from user
		System.out.print("Armut kg girin: ");
		pear = scan.nextInt(); //scanning
		System.out.print("Elma kg girin: ");
		apple = scan.nextInt();
		System.out.print("Domates kg girin: ");
		tomato = scan.nextInt();
		System.out.print("Muz kg girin: ");
		banana = scan.nextInt();
		System.out.print("Patlýcan kg girin: ");
		aubergine = scan.nextInt();

		total = (pear * pearPrice) + (apple * applePrice) + (tomato * tomatoPrice) + (banana * bananaPrice) + (aubergine * auberginePrice); // total price calculating
		System.out.println("Toplam Tutar: " + total + " TL"); //output of total price of buying fruits by user
	}

}
