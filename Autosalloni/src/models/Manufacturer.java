package models;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;


public class Manufacturer {
	
	private int id;
	private String name;
	private String email;
	private String phoneNumber;
	private Date createdAt;
	private Date updatedAt;
	
	
	public Manufacturer(int id, String name, String email, String phoneNumber) {
		
		this.id = id;
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
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


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
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
	
	public static ArrayList<String> getNames(){
		
		ArrayList<String> lista = new ArrayList<String>();
		String query = "select name from manufacturer";
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
	
	
	
	
	
	

}
