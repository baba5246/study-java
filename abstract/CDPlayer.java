public class CDPlayer extends Player implements Interface1, Interface2 {

	@Override
	public void play() {
		System.out.println("再生中です。");
	}

	public static void main(String[] args) {

		CDPlayer cd = new CDPlayer();
		cd.start();
		cd.method("s");
	}

	@Override
	public String method(String s, int a) {
		System.out.println("interface1：" + INT_VAL1 + ", interface2：" + INT_VAL2);
		return s;
	}

	@Override
	public void method(String s) {
		System.out.println("interface1：" + INT_VAL1 + ", interface2：" + INT_VAL2);		
	}
}

interface Interface1 {
	// フィールド
	int INT_VAL1 = 10;
	// 抽象メソッド
	String method(String s, int a);
}
interface Interface2 {
	// フィールド
	int INT_VAL2 = 100;
	// 抽象メソッド
	void method(String s);
}