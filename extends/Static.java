public class Static {
	public static void main(String[] args) {
		SubA subA = new SubA();
		A a = subA;

		System.out.println(subA.field); // SubA
		System.out.println(a.field); // A ← SubAになってほしい
	}
}

class A {
	public String field = "A";
}
class SubA extends A {
	public String field = "SubA";
}