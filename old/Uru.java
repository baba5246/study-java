import java.io.*;

/**
 * うるう年をチェックするクラス
 * @author a13553
 */
public class Uru {

	/** main関数 */
	public static void main(String[] args) {

		// あいのて
		println("うるう年をチェックする年を入力してください。(0以上"+Long.MAX_VALUE+"以下)");

		// 入力チェック
		long uru = 0;
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String line = reader.readLine();
			uru = Long.parseLong(line);
		} catch (NumberFormatException e) {
			println("数字の形式が正しくありません。");
			return;
		} catch (Exception e) {
			println("入力読み込みで予期せぬエラーが発生しました。");
			return;
		}
		if (uru < 0) {
			println("自然数を入力してください。");
			return;
		}

		// うるう年判定
		boolean isUru = false;
		if (uru % 400 == 0) {
			isUru = true;
		} else if (uru % 100 == 0) {
			isUru = false;
		} else if (uru % 4 == 0) {
			isUru = true;
		}

		// 出力
		if (isUru == true) println(uru + "年はうるう年です。");
		else println(uru + "年はうるう年ではありません。");

	}

	/**
	 * 
	 */
	private static void println(String s) {
		System.out.println(s);
	}
}