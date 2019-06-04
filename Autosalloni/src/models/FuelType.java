package models;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

public class FuelType {

	private int id;
	private String name;
	private String description;
	private Date createdAt;
	private Date updatedAt;
	
	
	public FuelType(int id, String name, String description) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.createdAt = new Date();
		this.updatedAt = new Date();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatetimedAt() {
		return updatedAt;
	}

	public void setUpdatetimedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	
	
	
	public static boolean selectFuelType(int id) throws SQLException {
		String query = "select ft.name from fuelType ft inner join car c on c.fuelTypeId=ft.id where c.id=?;"; 

		PreparedStatement stm = DatabaseConfig.getConnection().prepareStatement(query);
		stm.setInt(1, id);
		return stm.executeUpdate() > 0;
		
	}
	
	
	
	
	
	
	
	
	
	
}
