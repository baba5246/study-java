/*
 * 以下のプログラムを実行した結果、画面に
 * 「キャラクターは今2人」
 * 「キャラクターは今3人」
 * となるように、Userクラスを作成しなさい。
 */

public class Kadai_4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		User mikkey = new User("ミッキー");
		User minnie = new User("ミニー");
		
		System.out.println("キャラクターは今" + User.count + "人");
		
		User donald = new User("ドナルド");
		System.out.println("キャラクターは今" + User.count + "人");
		
	}

}
