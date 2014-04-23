public class Child extends Parent {

	public Child(final int speed) {
		this.speed = speed;
	}

	public void walk() {
		System.out.println("子は" + speed + "で歩く");
	}
}