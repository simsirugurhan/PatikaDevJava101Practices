package averageNotes;

import java.util.Scanner;

public class Taximeter {

	public static void main(String[] args) {
		int km, startPrice = 10;
		double total, perKm = 2.20;
		
		/*
		 *Taksimetre KM ba��na 2.20 TL tutmaktad�r.
		 *Minimum �denecek tutar 20 TL'dir. 20 TL alt�nda ki �cretlerde yine 20 TL al�nacakt�r.
		 *Taksimetre a��l�� �creti 10 TL'dir.
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Ka� km gittin: ");
		km = scan.nextInt();
		
		total = (km * perKm) + startPrice;
		
		total = total < 20 ? 20 : total;
		
		System.out.println("Taksimetre �cretin: " + total);
		
	}

}
