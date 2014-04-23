/*
 * 以下のプログラムを実行した結果、画面に
 *
 * 「キーワードが違うよ」
 * 「箱の中には空想科学読本が1つある」
 * 「箱の中にはチョコビが5つある」
 * 「キーワードが違うよ」
 * となるように、Boxクラスを作成しなさい。
 *
 */

public class Kadai_5 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Box box1 = new Box("チョコビ", 5);
		Box box2 = new Box("空想科学読本", 1);
		
		Box.key = new String("ひらけごま");
		Box.look(box1, "ヒラケゴマ");
		Box.look(box2, "ひらけごま");
		
		Box.key = new String("チチンプイプイ");
		Box.look(box1, "チチンプイプイ");
		Box.look(box2, "ちちんぷいぷい");
	}

}
