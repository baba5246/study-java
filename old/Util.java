import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 * よく使うメソッドを格納するクラス
 */
public class Util {

	private static final int ERROR_INT = Integer.MIN_VALUE;

	/**
	 * 数値入力受付 ＆ 入力が数値かチェック ＆ 入力が範囲内かチェック
	 * @param guide 最初の案内文
	 * @param errorOfString 入力が文字列だったときのエラー文
	 * @param errorOfOutLimit 範囲外だったときのエラー文
	 * @param lowerBound 範囲の下限
	 * @param upperBound 範囲の上限
	 * @return 数値（エラーの場合は-MAX_INT）
	 */
	public static int readValidIntegerInput(String guide, String errorOfString, String errorOfOutLimit, 
											int lowerBound, int upperBound) 
	{
		if (guide.length()>0) System.out.println(guide);
		int result = ERROR_INT;

		// 入力受付
		BufferedReader stdReader = new BufferedReader(new InputStreamReader(System.in));
		try {

			// 読み込み
			String line = stdReader.readLine();
			result = Integer.parseInt(line);

			// 範囲チェック
			if (result < lowerBound || result > upperBound) {
				if (errorOfOutLimit.length()>0) System.out.println(errorOfOutLimit);
				result = ERROR_INT;
			}

		} catch (NumberFormatException e) { // 数値にできなかったエラー
			if (errorOfString.length()>0) System.out.println(errorOfString);
			result = ERROR_INT;
		} catch (IOException e) { // 入力エラー
			System.out.println("入力読み込みで予期しないエラーが発生しました。");
			result = ERROR_INT;
		}

		return result;
	}
}