package GFG;

// A tricky Java code to predict the output
// based on order of 
// execution of constructors, static 
// and initialization blocks 
class MyTest { 
	static
	{ 
		initialize(); 
	} 
	static class AStaticClass{
		void run(){
			System.out.println("Inner Class ");
		}
	}
	private static int sum;
	
	public static int getSum() 
	{ 
		initialize(); 
		return sum; 
	} 

	private static boolean initialized = false; 
	private static String str = "Vishnu";

	private static void initialize() 
	{ 
		if (!initialized) { 
			for (int i = 0; i < 100; i++) 
				sum += i; 
			initialized = true; 
		} 
	} 
}
interface A{
	default void m1(){
		System.out.println("Interface M1");
	}
}
interface B{
	default void m1(){
		System.out.println("Interface M1");
	}
}
abstract class Animal {
	static {
		System.out.println("Animal Static block ");
	}
	{
		System.out.println("Animal instance block");
	}

	public void sound(){
		System.out.println("Animal Called");
	}
	public abstract void color();

}
class Dog extends Animal implements  B{
	{
		System.out.println("Dog instance block");
	}
	static {

		System.out.println("Dog Static block ");
	}


	public void color(){}

	public void Type() {
		System.out.println("Bho Bho !!..");

	}


}




public class GFG { 
	public static void main(String[] args) 
	{

		B a = new Dog();
		a.m1();
		//a.sound();
//		System.out.println(MyTest.getSum());
//		MyTest.AStaticClass t = new MyTest.AStaticClass();
//		t.run();
	}
} 
