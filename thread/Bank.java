
public class Bank {

	private int value = 0;

	public synchronized void addMoney(int money) {
		int current = value;
		System.out.println(Thread.currentThread() + "がaddMoneyに入りました");
		value += money;
		
		if (current + money != value) {
			System.out.println(Thread.currentThread() + "で矛盾が発生しました");
			System.exit(-1);
		}
		System.out.println(Thread.currentThread() + "がaddMoneyから出ました");
	}

	public synchronized void test() {
		System.out.println(Thread.currentThread() + "がtestを実行しました");
	}
}