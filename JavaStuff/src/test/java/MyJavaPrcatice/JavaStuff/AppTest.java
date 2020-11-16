package MyJavaPrcatice.JavaStuff;

import AccessModifiers.Protectedclass;

/**
 * Unit test for simple App.
 */
public class AppTest extends Protectedclass {
	
	public static void main(String[] args) {
//		Parent parent = new Child();
//		parent.parentMethod();
//		
//		Child child = new Child();
//		child.foo();
//		Child.staticMethod();
//		
//		Parent.staticMethod();
//		
//		Parent.demoParent();
//		Child.demoParent();
//		
//		Protectedclass protectedclass = new Protectedclass();
//		AppTest a = new AppTest() ;
//		a.proMethod1();
//		
//		
//		Parent p = new Parent();
//		System.out.println(parent.x);
//		main2(child);
//		main2(p);
		
		FirstOne f = new SecondOne();
		System.out.println(f.word); //parent
		
		SecondOne s = new SecondOne();
		System.out.println(s.word);//second
				
	}
	
	public static void main2(newInterface m) {
		m.cool();
		m.foo();
	}
	
}