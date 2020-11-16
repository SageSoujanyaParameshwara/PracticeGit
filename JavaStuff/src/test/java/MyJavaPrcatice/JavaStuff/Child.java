package MyJavaPrcatice.JavaStuff;

public class Child extends Parent implements newInterface{
	
	String x = "I'm a child";
	
	@Override
	public void parentMethod() {
		super.parentMethod();
		System.out.println("I'm a child method");
		System.out.println(x);
		System.out.println(super.x);
	}

	public void foo() {
		System.out.println("This is foo from Interface and child class");
		System.out.println("A static variable from interface: "+newInterface.name);
		
	}

	public void cool() {
		System.out.println("This is cool from Interface and child class");
		
	}
	
	public static void staticMethod() {
		final String X="i'm child static variable";
		System.out.println(X);
		System.out.println("i'm child's static method");
	}
	
	public static void demoParent() {
		System.out.println("demo parent froom child class");
	}
	
}
