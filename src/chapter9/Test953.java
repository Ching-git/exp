package chapter9;

class X {
	Y b = new Y();
	
	X(){
		System.out.println("X");
	}
}

class Y {
	Y() {
		System.out.println("Y");
	}
}

public class Test953 extends X{

	Y y = new Y();
	
	public Test953() {
		System.out.println("Z");
	}
	
	public static void main(String[] args) {
		new Test953();
	}
}
