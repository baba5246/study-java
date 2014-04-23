public class Triangle extends Figure {

	private int h, b;

	@Override
	public String getName() {
		return "三角形";
	}

	@Override
	public double getArea() {
		return (double)h * b * 0.5;
	}

	public Triangle(int h, int b) {
		this.h = h;
		this.b = b;
	}
}