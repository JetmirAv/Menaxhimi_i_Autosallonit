package models;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import view.SignUp;

public class Photos {

	private int id;
	private String path;
	private int carId;
	private Date createdAt;
	private Date updatedAt;
	
	

	
	public Photos(String path, int carId) {
		this.path = path;
		this.carId = carId;
		this.createdAt = new Date();
		this.updatedAt = new Date();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public int getCarId() {
		return carId;
	}

	public void setCarId(int carId) {
		this.carId = carId;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	@Override
	public String toString() {
		return "Photos [id=" + id + ", path=" + path + ", carId=" + carId + ", createdAt=" + createdAt + ", updatedAt="
				+ updatedAt + "]";
	}
	
	
	public static boolean insertPhoto(Integer carId, String path) throws SQLException , FileNotFoundException,IOException
	{
		String query = "Insert into photos(path,carId) values (?,?) ; ";
		PreparedStatement stm = DatabaseConfig.getConnection().prepareStatement(query);
		
		
		//SignUp signUpObj = new SignUp();
	
		stm.setString(1, path);
		stm.setInt(2, carId);
		return stm.executeUpdate() > 0;
			
	}
	public static boolean updatePhoto(Integer carId, String path) throws SQLException , FileNotFoundException,IOException
	{
		String query = "update photos set path = ? where carId = ?  ";
		PreparedStatement stm = DatabaseConfig.getConnection().prepareStatement(query);
		stm.setString(1, path);
		stm.setInt(2, carId);
		
		return stm.executeUpdate() > 0;
			
	}
	
	public static String find(Integer carId) throws SQLException , FileNotFoundException,IOException
	{
		String query = "select path from photos where carId = ?";
		PreparedStatement stm = DatabaseConfig.getConnection().prepareStatement(query);
		stm.setInt(1, carId);
		
		ResultSet rs = stm.executeQuery();;
		rs.next();
		return rs.getString(1);
	}
	
}
