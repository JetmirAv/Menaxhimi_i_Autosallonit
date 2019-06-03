package models;

import java.util.Date;


public class Stores {
	
	private int id;
	private String name;
	private String address;
	private String route;
	private String city;
	private String postal;
	private String state;
	private String phoneNumber;
	private Date createdAt;
	private Date updatedAt;
	
	
	public Stores(int id, String name,String address, String route, String city, String postal, String state, String phoneNumber) {
		this.id = id;
		this.name = name;
		this.address=address;
		this.route = route;
		this.city = city;
		this.postal = postal;
		this.state = state;
		this.phoneNumber = phoneNumber;
		this.createdAt = new Date();
		this.updatedAt = new Date();
	}

	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address=address;
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

	
}
