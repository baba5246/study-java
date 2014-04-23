
/**
 * Mottledクラス
 */
public class Mottled {

	// メンバ変数
	private int width = 1;
	private int height = 1;
	private Diamond dia;
	private boolean[][] mottledMap;

	/**
	 * コンストラクタ
	 * @param height Mottledの幅
	 */
	public Mottled(int diaSize, int sideY, int sideX) throws Exception{

		// Diamond作成
		try {
			dia = new Diamond(diaSize);
		} catch (Exception e) {
			throw e;
		}

		// 幅・高さを保存
		this.width = diaSize*sideX;
		this.height = diaSize*sideY;

		// まだら配列を作成
		createMottledDiamond(diaSize);
	}

	/**
	 * ダイヤ配列を結合する
	 */
	public void createMottledDiamond(int diaSize) {

		mottledMap = new boolean[height][width];

		for (int y = 0; y < height; y++) {
			for (int x = 0; x < width; x++) {
				int tempY = y % diaSize;
				int tempX = x % diaSize;
				mottledMap[y][x] = dia.getDiaValue(tempY, tempX);
			}
		}
	}

	/**
	 * まだらダイヤを出力する
	 */
	public void showMottledDiamond() {

		for (int y = 0; y < height; y++) {
			for (int x = 0; x < width; x++) {
				if (mottledMap[y][x] == true) System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println("");
		}
	}

	// main 関数
	public static void main(String[] args) {

		System.out.println("---- 実行結果 ----\n");

		// 作成
		Mottled mottled;
		try {
			mottled = new Mottled(7, 0, 7);
			mottled.showMottledDiamond();
		} catch (Exception e) {
			e.printStackTrace();
			return;
		}

		System.out.println("\n----");

	}


}