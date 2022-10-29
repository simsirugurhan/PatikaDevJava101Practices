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
		int armut, elma, domates, muz, patlican;
		double total, armutPrice = 2.14, elmaPrice = 3.67, domatesPrice = 1.11, muzPrice = 0.95, patlicanPrice = 5.0;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Armut kg girin: ");
		armut = scan.nextInt();
		System.out.print("Elma kg girin: ");
		elma = scan.nextInt();
		System.out.print("Domates kg girin: ");
		domates = scan.nextInt();
		System.out.print("Muz kg girin: ");
		muz = scan.nextInt();
		System.out.print("Patlýcan kg girin: ");
		patlican = scan.nextInt();

		total = (armut * armutPrice) + (elma * elmaPrice) + (domates * domatesPrice) + (muz * muzPrice) + (patlican * patlicanPrice);
		System.out.println("Toplam Tutar: " + total + " TL");
	}

}
