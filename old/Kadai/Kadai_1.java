/*
 * 以下のプログラムを実行した結果、画面に
 * 「今チョコビが5つ見える」
 * 「わたしからは空想科学読本が1つ見える」
 * となるように、Boxクラスを作成しなさい(出力に「」は必要ありません)。
 */

public class Kadai_1 {

	/**
	 * プログラムのエントリポイントです。
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Box box1 = new Box();
		box1.item = "チョコビ";
		box1.num = 5;
		
		Box box2 = new Box();
		box2.item = "空想科学読本";
		box2.num = 1;
		
		box1.look("今");
		box2.look("わたしからは");
	}

}