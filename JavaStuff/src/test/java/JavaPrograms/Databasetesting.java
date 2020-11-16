package JavaPrograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Databasetesting {
	
	public static void main(String[] args) throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:ssms:dwh51", "root", "root");
		
		Statement statement = con.createStatement();
		ResultSet rs = statement.executeQuery("select * from customers;");
		rs.next();
		
		while(rs.next()) {
			System.out.println(rs.getString("username"));
		}
		
	}

}
