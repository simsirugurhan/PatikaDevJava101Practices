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

		System.out.print("�lk say�y� girin: "); // input first number of operation
		firstNumber = scan.nextInt(); // first number assigned to the variable

		System.out.print("�kinci say�y� girin: "); // input second number of operation
		secondNumber = scan.nextInt(); // second number assigned to the variable

		System.out.println("1 => toplama\n2 => ��karma\n3 => �arpma\n4 => b�lme");
		System.out.print("��lem girin: "); // input operation number
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
			System.out.println("��karma: " + result);
			break;
		case 3:
			//multiplication operation
			result = firstNumber * secondNumber;
			System.out.println("�arp�m: " + result);
			break;
		case 4:
			//division operation
			result = firstNumber / secondNumber;
			System.out.println("B�l�m: " + result);
			break;
		default:
			System.out.println("L�tfen 1-4 aras� se�im yap�n!");
			break;
		}

	}

}
