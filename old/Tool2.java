public class Tool2 {


	public static int addInt(int a, int b) {
		return a+b;
	}

	public static int showParam(String param) {
		System.out.println(param);
		return 0;
	}

	public static void showParamNumTimes(String param, int num) {
		for (int i = 0; i < num; i++) {
			System.out.print(param);
		}
		System.out.println("");
	}

	public static void showHelloWorld() {
		System.out.println("HelloWorld!");
	}

	public static String showDoubleParam(double param) {
		return "" + param;
	}

	public static double divide(double denom, double number) {
		return denom / number;
	}

	public static String getMyName() {
		return "baba";
	}

	public static boolean parseBoolean(int i) {
		return i == 0 ? true : false;
	}

	public static double computeArea(double height, double width) {
		return height * width;
	}

	public static double computeTriArea(double height, double bottom) {
		return computeArea(height, bottom) / 2;
	}

	public static String combineChars(char first, char second) {
		return String.valueOf(first) + String.valueOf(second);
	}

	public static int numberFromInt(int i) {
		return (i < 300 ? 5 : (i < 1000 ? 15: (i < 5000 ? 30 : 50)));
	}

	public static boolean isUruDoshi(int year) {
		return (year % 4 == 0 && (year % 400 == 0 || year % 100 != 0));
	}

}