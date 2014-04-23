
/*
 * 実行結果が
 * 
 * 長方形: 面積 = 200.0
 * 三角形: 面積 = 112.5
 * 円: 面積 = 314.1592653589793
 * 
 * となるように、クラスやメソッドなどを実装してください。
 */
public class Main {

	public static void main(String[] args) {
		Figure[] fig = {
				Figure.createRectangle(10, 20),
				Figure.createTriangle(15, 15),
				Figure.createCircle(10),
		};
		
		for (int i = 0; i < fig.length; i++) {
			fig[i].print();
		}
	}

}
