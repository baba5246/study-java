public class Circle extends Figure {

	private int r;

	@Override
	public String getName() {
		return "円";
	}

	@Override
	public double getArea() {
		return (double)r * r * Math.PI;
	}

	public Circle(int r) {
		this.r = r;
	}
}