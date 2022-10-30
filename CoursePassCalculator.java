package averageNotes;

import java.util.Scanner;

public class CoursePassCalculator {

	public static void main(String[] args) {
		// Dersler : Matematik, Fizik, T�rk�e, Kimya, M�zik
		// Ge�me Notu : 55
		// E�er girilen ders notlar� 0 veya 100 aras�nda de�il ise ortalamaya
		// kat�lmas�n.

		int math, physics, turkish, chemical, music; // courses score variables
		int totalCourse = 5, average; // total courses value, courses average score variable

		Scanner scan = new Scanner(System.in);

		System.out.print("Matematik notu: "); // input math score
		math = scan.nextInt(); // math score assigned to the variable
		math = math < 0 || math > 100 ? 0 : math; // if score is not between 0 and 100, do not calculate this score in
													// average
		totalCourse = math == 0 ? totalCourse - 1 : totalCourse;

		System.out.print("Fizik notu: ");
		physics = scan.nextInt();
		physics = physics < 0 || physics > 100 ? 0 : physics;
		totalCourse = physics == 0 ? totalCourse - 1 : totalCourse;

		System.out.print("T�rk�e notu: ");
		turkish = scan.nextInt();
		turkish = turkish < 0 || turkish > 100 ? 0 : turkish;
		totalCourse = turkish == 0 ? totalCourse - 1 : totalCourse;

		System.out.print("Kimya notu: ");
		chemical = scan.nextInt();
		chemical = chemical < 0 || chemical > 100 ? 0 : chemical;
		totalCourse = chemical == 0 ? totalCourse - 1 : totalCourse;

		System.out.print("M�zik notu: ");
		music = scan.nextInt();
		music = music < 0 || music > 100 ? 0 : music;
		totalCourse = music == 0 ? totalCourse - 1 : totalCourse;

		average = (math + physics + turkish + chemical + music) / totalCourse; // calculate the average of courses

		if (average < 55) {
			System.out.println("Maalesef! Kald�n�z.");
		} else {
			System.out.println("Tebrikler! Ge�tiniz.");
		}
		System.out.println("Ortalaman�z: " + average);
	}

}
