
/**
 * Diamondクラス
 */
public class Diamond {

	// メンバ変数
	private int height = 13;
	private boolean[][] diaMap;

	/**
	 * コンストラクタ
	 * @param height Diamondの幅
	 */
	public Diamond(int height) throws Exception {

		// 例外処理
		if (height<0 || height%2==0) throw new Exception("正の奇数を入力してください。");
		// 高さを保存
		this.height = height;
		// ダイヤ配列を作成
		createDiamond();
	}

	/** 
	 * ダイヤ配列を作成する
	 */
	public void createDiamond() {

		diaMap = new boolean[height][height];

		for (int y = 0; y < height; y++) {
			int asterisk = computeAsteriskNum(y);
			int space = (height - asterisk) / 2;
			for (int x = 0; x < height; x++) {
				if (x >= space && x < space+asterisk) diaMap[y][x] = true;
				else diaMap[y][x] = false;
			}
		}
		
	}

	/**
	 * その行に出力するアスタリスクの数を計算する
	 * @param index 行番号
	 */
	private int computeAsteriskNum(int index) {
		int num = 0;
		if (index <= height/2) num = 2 * index + 1;
		else num = 2 * height - (2 * index + 1);
		return num;
	}

	/**
	 * ダイヤモンドを標準出力する
	 */
	public void showDiamond() {
		for (int y = 0; y < height; y++) {
			for (int x = 0; x < height; x++) {
				if (diaMap[y][x] == true) System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println("");
		}
	}

	/**
	 * ダイヤ配列の指定した場所の値を取り出す
	 * @param y 行番号
	 * @param x 列番号
	 */
	public boolean getDiaValue(int y, int x) {
		return diaMap[y][x];
	}

	// main 関数
	public static void main(String[] args) {

		System.out.println("---- 実行結果 ----\n");

		// 作成
		Diamond dia;
		try {
			dia = new Diamond(7);
			dia.showDiamond();
		} catch (Exception e) {
			e.printStackTrace();
			return;
		}

		System.out.println("\n----");

	}


}