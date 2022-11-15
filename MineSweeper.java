package averageNotes;

import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
	int rowNumber;
	int columnNumber;
	String[][] mineMap;
	String[][] gameMap;
	int mineNumber;

	MineSweeper(int rowNumber, int columnNumber) {
		this.rowNumber = rowNumber;
		this.columnNumber = columnNumber;
		this.mineMap = new String[rowNumber][columnNumber];
		this.gameMap = new String[rowNumber][columnNumber];
		this.mineNumber = (rowNumber * columnNumber) / 4;
	}

	void printMap() {
		for (int i = 0; i < rowNumber; i++) {
			for (int j = 0; j < columnNumber; j++) {
				System.out.print(this.gameMap[i][j] + " ");
			}
			System.out.println();
		}
	}

	void gameMap() {
		for (int i = 0; i < rowNumber; i++) {
			for (int j = 0; j < columnNumber; j++) {
				this.gameMap[i][j] = "-";
			}
		}
	}

	public void plantedMine() {
		Random rand = new Random();
		for (int i = 0; i < mineNumber; i++) {
			int randomRow = rand.nextInt(rowNumber);
			int randomColumn = rand.nextInt(columnNumber);

			if (this.mineMap[randomRow][randomColumn] != "*") {
				this.mineMap[randomRow][randomColumn] = "*";
			} else {
				i--;
			}
		}

		for (int i = 0; i < rowNumber; i++) {
			for (int j = 0; j < columnNumber; j++) {
				if (this.mineMap[i][j] != "*") {
					this.mineMap[i][j] = "-";
				}
				System.out.print(this.mineMap[i][j] + " ");
			}
			System.out.println();
		}
	}

	void printMineMap() {
		for (int i = 0; i < rowNumber; i++) {
			for (int j = 0; j < columnNumber; j++) {
				System.out.print(this.mineMap[i][j] + " ");
			}
			System.out.println();
		}
	}

	void run() {
		int move = (rowNumber * columnNumber) - mineNumber;
		try (Scanner scan = new Scanner(System.in)) {
			gameMap();
			System.out.println("May�nlar�n Konumu");
			plantedMine();
			System.out.println("May�n Tarlas� Oyununa Ho�geldiniz");

			while (move > 0) {
				int mineCounter = 0;

				System.out.println("===========================");
				System.out.println("Kalan Hamle Hakk�n�z : " + move);
				printMap();

				System.out.print("Sat�r Giriniz : ");
				int row = scan.nextInt();

				System.out.print("S�tun Giriniz : ");
				int col = scan.nextInt();

				if ((row < 0 || row >= rowNumber) || (col < 0 || col >= columnNumber)) {
					System.out.println("Hatal� Giri� Yapt�n�z, L�tfen do�ru index numaras� giriniz !");
					continue;
				} else {
					if (this.mineMap[row][col] == "*") {
						System.out.println("Game Over!!");
						printMineMap();
						break;
					}
					if (!this.gameMap[row][col].equals("-")) {
						System.out.println("Bu hamleyi zaten yapt�n�z !");
						continue;
					} else {
						int minusRow = (row - 1), plusRow = (row + 1);
						int minusCol = (col - 1), plusCol = (col + 1);

						if ((minusRow < 0) || (minusCol < 0)) {
							minusRow = 0;
							minusCol = 0;
						}
						if ((plusRow >= rowNumber) || (plusCol >= columnNumber)) {
							plusRow = row;
							plusCol = col;
						}
						for (int i = minusRow; i <= plusRow; i++) {
							for (int j = minusCol; j <= plusCol; j++) {
								if (this.mineMap[i][j] == "*") {
									mineCounter++;
								}
							}
						}
						String convertMineCounter = String.valueOf(mineCounter);
						this.gameMap[row][col] = convertMineCounter;
						move--;
					}
				}
			}
		}

		if (move == 0) {
			System.out.println("Oyunu Kazand�n�z  !");
			printMap();
		}
	}

	public static void main(String[] args) {
		// Java dilinde May�n Tarlas� oyunu yapman�z� bekliyoruz.

		// Oyun Kurallar� :
		// Oyun metin tabanl�d�r.
		// �ift boyutlu diziler �zerinden oynanmal� ve MineSweeper s�n�f� i�erisinde
		// tasarlanmal�.
		// Matris boyutunu yani sat�r ve s�tun say�s�n� kullan�c� belirlemeli.
		// Diziye ait eleman say�s�n�n �eyre�i (elemanSayisi / 4) kadar rastgele may�n
		// yerle�tirilmeli. �rne�in dizi 4x3 boyutunda ise eleman say�s� (sat�rSay�s� *
		// s�tunSay�s�) form�l� ile hesaplanmal� ve boyutu 12 olmal�. Bu durumda may�n
		// say�s� 12 / 4 = 3 adet olmal�d�r. (ipucu : bu may�nlar�n konumlar�n� tutacak
		// ikinci bir dizi olu�turabilirsiniz.)
		// Kullan�c� matris �zerinden bir nokta se�meli. Nokta se�imi i�in sat�r ve
		// s�tun de�erlerini girmeli.
		// Se�ilen noktan�n dizinin s�n�rlar� i�erisinde olup olmad���n� kontrol
		// edilmeli ve ko�ul sa�lanmazsa tekrar nokta istenmeli.
		// Kullan�c�n�n girdi�i noktada may�n var ise oyunu kaybetmeli.
		// May�n yok ise, ilgili noktaya de�en t�m konumlar�na bak�lmal� (sa��, solu,
		// yukar�s�, a�a��s�, sol �st �apraz, sa� �st �apraz, sa� alt �apraz, sol alt
		// �apraz) ve etraf�ndaki may�nlar�n say�s�n�n toplam� ilgili noktaya yaz�lmal�.
		// Noktaya de�en herhangi bir may�n yok ise "0" de�eri atanmal�.
		// Kullan�c� hi� bir may�na basmadan t�m noktalar� se�ebilirse oyunu kazanmal�.

		MineSweeper mineSweeper = new MineSweeper(3, 3);
		mineSweeper.run();
	}

}
