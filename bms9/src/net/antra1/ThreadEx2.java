package net.antra1;

public class ThreadEx2 extends Thread{

	public void run() {
		/*for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread());
		System.out.println("in run method of ThreadEx2");
		}*/
		Emp emp=new Emp();
		emp.cal();
	}
	public static void main(String[] args) {
		
		ThreadEx2 tr1=new ThreadEx2();
		tr1.start();
		
	}
}
