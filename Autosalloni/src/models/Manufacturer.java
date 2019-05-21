package models;
public class Manufacturer {
	
	private int id;
	private String name;
	private String email;
	private String phoneNumber;
	private String createdAt;
	private String updatetimedAt;
	
	
	public Manufacturer(int id, String name, String email, String phoneNumber, String createdAt, String updatetimedAt) {
		
		this.id = id;
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
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
