package net.antra2;


public interface I1{

	public void m1(int i,int j,String str);
	
	
	public default void m2() {
		System.out.println("hi in default method of I1");
	}
	
	public static int m3() {
		System.out.println("in m3 mehod of static");
		return 3;
	}
	
}
