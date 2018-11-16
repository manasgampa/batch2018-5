package net.antra1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import javax.swing.filechooser.FileNameExtensionFilter;

public class ExceptionEx {

	public static void main(String[] args) throws EmployeeNotFound, FileNotFoundException  {
		
		
		String str=new String();
		FileReader fis=new FileReader("C:\\test\\a.txt");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter i value");
		int i=sc.nextInt();
		System.out.println("please enter j value");
		int j=sc.nextInt();
		try {
		throw new EmployeeNotFound("no employee is available");
		
		}catch(Exception e) {
			
		}
		int k=i+j;
		System.out.println("add:"+k);
	
		/*try {
			
		int l=i/j;
		System.out.println("div:"+l);
		
		
		}catch(Exception ae) {
			ae.printStackTrace();
		}finally {
			System.out.println("in finally");
		}*/
		int m=i-j;
		System.out.println("sub:"+m);
		
		
	}
}
