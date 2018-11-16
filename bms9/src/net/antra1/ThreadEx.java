package net.antra1;

public class ThreadEx implements Runnable {
	
	public void run() {
		/*for(int i=0;i<10;i++) {
		System.out.println(Thread.currentThread());
		System.out.println("in thread of ThreadEx");
		}*/
		Emp emp=new Emp();
		emp.cal();
	}
	
	public static void main(String[] args) {
		
		ThreadEx tr1=new ThreadEx();
		Thread th1=new Thread(tr1);
		th1.setName("manas");
		th1.start();
		th1.setPriority(Thread.MAX_PRIORITY);//max=10,min=1,norm=5
		ThreadEx2 th2=new ThreadEx2();
		th2.setName("kumar");
		th2.start();
	}

}
