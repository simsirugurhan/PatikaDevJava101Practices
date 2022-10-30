package averageNotes;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstNumber, secondNumber, operationNumber;

		// math operation numbers;
		// 1 => addition,
		// 2 => subtraction,
		// 3 => multiplication,
		// 4 => division.

		double result;

		Scanner scan = new Scanner(System.in);

		System.out.print("Ýlk sayýyý girin: "); // input first number of operation
		firstNumber = scan.nextInt(); // first number assigned to the variable

		System.out.print("Ýkinci sayýyý girin: "); // input second number of operation
		secondNumber = scan.nextInt(); // second number assigned to the variable

		System.out.println("1 => toplama\n2 => çýkarma\n3 => çarpma\n4 => bölme");
		System.out.print("Ýþlem girin: "); // input operation number
		operationNumber = scan.nextInt(); // operation number assigned to the variable

		switch (operationNumber) {
		case 1:
			//addition operation
			result = firstNumber + secondNumber;
			System.out.println("Toplam: " + result);
			break;
		case 2:
			//subtraction operation
			result = firstNumber - secondNumber;
			System.out.println("Çýkarma: " + result);
			break;
		case 3:
			//multiplication operation
			result = firstNumber * secondNumber;
			System.out.println("Çarpým: " + result);
			break;
		case 4:
			//division operation
			result = firstNumber / secondNumber;
			System.out.println("Bölüm: " + result);
			break;
		default:
			System.out.println("Lütfen 1-4 arasý seçim yapýn!");
			break;
		}

	}

}
