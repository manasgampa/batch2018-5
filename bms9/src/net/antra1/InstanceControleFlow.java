package net.antra1;

public class InstanceControleFlow {

	{
		
		System.out.println("in instance block");
	}
	
	public InstanceControleFlow() {
		System.out.println("in instance controle flow");
	}
	
	static {
		System.out.println("in static block");
	}
	public static void main(String[] args) {
		InstanceControleFlow in=new InstanceControleFlow();
		
	}
}
