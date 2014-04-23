public abstract class Player extends Base {

	public abstract void play();

	public void start() {
		System.out.println("再生します。");
		play();
		System.out.println("終了します。");
	}
}
