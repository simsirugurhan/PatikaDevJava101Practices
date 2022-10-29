package averageNotes;

import java.util.Scanner;

public class Taximeter {

	public static void main(String[] args) {
		int km, startPrice = 10;
		double total, perKm = 2.20;
		
		/*
		 *Taksimetre KM baþýna 2.20 TL tutmaktadýr.
		 *Minimum ödenecek tutar 20 TL'dir. 20 TL altýnda ki ücretlerde yine 20 TL alýnacaktýr.
		 *Taksimetre açýlýþ ücreti 10 TL'dir.
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Kaç km gittin: ");
		km = scan.nextInt();
		
		total = (km * perKm) + startPrice;
		
		total = total < 20 ? 20 : total;
		
		System.out.println("Taksimetre Ücretin: " + total);
		
	}

}
