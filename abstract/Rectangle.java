public class Rectangle extends Figure {

	private int h, w;

	@Override
	public String getName() {
		return "長方形";
	}

	@Override
	public double getArea() {
		return h * w;
	}

	public Rectangle(int h, int w) {
		this.h = h;
		this.w = w;
	}
}