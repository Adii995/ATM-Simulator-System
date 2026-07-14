package BankManagementSystem;
import java.sql.*;
public class DbConnection {
    
	Connection c;
	Statement s;
	
	public DbConnection() {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			c = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankmanagementsystem","root","roof");
			s = c.createStatement();
			
			
		} catch (Exception e) {
			System.out.println(e);
			// TODO: handle exception
		}
	}
}
