package insert_operation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil1 {
	
	private static final String Driver_Class="com.mysql.cj.jdbc.Driver";
	private static final String URL="jdbc:mysql://localhost:3306/jdbcdb";
	private static final String User_Name="root";
	private static final String Password="1BE18CV411";
	
	private static Connection connection= null;
	
	static {
		try {
			Class.forName(Driver_Class);
			connection=DriverManager.getConnection(URL, User_Name, Password);
		} catch (ClassNotFoundException | SQLException e) {
 			e.printStackTrace();
		}
	}
	public static Connection getConnection() {
		return connection;
	}

}
