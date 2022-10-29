package averageNotes;

import java.util.Scanner;

public class BodyMassIndex {

	public static void main(String[] args) {
		//Kilo (kg) / Boy(m) * Boy(m)
		double weight, height, index; //Created variables
		
		Scanner scan = new Scanner(System.in); // Created scanner for input from user
		System.out.print("Kilo giriniz: ");
		weight = scan.nextDouble(); //scanning user's weight
		
		System.out.print("Boy giriniz (Metre Cinsinden): ");
		height = scan.nextDouble(); //scanning user's height
		
		index = weight / (height * height); //calculating body mass index for user
		System.out.println("Vücut kitle indeksiniz: " + index); //output of user's body mass index
	}

}
