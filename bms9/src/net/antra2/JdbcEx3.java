package net.antra2;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcEx3 {

	public static void main(String[] args) throws SQLException {
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "oracle");
		CallableStatement cstmt=con.prepareCall("{call myproc}");
		cstmt.execute();
	}
}
