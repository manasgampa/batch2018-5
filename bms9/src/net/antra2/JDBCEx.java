package net.antra2;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCEx {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// first way
		//Driver d=new oracle.jdbc.driver.OracleDriver();
		//second way
		//DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		// 3rd way
		//Class.forName("oracle.jdbc.driver.OracleDriver");
		//oracle
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "oracle");
		//System.out.println(con1);
		//mysql
		//Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/system","root","manas");
		//System.out.println(con2);
		int id=2;
		String name="stuart";
		int sal=567;
		Statement stmt=con.createStatement();
		//stmt.executeUpdate("insert into emp values("+id+","+name+","+sal+")");
		ResultSet rs=stmt.executeQuery("Select * from emp");
		
		ResultSetMetaData rd=rs.getMetaData();
		
		int column=rd.getColumnCount();
		System.out.println(column);
		while(rs.next()) {
			
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getInt(3));
		}
		stmt.close();
	}
}
