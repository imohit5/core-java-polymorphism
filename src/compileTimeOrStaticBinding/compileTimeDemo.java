package compileTimeOrStaticBinding;

//also called as method overloading
public class compileTimeDemo {

	void add(int a, int b) {
		int sum = a+b;
		System.out.println("sum"+sum);
	}
	
	void add(int a, int b, int c) {
		int sum = a+b+c;
		System.out.println("sum"+sum);
	}
	
	void add(float a, float b) {
		float sum = a+b;
		System.out.println("sum"+sum);
	}
	
	void add(float a, float b, float c) {
		float sum = a+b+c;
		System.out.println("sum"+sum);
	}
	
	public static void main(String[] args) {
		compileTimeDemo demo1 = new compileTimeDemo();
		demo1.add(2, 3);
		demo1.add(2, 3, 5);
		demo1.add(2.1F, 3.2F);
		demo1.add(2.1F, 3.2F, 5.3F);
	}

}
