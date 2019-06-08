package models;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

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
 
	public FuelType(int id, String name) {
		this.id = id;
		this.name = name;
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
	
	
	public static ArrayList<String> getNamesOfFuelType(){
		
		ArrayList<String> lista = new ArrayList<String>();
		String query = "select name from fuelType";
		PreparedStatement stm;
		try {
			stm = DatabaseConfig.getConnection().prepareStatement(query);
			ResultSet result = stm.executeQuery();
			
			while(result.next()) {
				lista.add(result.getString(1));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return lista;
		
	}
	public static ObservableList<FuelType> getFuelTypes() throws SQLException {
		ObservableList<FuelType> carList = FXCollections.observableArrayList();
		
		String query = "select id , name  from fueltype ";
		
		PreparedStatement preparedStatement = DatabaseConfig.getConnection().prepareStatement(query);
		java.sql.ResultSet resultSet = preparedStatement.executeQuery();
			
		while(resultSet.next()) {

			FuelType fuelType = new FuelType(resultSet.getInt(1),resultSet.getString(2)); 
			carList.add(fuelType);
		
		}
		
		return carList;

	}
	
	@Override
	public String toString() {
	    return this.getName();
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
