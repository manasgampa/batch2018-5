package net.antra1;

public class Emp {

	private int id;

	private String name;
	public int sal = 56;

	public Emp() {
		// System.out.println("in constructor");
	}

	public Emp(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {

		return id;
	}
	
	public boolean equals(Object obj) {
		
		String name1=this.name;
		int id1=this.id;
		
		Emp emp=(Emp)obj;
		
		String name2=emp.name;
		int id2=emp.id;
		if(id1==id2 && name1.equals(name2)) {
			return true;
		}else {
			return false;
		}
		
	}
	public synchronized int cal() {
		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread());
			System.out.println("in cal method"+i);
		}
	return 0;
	}
	/*public String toString() {

		return getClass().getName() + "@" + Integer.toHexString(hashCode());
	}

	public int hashCode() {
		
		return 1233;
	}*/
}
