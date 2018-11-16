package net.antra2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JdbcEx2 {

	public static void main(String[] args) throws SQLException {
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "oracle");
		try {
		
		/*Scanner sc=new Scanner(System.in);
		System.out.println("please enter id value");
		int id=sc.nextInt();
		System.out.println("please enter name value");
		String name=sc.next();
		System.out.println("please enter sal value");
		int sal=sc.nextInt();*/
		//Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/system","root","manas");
		con.setAutoCommit(false);
		
		PreparedStatement pstmt=con.prepareStatement("insert into emp values(?,?,?)");
		pstmt.setInt(1, 1);
		pstmt.setString(2, "Bing");
		pstmt.setInt(3, 1234);
		pstmt.addBatch();
		//pstmt.executeUpdate();
		
		pstmt.setInt(1, 1);
		pstmt.setString(2, "Eric");
		pstmt.setInt(3, 657);
		//pstmt.executeUpdate();
		pstmt.addBatch();
		
		pstmt.setInt(1, 2);
		pstmt.setString(2, "Siyu");
		pstmt.setInt(3, 734);
		//pstmt.executeUpdate();
		pstmt.addBatch();
		pstmt.executeBatch();
		
		con.commit();
		
		}catch(Exception e) {
			e.printStackTrace();
			con.rollback();
			
		}finally {
			con.close();
		}
	}
}
