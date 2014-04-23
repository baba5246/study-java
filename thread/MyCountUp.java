import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class MyCountUp implements Runnable {

	private int count = 1;
	private	int millisecond = 0;
	private boolean isRunning = false;

	public MyCountUp(int millisecond) {
		this.millisecond = millisecond;
	}

	@Override
	public void run() {
		isRunning = true;
		while (isRunning) {
			System.out.println(count);
			count++;
			try {
				Thread.sleep(millisecond);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void stopRunning() {
		isRunning = false;
	}

	
	public static void main(String[] args) {

		// 入力ガイド
		System.out.println("カウントアップの間隔をミリ秒で入力してください。");

		// 入力受付＆チェック
		int millisecond = 0;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			millisecond = Integer.parseInt(reader.readLine());
		} catch (NumberFormatException e) {
			System.out.println("数値の形式が正しくありません。");
			return;
		} catch (IOException e) {
			System.out.println("入力読み込みで予期せぬエラーが発生しました。");
			return;
		}

		// エンターキーガイド
		System.out.println("エンターキーを押すとカウントアップを開始します。");
		System.out.println("もう一度押すとカウントアップを終了します。");

		// エンター受付＆カウントアップ実行
		MyCountUp myCountUp = new MyCountUp(millisecond);
		try {
			String line = reader.readLine();
			new Thread(myCountUp).start();
		} catch (IOException e) {
			System.out.println("入力読み込みで予期せぬエラーが発生しました。");
			return;
		}


		// エンター受付＆カウントアップ終了
		try {
			String line = reader.readLine();
			myCountUp.stopRunning();
			System.out.println("終了します。");
		} catch (IOException e) {
			System.out.println("入力読み込みで予期せぬエラーが発生しました。");
			return;
		}


	}

}