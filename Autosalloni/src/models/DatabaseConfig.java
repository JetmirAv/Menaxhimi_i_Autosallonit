package models;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConfig {

	private static Connection dbConnection;	
	private final static String host = "localhost";
	private final static String user = "root";
<<<<<<< HEAD
	private final static String password = "Password1234!";
	private final static String dbName = "proj_knk";
=======
	private final static String password = "";
	private final static String dbName = "autosalloni";
>>>>>>> 2b9d3d59133830f4a5b73b38163fd07013ebd709
	
	public static Connection getConnection() {
		if(dbConnection == null) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				dbConnection = DriverManager.getConnection("jdbc:mysql://"+host+":3306/"+dbName,user,password);
			} catch(Exception ex) {
				ex.printStackTrace();
			}
		}
		
		return dbConnection;
	}
	
}
