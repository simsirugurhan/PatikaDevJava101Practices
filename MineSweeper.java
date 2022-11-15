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
			System.out.println("Mayýnlarýn Konumu");
			plantedMine();
			System.out.println("Mayýn Tarlasý Oyununa Hoþgeldiniz");

			while (move > 0) {
				int mineCounter = 0;

				System.out.println("===========================");
				System.out.println("Kalan Hamle Hakkýnýz : " + move);
				printMap();

				System.out.print("Satýr Giriniz : ");
				int row = scan.nextInt();

				System.out.print("Sütun Giriniz : ");
				int col = scan.nextInt();

				if ((row < 0 || row >= rowNumber) || (col < 0 || col >= columnNumber)) {
					System.out.println("Hatalý Giriþ Yaptýnýz, Lütfen doðru index numarasý giriniz !");
					continue;
				} else {
					if (this.mineMap[row][col] == "*") {
						System.out.println("Game Over!!");
						printMineMap();
						break;
					}
					if (!this.gameMap[row][col].equals("-")) {
						System.out.println("Bu hamleyi zaten yaptýnýz !");
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
			System.out.println("Oyunu Kazandýnýz  !");
			printMap();
		}
	}

	public static void main(String[] args) {
		// Java dilinde Mayýn Tarlasý oyunu yapmanýzý bekliyoruz.

		// Oyun Kurallarý :
		// Oyun metin tabanlýdýr.
		// Çift boyutlu diziler üzerinden oynanmalý ve MineSweeper sýnýfý içerisinde
		// tasarlanmalý.
		// Matris boyutunu yani satýr ve sütun sayýsýný kullanýcý belirlemeli.
		// Diziye ait eleman sayýsýnýn çeyreði (elemanSayisi / 4) kadar rastgele mayýn
		// yerleþtirilmeli. Örneðin dizi 4x3 boyutunda ise eleman sayýsý (satýrSayýsý *
		// sütunSayýsý) formülü ile hesaplanmalý ve boyutu 12 olmalý. Bu durumda mayýn
		// sayýsý 12 / 4 = 3 adet olmalýdýr. (ipucu : bu mayýnlarýn konumlarýný tutacak
		// ikinci bir dizi oluþturabilirsiniz.)
		// Kullanýcý matris üzerinden bir nokta seçmeli. Nokta seçimi için satýr ve
		// sütun deðerlerini girmeli.
		// Seçilen noktanýn dizinin sýnýrlarý içerisinde olup olmadýðýný kontrol
		// edilmeli ve koþul saðlanmazsa tekrar nokta istenmeli.
		// Kullanýcýnýn girdiði noktada mayýn var ise oyunu kaybetmeli.
		// Mayýn yok ise, ilgili noktaya deðen tüm konumlarýna bakýlmalý (saðý, solu,
		// yukarýsý, aþaðýsý, sol üst çapraz, sað üst çapraz, sað alt çapraz, sol alt
		// çapraz) ve etrafýndaki mayýnlarýn sayýsýnýn toplamý ilgili noktaya yazýlmalý.
		// Noktaya deðen herhangi bir mayýn yok ise "0" deðeri atanmalý.
		// Kullanýcý hiç bir mayýna basmadan tüm noktalarý seçebilirse oyunu kazanmalý.

		MineSweeper mineSweeper = new MineSweeper(3, 3);
		mineSweeper.run();
	}

}
