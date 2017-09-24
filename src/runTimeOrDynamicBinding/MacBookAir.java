package runTimeOrDynamicBinding;

public class MacBookAir extends MacBook {

	@Override
	void start() {
		System.out.println("start MacBookAir");
	}
	
	@Override
	void shutdown() {
		System.out.println("shutdown MacBookAir");
	}
	
}
