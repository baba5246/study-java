public class Parent {

	public int speed;

	public Parent() {
		
	}
	public Parent(int speed) {
		this.speed = speed;
	}

	public void walk() {
		System.out.println("親は" + speed + "で歩く");
	}
}