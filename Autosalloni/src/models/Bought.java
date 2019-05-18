package models;

import java.util.Date;

public class Bought {
	
	private int id;
	private int stockId;
	private int userId;
	private double price;
	private Date createdAt;
	private Date updatedAt;
	
	public Bought(int stockId, int userId, double price) {
		this.stockId = stockId;
		this.userId = userId;
		this.price = price;
		this.createdAt = new Date();
		this.updatedAt = new Date(); 
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getStockId() {
		return stockId;
	}

	public void setStockId(int stockId) {
		this.stockId = stockId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
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
		return "Bought [id=" + id + ", stockId=" + stockId + ", userId=" + userId + ", price=" + price + ", createdAt="
				+ createdAt + ", updatedAt=" + updatedAt + "]";
	}
	
	
}
