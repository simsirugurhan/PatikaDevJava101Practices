package averageNotes;
import java.util.Scanner;

public class FindHypotenuseOfRightTriangle {

	public static void main(String[] args) {
		int a,b;
		double hypotenuse,u;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("a kenarı: ");
		a = scan.nextInt();
		System.out.print("b kenarı: ");
		b = scan.nextInt();
		
		hypotenuse = Math.sqrt((a*a)+(b*b));
		/*
		 * Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢
*
*			𝑢 = (a+b+c) / 2
*
*			Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
*
*(a*b/2) de alanı veriyor fakat istenen bu
		 */
		
		u = (a + b + hypotenuse) / 2;
		
		double area = Math.sqrt(u * (u - a) * (u - b) * (u - hypotenuse)); 
		System.out.println("Dik Üçgenin Alanı: " + area + "\nHipotenüsü: " + hypotenuse);
	}

}
