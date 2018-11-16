package net.antra1;

public class Test {
	
	public static void main(String[] args) {
		
		System.out.println("in main method before do stuff method");
		doStuff();
		System.out.println("in main method after do stuff method");
	}
	public static void doStuff() {
		
		try {
		System.out.println("in do stuff before domorestuff method");
		doMoreStuff();
		
		}catch(Exception e) {
			
		}
		System.out.println("in do stuff after do more stuff method");
	}
	public static void doMoreStuff() {
		
		System.out.println(10/0);
		
		System.out.println("in domore stuff");
		
	}

}
