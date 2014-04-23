/**
 * じゃんけんしましょう（シンプル版1）
 * @author a13553
 */
public class Janken_v1{

	/**
	 * じゃんけんをする
	 */
	public static void doJanken() {

		// 入力待ち＆読み込み
		String error = "1〜3で入力してください！";
		int userInput = Util.readValidIntegerInput("", error, error, 1, 3);
		if (userInput < 0) return;
		
		// コンピュータの手を計算
		int computerInput = (int)(Math.random()*3)+1;

		// Hand列挙体作成
		Janken.Hand user = Janken.Hand.parseFromValue(userInput);
		Janken.Hand computer = Janken.Hand.parseFromValue(computerInput);
		if (user == null || computer == null) return;
		
		// 出した手を出力
		System.out.println("ぽん！");
		System.out.println("あなた：" + user + "、コンピュータ：" + computer);
		
		// 結果判定
		System.out.println(user.judgeString(computer, 1));

	}

	// main 関数
	public static void main(String[] args) {

		// あいのて
		System.out.println("じゃんけんをしましょう！");
		System.out.println("1: グー、2: チョキ、3:パー です。");
		System.out.println("じゃーんけーん・・");
		System.out.print("出す手を入力 => ");

		// じゃんけん実行
		doJanken();
	}

}