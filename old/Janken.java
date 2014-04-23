/**
 * じゃんけんをするクラス
 */
public class Janken{

	/**
	 * じゃんけんの手を表す列挙体
	 */
	public enum Hand {
		
		GU("グー", 1), CHOKI("チョキ", 2), PA("パー", 3);

		private final String name;
		private final int value;

		// コンストラクタ
		private Hand(String name, int value) {
			this.name = name;
			this.value = value;
		}

		/**
		 * 数値からHand型へparseする
		 * @param value 数値
		 */
		public static Hand parseFromValue(int value) {
			switch(value) {
				case 1:
					return Hand.GU;
				case 2:
					return Hand.CHOKI;
				case 3:
					return Hand.PA;
			}
			return null;
		}

		/** 
		 * 勝敗判断
		 * @param computerHand コンピュータの手のHand列挙体
		 * @param version あいこの表記がかわる（1なら「あいこでした！」、それ以外なら「あーいこーで・・」）
		 */
		public String judgeString(Hand computerHand, int version) {
			int user = this.value;
			int computer = computerHand.value;
			switch (user-computer) {
				case 0:
					return version == 1 ? "あいこでした！" : "あーいこーで・・";
				case 2:
				case -1:
					return "あなたの勝ちです！";
				case 1:
				case -2:
					return "あなたの負けです！";
			}
			return "判断不可能！";
		}

		/** 
		 * 勝敗判断
		 * @param computerHand コンピュータの手のHand列挙体
		 */
		public int judge(Hand computerHand) {
			int user = this.value;
			int computer = computerHand.value;
			switch (user-computer) {
				case 0:
					return 0;
				case 2:
				case -1:
					return 1;
				case 1:
				case -2:
					return -1;
			}
			return -2;
		}

		@Override
		public String toString() {
			return this.name;
		}
	}

	/** じゃんけん実行 */
	private static void doJanken() {

		// isAikoでループ判断
		int count = 1;
		boolean isAiko = true;
		while (isAiko) {

			// あいのて
			System.out.print("出す手を入力 => ");

			// 入力待ち＆読み込み
			int userInput = Util.readValidIntegerInput("", "", "", 1, 3);
			if (userInput < 0) continue;
		
			// コンピュータの手を計算
			int computerInput = (int)(Math.random()*3)+1;

			// Hand列挙体作成
			Hand user = Hand.parseFromValue(userInput);
			Hand computer = Hand.parseFromValue(computerInput);
			if (user == null || computer == null) return;
		
			// 出した手を出力
			if (count < 2) System.out.println("ぽん！");
			else System.out.println("しょ！");
			System.out.println("あなた：" + user + "、コンピュータ：" + computer);
		
			// 結果判定
			System.out.println(user.judgeString(computer, 2));
			isAiko = (user.judge(computer)==0);
			count++;
		}
	}



	/** main関数 */
	public static void main(String[] args) {

		// あいのて
		System.out.println("じゃんけんをしましょう！");
		System.out.println("1: グー、2: チョキ、3:パー です。");
		System.out.println("じゃーんけーん・・");

		// じゃんけん実行
		doJanken();
	}

}