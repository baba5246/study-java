public class Tool2Test {

	public static void main(String[] args) {

		console("1) " + Tool2.addInt(1, 2));
		console("2) " + Tool2.showParam("param"));
		print("3) ");
		Tool2.showParamNumTimes("param", 2);
		print("4) ");
		Tool2.showHelloWorld();
		console("5) " + Tool2.showDoubleParam(0.1635436));
		console("6) " + Tool2.divide(10, 0.5));
		console("7) " + Tool2.getMyName());
		console("8) " + Tool2.parseBoolean(0));
		console("9) " + Tool2.computeArea(10, 65));
		console("10) " + Tool2.computeTriArea(10, 65));
		console("11) " + Tool2.combineChars('c', 'a'));
		console("12) " + Tool2.numberFromInt(3456));
		console("13) " + Tool2.isUruDoshi(3456));

	}

	private static void console(String s) {
		System.out.println(s);
	}
	private static void print(String s) {
		System.out.print(s);
	}
}