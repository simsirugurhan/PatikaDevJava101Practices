package averageNotes;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int matematik, fizik, kimya, turkce, tarih, muzik;

		Scanner scanner = new Scanner(System.in);

		System.out.print("matematik için not: ");
		matematik = scanner.nextInt();
		System.out.print("fizik için not: ");
		fizik = scanner.nextInt();
		System.out.print("kimya için not: ");
		kimya = scanner.nextInt();
		System.out.print("Türkçe için not: ");
		turkce = scanner.nextInt();
		System.out.print("tarih için not: ");
		tarih = scanner.nextInt();
		System.out.print("muzik için not: ");
		muzik = scanner.nextInt();
		
		double average = (matematik + fizik + kimya+ turkce+ tarih+ muzik) / 6;
		
		String message = average > 60 ? "geçti" : "kaldý"; 
		
		System.out.println(average + " ortalama ile " + message);
	}

}
