package MyJavaPrcatice.JavaStuff;

public class Parent implements newInterface {
	
	String x ="i'm a parent";
	
	public void parentMethod() {
		System.out.println("I'm a parent method");
		System.out.println(x);
	}
	
	public static void staticMethod() {
		System.out.println("I'm parent static method");
	}
	
	public static void demoParent() {
		System.out.println("demo parent froom pArent class");
	}

	public void foo() {
		// TODO Auto-generated method stub
		System.out.println("Foo from parent class");
	}

	public void cool() {
		// TODO Auto-generated method stub
		System.out.println("Cool from pareant class");
	}

}
