package models;

import java.util.Date;

public class Photos {

	private int id;
	private String path;
	private int carId;
	private Date createdAt;
	private Date updatedAt;

	
	public Photos(String path, int carId) {
		this.path = path;
		this.carId = carId;
		this.createdAt = new Date();
		this.updatedAt = new Date();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public int getCarId() {
		return carId;
	}

	public void setCarId(int carId) {
		this.carId = carId;
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
		return "Photos [id=" + id + ", path=" + path + ", carId=" + carId + ", createdAt=" + createdAt + ", updatedAt="
				+ updatedAt + "]";
	}

	
}
