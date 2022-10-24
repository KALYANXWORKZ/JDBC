package insert_operation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertDemo {

	// Driver name and database Url
	private static final String DB_Class = "com.mysql.cj.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/jdbcdb";

	// Database Credentials
	private static final String User_Name = "root";
	private static final String Password = "1BE18CV411";

	// Method

	private void insertStudentDetails() throws SQLException {
		Connection connection = DriverManager.getConnection(URL, User_Name, Password);

		try {
			// Load the Class and Register
			Class.forName(DB_Class);

            // Execute the Query
			String SQL = "insert into student_table values (?,?,?,?,?,?)";
			PreparedStatement prepareStatement = connection.prepareStatement(SQL);
			prepareStatement.setInt(1, 102);
			prepareStatement.setString(2, "Dayanand");
			prepareStatement.setString(3, "1BE18CV404");
			prepareStatement.setString(4, "BMSECE");
			prepareStatement.setString(5, "Bangalore");
			prepareStatement.setInt(6, 65000);

			int noOfRowsInserted = prepareStatement.executeUpdate();
			System.out.println("No of Rows Inserted : " + noOfRowsInserted);
		} catch (Exception e) {
			e.printStackTrace();
		} 
		finally {
			connection.close();
			
		}
	}
	
	public static void main(String[] args) throws SQLException {
		InsertDemo insertDemo = new InsertDemo();
		insertDemo.insertStudentDetails();
	}
}
