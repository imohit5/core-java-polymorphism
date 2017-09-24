package runTimeOrDynamicBinding;

public class Audi implements Car {

	@Override
	public void start() {
		System.out.println("start Audi");
	}

	@Override
	public void drive() {
		System.out.println("drive Audi");
	}

	@Override
	public void stop() {
		System.out.println("stop Audi");
	}

	public void brake() {
		System.out.println("brake Audi");
	}
	
	
}
