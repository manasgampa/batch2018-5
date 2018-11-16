package net.antra1;

public class StaticControlFlow {

	static int i=45;
	static {
		System.out.println("in static block one");
		System.out.println(i);
	}
	
	public static void main(String[] args) {

		System.out.println("in main method");
		m1();
	}

	public static void m1() {
		
		System.out.println("in m1 method");
		System.out.println(j);
	}
	
	static {
		System.out.println("in static block two");
	}
	static int j=56;
}
