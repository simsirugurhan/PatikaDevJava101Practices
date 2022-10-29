package averageNotes;

import java.util.Scanner;

public class BodyMassIndex {

	public static void main(String[] args) {
		//Kilo (kg) / Boy(m) * Boy(m)
		double weight, height, index;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Kilo giriniz: ");
		weight = scan.nextDouble(); 
		
		System.out.print("Boy giriniz (Metre Cinsinden): ");
		height = scan.nextDouble();
		
		index = weight / (height * height);
		System.out.println("Vücut kitle indeksiniz: " + index);
	}

}
