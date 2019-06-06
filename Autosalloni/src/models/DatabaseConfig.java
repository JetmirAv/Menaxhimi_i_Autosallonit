package models;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConfig {

	private static Connection dbConnection;	
	private final static String host = "localhost";
	private final static String user = "root";
	private final static String password = "";
	private final static String dbName = "autosalloni";
	
	public static Connection getConnection() {
		if(dbConnection == null) {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				dbConnection = DriverManager.getConnection("jdbc:mysql://"+host+":3306/"+dbName,user,password);
			} catch(Exception ex) {
				ex.printStackTrace();
			}
		}
		
		return dbConnection;
	}
	
}
