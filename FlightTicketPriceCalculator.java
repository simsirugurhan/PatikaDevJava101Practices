package averageNotes;

import java.util.Scanner;

public class FlightTicketPriceCalculator {

	public static void main(String[] args) {
		// Java ile mesafeye ve þartlara göre uçak bileti fiyatý hesaplayan programý
		// yapýn. Kullanýcýdan Mesafe (KM), yaþý ve yolculuk tipi (Tek Yön, Gidiþ-Dönüþ)
		// bilgilerini alýn. Mesafe baþýna ücret 0,10 TL / km olarak alýn. Ýlk olarak
		// uçuþun toplam fiyatýný hesaplayýn ve sonrasýnda ki koþullara göre müþteriye
		// aþaðýdaki indirimleri uygulayýn ;

		// Kullanýcýdan alýnan deðerler geçerli (mesafe ve yaþ deðerleri pozitif sayý,
		// yolculuk tipi ise 1 veya 2) olmalýdýr. Aksi takdirde kullanýcýya "Hatalý Veri
		// Girdiniz !" þeklinde bir uyarý verilmelidir.
		// Kiþi 12 yaþýndan küçükse bilet fiyatý üzerinden %50 indirim uygulanýr.
		// Kiþi 12-24 yaþlarý arasýnda ise bilet fiyatý üzerinden %10 indirim uygulanýr.
		// Kiþi 65 yaþýndan büyük ise bilet fiyatý üzerinden %30 indirim uygulanýr.
		// Kiþi "Yolculuk Tipini" gidiþ dönüþ seçmiþ ise bilet fiyatý üzerinden %20
		// indirim uygulanýr.

		int distance, age, type; // variables of distance, age and trip type
		double perKm = 0.10, price;

		Scanner scan = new Scanner(System.in); // created scanner

		System.out.print("Mesafe girin: "); // input distance
		distance = scan.nextInt(); // distance assigned to the variable

		System.out.print("Yaþ girin: ");
		age = scan.nextInt();

		System.out.print("Yolculuk tipi [1=>Tek Yön, 2=>Gidiþ-Dönüþ]: ");
		type = scan.nextInt();

		// controls
		if ((type == 1 || type == 2) && (age > 0) && (distance > 0)) {

			price = distance * perKm; // firstly calculate total price

			if (age < 12) {
				price -= price * 0.50;
			} else if (age >= 12 && age <= 24) {
				price -= price * 0.10;
			} else if (age > 65) {
				price -= price * 0.30;
			}

			if (type == 2) {
				price = (price - price * 0.20) * 2;
			}

			System.out.println("Uçak bilet fiyatýnýz: " + price); // print last price
		} else {
			System.out.println("Hatalý veri girdiniz!"); // error of data
		}

	}

}
