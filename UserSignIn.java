package averageNotes;

import java.util.Scanner;

public class UserSignIn {

	public static void main(String[] args) {
		// E�er �ifre yanl�� ise kullan�c�ya �ifresini s�f�rlay�p
		// s�f�rlamayaca��n� sorun, e�er kullan�c� s�f�rlamak isterse yeni girdi�i
		// �ifrenin hatal� girdi�i ve unuttu�u �ifre ile ayn� olmamas� gerekti�ini
		// kontrol edip , �ifreler ayn� ise ekrana "�ifre olu�turulamad�, l�tfen ba�ka
		// �ifre giriniz." sorun yoksa "�ifre olu�turuldu" yazan program� yaz�n�z.

		String userName, password, userPassword = "e-bebek";

		Scanner scan = new Scanner(System.in);

		System.out.print("Kullan�c� Ad�: "); // input user name
		userName = scan.nextLine(); // user name assigned to the variable

		System.out.print("Parola: "); // input password
		password = scan.nextLine(); // password assigned to the variable

		// default userName = patika.dev

		if (userName.equals("patika.dev") && password.equals(userPassword)) {
			System.out.println("giri� yap�ld�!"); // successful signing

		} else if (userName.equals("patika.dev") && !password.equals(userPassword)) {
			System.out.println("Parolan� de�i�tirmek ister misin?[E => Evet, H => Hay�r]: "); // asked reset your
																								// password [E => yes, H
																								// => no]
			String controller = scan.nextLine(); // controller assigned to the variable

			if (controller.equals("E") || controller.equals("e")) {
				// case sensitivity ignore
				System.out.println("Yeni parola girin: "); // input new password for the user name
				String newPassword = scan.nextLine(); // new password assigned to the variable

				System.out
						.println(newPassword.equals(userPassword) ? "�ifre olu�turulamad�, l�tfen ba�ka �ifre giriniz."
								: "�ifre olu�turuldu!");
				// Write failed if the new password is the same as the old password.
				// Write successful if the new password is not the same as the old password.
			}

		} else {
			System.out.println("b�yle bir kullan�c� bulunamad�!");
			// Write there is no user if user name and password is not correct.
		}
	}

}
