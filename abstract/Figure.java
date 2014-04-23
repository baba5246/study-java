
public abstract class Figure {
	
	/********** ここは変更しちゃダメ **********/
	
	/** 図形の名前を取得します。 */
	public abstract String getName();
	/** 図形の面積を取得します。 */
	public abstract double getArea();
	
	public final void print() {
		System.out.println(getName() + ": 面積 = " + getArea());
	}
	
	/**************** ここまで ****************/
	
	public static Figure createRectangle(int h, int w) {
		return new Rectangle(h, w);
	}

	public static Figure createTriangle(int h, int b) {
		return new Triangle(h, b);
	}

	public static Figure createCircle(int r) {
		return new Circle(r);
	}
}
