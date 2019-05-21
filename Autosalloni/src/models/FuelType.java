package models;

public class FuelType {

	private int id;
	private String name;
	private String description;
	private String createdAt;
	private String updatetimedAt;
	
	public FuelType(int id, String name, String description, String createdAt, String updatetimedAt) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.createdAt = createdAt;
		this.updatetimedAt = updatetimedAt;
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

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public String getUpdatetimedAt() {
		return updatetimedAt;
	}

	public void setUpdatetimedAt(String updatetimedAt) {
		this.updatetimedAt = updatetimedAt;
	}
	
	
	
}
