package models;

import java.util.Date;

public class Stock {
	
	private int id;
	private int carId;
	private int storeId;
	private int avalible;
	private double price;
	private boolean isSale;
	private Date createdAt;
	private Date updatedAt;
	
	public Stock(int carId, int storeId, int avalible, double price, boolean isSale) {
		this.carId = carId;
		this.storeId = storeId;
		this.avalible = avalible;
		this.price = price;
		this.isSale = isSale;
		this.createdAt = new Date();
		this.updatedAt = new Date();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCarId() {
		return carId;
	}

	public void setCarId(int carId) {
		this.carId = carId;
	}

	public int getStoreId() {
		return storeId;
	}

	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}

	public int getAvalible() {
		return avalible;
	}

	public void setAvalible(int avalible) {
		this.avalible = avalible;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isSale() {
		return isSale;
	}

	public void setSale(boolean isSale) {
		this.isSale = isSale;
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
		return "Stock [id=" + id + ", carId=" + carId + ", storeId=" + storeId + ", avalible=" + avalible + ", price="
				+ price + ", isSale=" + isSale + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + "]";
	}
	
		
}
