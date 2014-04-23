
public class Test {

	public static void main(String[] args) {

		int speed = 20;
		Parent p = new Parent(speed);
		Child c = new Child(speed);

		p.walk();
		c.walk();
	}

}