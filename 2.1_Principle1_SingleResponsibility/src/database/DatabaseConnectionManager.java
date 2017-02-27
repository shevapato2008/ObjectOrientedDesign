package database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * I put this class here just for demonstration purposes 
 * so you can see roughly how the internals of a connection 
 * manager would look like. Notice that this class has a private 
 * constructor. That means, clients cannot create instances 
 * of this class. But notice it has a method called 
 * getManagerInstance() which returns an instance of this class. 
 * 
 * @author Imtiaz
 *
 */

public class DatabaseConnectionManager {

	private Connection conn;
	
	// instantiate an instance of database connection manager
	private static DatabaseConnectionManager connectionInstance = new DatabaseConnectionManager();
	
	// private constructor: clients cannot create instances of this class
	private DatabaseConnectionManager() {
		
	}
	
	// static method that returns an instance of this class
	public static DatabaseConnectionManager getManagerInstance() {
		return connectionInstance;
	}
	
	/**
	 * contains connection details
	 * @throws SQLException
	 */
	public void connect() throws SQLException {
		// processing specific to database connection details...
		conn = DriverManager.getConnection("Some Database URL");
		System.out.println("Established Database Connection...");
	}
	
	public Connection getConnectionObject() {
		return conn;
	}
	
	public void disconnect() throws SQLException {
		conn.close();
		System.out.println("Disconnected from Database...");
	}
	
}