package dbConnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseConnect {
	
	public static ResultSet test() throws SQLException {
		
			String url = "jdbc:mysql://localhost:3306/JavaPrac?useSSL=false&serverTimezone=UTC";
	        String username = "root";
	        String password = "root";
            Connection conn = DriverManager.getConnection(url, username, password);
           // System.out.println("Connected to the database!");
            
            String query = "SELECT * FROM javaprac.login_details"; // Example table 'students'
            PreparedStatement stmt = conn.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
  
            // Always close the connection
           // conn.close(); 
            return rs;
        }
}