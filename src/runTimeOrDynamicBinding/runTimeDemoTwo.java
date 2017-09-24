package runTimeOrDynamicBinding;

public class runTimeDemoTwo {

	public static void main(String[] args) {

		Car demo1 = new Audi();
		demo1.start();
		demo1.drive();
		demo1.stop();
		
		Car demo2 = new Benz();
		demo2.start();
		demo2.drive();
		demo2.stop();
		
		Audi demo3 = (Audi) demo1;
		demo3.brake();
		
		Benz demo4 = (Benz) demo2;
		demo4.lights();
		
	}

}
