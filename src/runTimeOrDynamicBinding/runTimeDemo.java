package runTimeOrDynamicBinding;

public class runTimeDemo {

	public static void main(String[] args) {

		MacBook demo1 = new MacBookAir();
		demo1.start();
		demo1.shutdown();
		
		MacBook demo2 = new MacBookPro();
		demo2.start();
		demo2.shutdown();
		
	}

}
