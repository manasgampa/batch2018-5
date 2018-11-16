package net.antra1;

public class Child extends Parent{

	public int child_j=56;
	public int parent_i=49;
	
	public void m2() {
		System.out.println("in child m2");
		
	}
	
	@Override
	public void commonM3() {
		System.out.println("in child commonM3");
	}
}
