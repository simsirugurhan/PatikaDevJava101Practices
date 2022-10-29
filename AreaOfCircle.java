package averageNotes;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		int r;
		double a, pi = 3.14, area;

		Scanner scan = new Scanner(System.in);
		
		System.out.print("yarıçapı: ");
		r = scan.nextInt();
		
		System.out.print("merkez açı: ");
		a = scan.nextDouble();
		
		/*
		 * Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
		 *
		 *𝜋 sayısını = 3.14 alınız.
		 *
		 *Formül : (𝜋 * (r*r) * 𝛼) / 360
		 */
		
		area = (pi * (r*r) * a) / 360;
		System.out.println("Daire diliminin alanı: " + area);
	}

}
