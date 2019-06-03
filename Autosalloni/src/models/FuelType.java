package models;

import java.util.Date;

public class FuelType {

	private int id;
	private String name;
	private String description;
	private Date createdAt;
	private Date updatedAt;
	
	
	public FuelType(int id, String name, String description, String createdAt, String updatetimedAt) {
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
	
	
	
}
