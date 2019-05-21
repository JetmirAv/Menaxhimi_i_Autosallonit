package models;
public class Stores {
	
	private int id;
	private String name;
	private String route;
	private String city;
	private String postal;
	private String state;
	private String phoneNumber;
	private String createdAt;
	private String updatetimedAt;
	
	
	public Stores(int id, String name, String route, String city, String postal, String state, String phoneNumber,
			String createdAt, String updatetimedAt) {
		this.id = id;
		this.name = name;
		this.route = route;
		this.city = city;
		this.postal = postal;
		this.state = state;
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


	public String getRoute() {
		return route;
	}


	public void setRoute(String route) {
		this.route = route;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getPostal() {
		return postal;
	}


	public void setPostal(String postal) {
		this.postal = postal;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
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
