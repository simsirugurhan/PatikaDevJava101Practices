import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double price;

		Scanner scanner = new Scanner(System.in);

		System.out.print("tutar: ");
		price = scanner.nextDouble();
		
		if(price < 0) {
			System.out.println("Doğru tutar giriniz!");
		}else {
			double kdv = price >= 1000 ? 0.18 : 0.08;
			
			double priceWithTax = (price * kdv) + price;
			
			System.out.println("KDV dahil tutar: " + priceWithTax);
		}
	}
}
