package MyJavaPrcatice.JavaStuff;

public class ClassThree {
	
// An example of using the interface as parameter and passing the diff class objects as arguments
	public static void main(String[] args) {
		ClassOne one = new ClassOne();
		ClassTwo two = new ClassTwo();
		ClassThree three = new ClassThree();
		three.go(one);
		three.go(two);
		
	}
	
	public void go(newInterface n) {
		n.cool();
		n.foo();
	}
	
}
