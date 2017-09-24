package runTimeOrDynamicBinding;

public class MacBookPro extends MacBook {

	@Override
	void start() {
		System.out.println("start MacBookPro");
	}
	
	@Override
	void shutdown() {
		System.out.println("shutdown MacBookPro");
	}
	
}
