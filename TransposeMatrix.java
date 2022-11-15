package averageNotes;

import java.util.Scanner;

public class TransposeMatrix {

	public static void main(String[] args) {
		//Java dilinde, çok boyutlu diziler ile oluþturulmuþ matrisin transpozunu bulan programý yazýnýz.

		int column, row; // variables of column and row
		
		Scanner scan = new Scanner(System.in); // scanner created
		
        System.out.print("Satýr sayýsýný giriniz : ");
        row = scan.nextInt(); // input value assigned to row
        
        System.out.print("Sütun sayýsýný giriniz : ");
        column = scan.nextInt(); // input value assigned to column

        int[][] matrix = new int[row][column]; // variable of matrix
        int[][] transposeMatrix = new int[column][row]; // variable of transpose matrix
        
        //loop for input column and row
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print((i + 1) + ". satýrýn " + (j + 1) + ". elemanýný giriniz: ");
                matrix[i][j] = scan.nextInt(); // input value assigned to matrix
            }
        }
        
        //loop for calculating transpose
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                transposeMatrix[j][i] = matrix[i][j];
            }
        }
        
        System.out.println("Girilen matrisin transpozu :");
        
        //loop for printing transpose matrix
        for (int[] element : transposeMatrix) {
            for (int value : element) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

	}

}
