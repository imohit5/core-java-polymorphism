package runTimeOrDynamicBinding;

public class Benz implements Car {

	@Override
	public void start() {
		System.out.println("start Benz");
	}

	@Override
	public void drive() {
		System.out.println("drive Benz");
	}

	@Override
	public void stop() {
		System.out.println("stop Benz");
	}

	public void lights() {
		System.out.println("lights Benz");
	}
	
}
