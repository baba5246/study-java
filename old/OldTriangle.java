public class Triangle {

	// メンバ変数
	private int height = 0;
	private int doubleHeight = 0;

	/**
	 * コンストラクタ
	 * @param height Triangleの…高さ？（横の最大値）
	 */
	public Triangle(int height) {
		this.height = height;
		this.doubleHeight = height*2;
	}

	/** 
	 * Triangleを出力する
	 */
	public void showTriangle() {

		for (int i = 0; i <= doubleHeight; i++) {

			// *を出力する個数を計算
			int max = 0;
			if (i <= height) max = i;
			else max = doubleHeight-i;
			
			for (int j = 0; j < max; j++) System.out.print("*");
			System.out.println(" ");
		}
	}


	// main 関数
	public static void main(String[] args) {

		System.out.println("---- 実行結果 ----");

		Triangle tri = new Triangle(10);
		tri.showTriangle();

		System.out.println("----");

	}


}