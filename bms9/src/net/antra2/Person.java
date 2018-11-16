package net.antra2;

public class Person implements I1{
	private String name;
	private String gender;
	private int age;
	
	public Person() {}
	public Person(String name,String gender,int age){
		
		this.name=name;
		this.gender=gender;
		this.age=age;
	}
	public String m5(String s) {
		System.out.println("in this");
		return s;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public void m1(int i, int j, String str) {
		// TODO Auto-generated method stub
		
	}
	
	
}
