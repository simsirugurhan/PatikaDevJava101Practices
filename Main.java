package averageNotes;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int matematik, fizik, kimya, turkce, tarih, muzik;

		Scanner scanner = new Scanner(System.in);

		System.out.print("matematik i�in not: ");
		matematik = scanner.nextInt();
		System.out.print("fizik i�in not: ");
		fizik = scanner.nextInt();
		System.out.print("kimya i�in not: ");
		kimya = scanner.nextInt();
		System.out.print("T�rk�e i�in not: ");
		turkce = scanner.nextInt();
		System.out.print("tarih i�in not: ");
		tarih = scanner.nextInt();
		System.out.print("muzik i�in not: ");
		muzik = scanner.nextInt();
		
		double average = (matematik + fizik + kimya+ turkce+ tarih+ muzik) / 6;
		
		String message = average > 60 ? "ge�ti" : "kald�"; 
		
		System.out.println(average + " ortalama ile " + message);
	}

}
