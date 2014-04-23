/*
 * 上巻P.218のList9-5と実行結果が同じになるように
 * Testクラスを作成しなさい。
 */

public class Kadai_3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] ten = {63, 90, 75, 45, 81};
		String[] kyouka = {"国語", "数学", "英語", "理科", "社会"};
		int sum = 0;
		Test[] test = new Test[ten.length];
		
		for (int i = 0; i < test.length; i++) {
			test[i] = new Test(kyouka[i], ten[i]);
			
			sum += ten[i];
		}
		
		for (int i = 0; i < test.length; i++) {
			test[i].print();
		}
		double heikin = (double)sum/ten.length;
		System.out.println("平均点は" + heikin + "点");
	}

}
