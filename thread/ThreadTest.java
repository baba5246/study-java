public class ThreadTest {

	public static void main(String[] args) {
		
		final Bank tempbank = new Bank();
		
		new Thread(new Runnable(){ 
			@Override
			public void run() {
				tempbank.addMoney(100);
			} 
		 }).start();

		new Thread(new Runnable(){ 
			@Override
			public void run() {
				tempbank.test();
			} 
		 }).start();
	}

}