package net.antra2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import net.antra1.Emp;

public class Demo extends Emp{

/*	int i=30;
	public Demo() {
		super(2,"kumar");
		int i=super.sal;
	}
	*/
	//This is a demo class
	public static void main(String[] args) {
	
		List<Person> list=Arrays.asList(new Person("Sara","F",20),
				new Person("Sara","F",27),
				new Person("Bob","M",20),
				new Person("Paula","F",32),
				new Person("Paul","M",32),
				new Person("Jack","M",2),
				new Person("Jack","M",72),
				new Person("Jill","F",12)
				);
	/*	I1 i= Person::new;*/
		
		System.out.println();
		Supplier sp = I1::m3;
		System.out.println(sp.get()); 
		
		Supplier<Integer> sp2=()->{System.out.println("in supplier"); return 1;};
		
		Person p=new Person();
		Supplier sp1 =p::getName;
		System.out.println(sp1.get());
		/*Function fc=(i)->{System.out.println(i); return 10;};
		fc.apply(5);
		*/
		/*BiFunction<Integer,Integer,Integer> fuc=(i,j)->{
			int k=i+j;
			return k;
		};
		System.out.println(fuc.apply(10, 20));
		*/
		
	/*	List li=list.parallelStream().map(p->p.getAge()).distinct().collect(Collectors.toList());
		System.out.println(li);
		System.out.println(list.stream().filter(p->p.getAge()>15).collect(Collectors.toList()));
	*/	
		
		/*Consumer con=(t)->{
				Person p=(Person)t;
				System.out.println(p.getAge());
				System.out.println(p.getName());
				System.out.println(p.getGender());
			};
		list.stream().forEach((t)->{
			Person p=(Person)t;
			System.out.println(p.getAge());
			System.out.println(p.getName());
			System.out.println(p.getGender());
		});*/
		/*Iterator<Person> it=list.iterator();
		while(it.hasNext()) {
			Person p=(Person)it.next();
			System.out.println(p.getAge());
			System.out.println(p.getName());
			System.out.println(p.getGender());
		}*/
		
		/*I1 i1=(a,b,c)->{System.out.println(a+b+c);};
	
		
			i1.m1(10,20,"manas");*/
	}
}
