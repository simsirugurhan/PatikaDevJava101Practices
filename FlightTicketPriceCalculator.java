package averageNotes;

import java.util.Scanner;

public class FlightTicketPriceCalculator {

	public static void main(String[] args) {
		// Java ile mesafeye ve �artlara g�re u�ak bileti fiyat� hesaplayan program�
		// yap�n. Kullan�c�dan Mesafe (KM), ya�� ve yolculuk tipi (Tek Y�n, Gidi�-D�n��)
		// bilgilerini al�n. Mesafe ba��na �cret 0,10 TL / km olarak al�n. �lk olarak
		// u�u�un toplam fiyat�n� hesaplay�n ve sonras�nda ki ko�ullara g�re m��teriye
		// a�a��daki indirimleri uygulay�n ;

		// Kullan�c�dan al�nan de�erler ge�erli (mesafe ve ya� de�erleri pozitif say�,
		// yolculuk tipi ise 1 veya 2) olmal�d�r. Aksi takdirde kullan�c�ya "Hatal� Veri
		// Girdiniz !" �eklinde bir uyar� verilmelidir.
		// Ki�i 12 ya��ndan k���kse bilet fiyat� �zerinden %50 indirim uygulan�r.
		// Ki�i 12-24 ya�lar� aras�nda ise bilet fiyat� �zerinden %10 indirim uygulan�r.
		// Ki�i 65 ya��ndan b�y�k ise bilet fiyat� �zerinden %30 indirim uygulan�r.
		// Ki�i "Yolculuk Tipini" gidi� d�n�� se�mi� ise bilet fiyat� �zerinden %20
		// indirim uygulan�r.

		int distance, age, type; // variables of distance, age and trip type
		double perKm = 0.10, price;

		Scanner scan = new Scanner(System.in); // created scanner

		System.out.print("Mesafe girin: "); // input distance
		distance = scan.nextInt(); // distance assigned to the variable

		System.out.print("Ya� girin: ");
		age = scan.nextInt();

		System.out.print("Yolculuk tipi [1=>Tek Y�n, 2=>Gidi�-D�n��]: ");
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

			System.out.println("U�ak bilet fiyat�n�z: " + price); // print last price
		} else {
			System.out.println("Hatal� veri girdiniz!"); // error of data
		}

	}

}
