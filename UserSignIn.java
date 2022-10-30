package averageNotes;

import java.util.Scanner;

public class UserSignIn {

	public static void main(String[] args) {
		// Eðer þifre yanlýþ ise kullanýcýya þifresini sýfýrlayýp
		// sýfýrlamayacaðýný sorun, eðer kullanýcý sýfýrlamak isterse yeni girdiði
		// þifrenin hatalý girdiði ve unuttuðu þifre ile ayný olmamasý gerektiðini
		// kontrol edip , þifreler ayný ise ekrana "Þifre oluþturulamadý, lütfen baþka
		// þifre giriniz." sorun yoksa "Þifre oluþturuldu" yazan programý yazýnýz.

		String userName, password, userPassword = "e-bebek";

		Scanner scan = new Scanner(System.in);

		System.out.print("Kullanýcý Adý: "); // input user name
		userName = scan.nextLine(); // user name assigned to the variable

		System.out.print("Parola: "); // input password
		password = scan.nextLine(); // password assigned to the variable

		// default userName = patika.dev

		if (userName.equals("patika.dev") && password.equals(userPassword)) {
			System.out.println("giriþ yapýldý!"); // successful signing

		} else if (userName.equals("patika.dev") && !password.equals(userPassword)) {
			//if user name correct but password is not correct
			System.out.println("Parolaný deðiþtirmek ister misin?[E => Evet, H => Hayýr]: "); // asked reset your
																								// password [E => yes, H
																								// => no]
			String controller = scan.nextLine(); // controller assigned to the variable

			if (controller.equals("E") || controller.equals("e")) {
				// case sensitivity ignore
				System.out.println("Yeni parola girin: "); // input new password for the user name
				String newPassword = scan.nextLine(); // new password assigned to the variable

				System.out
						.println(newPassword.equals(userPassword) ? "Þifre oluþturulamadý, lütfen baþka þifre giriniz."
								: "Þifre oluþturuldu!");
				// Write failed if the new password is the same as the old password.
				// Write successful if the new password is not the same as the old password.
			}

		} else {
			System.out.println("böyle bir kullanýcý bulunamadý!");
			// Write there is no user if user name and password is not correct.
		}
	}

}
