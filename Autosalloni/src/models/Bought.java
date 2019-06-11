package models;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import view.CarsDetails;

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
	
	public static Double[] profitThroughYear() throws SQLException {
		
		Double[] profit = new Double[12];
		
		String query = "SELECT MONTH(createdAt),SUM(price)"
				+ " FROM bought WHERE YEAR(createdAt) = YEAR(CURRENT_DATE)"
				+ " GROUP BY MONTH(createdAt)";
		
		PreparedStatement stm = DatabaseConfig.getConnection().prepareStatement(query);
		
		ResultSet result = stm.executeQuery();
		
		while(result.next()) {
			profit[result.getInt(1)] = result.getDouble(2);
		}
		
		return profit;
	}
	
	public static Integer[] salesThroughMonths(int year) throws SQLException {
		Integer[] res = new Integer[12];
		String query = "select month(b.createdAt),"
				+ " count(*) from bought b inner join stock s"
				+ " on s.id=b.stockId where YEAR(b.createdAt)"
				+ " = YEAR(current_date) - ? group by MONTH(b.createdAt)";
		PreparedStatement stm = DatabaseConfig.getConnection().prepareStatement(query);
		stm.setInt(1, year);
		ResultSet result = stm.executeQuery();
		
		while(result.next()) {
			res[result.getInt(1) - 1] = result.getInt(2);
		}
		
		return res;
		
	}
	
	public static void notifications(int limit, int offset) throws SQLException {
		String query = "select u.name as 'Costumer',"
				+ " st.name as 'Store',"
				+ " m.name as 'Manufacturer',"
				+ " c.model as 'Car model'"
				+ " from bought b"
				+ " inner join users u"
				+ " on b.userId=u.id"
				+ " inner join stock s"
				+ " on b.stockId = s.id"
				+ " inner join stores st"
				+ " on s.storeId=st.id"
				+ " inner join car c"
				+ " on s.carId = c.id"
				+ " inner join manufacturer m"
				+ " on c.manufacturerId=m.id"
				+ " limit ? offset ?";
		
		PreparedStatement stm = DatabaseConfig.getConnection().prepareStatement(query);
		stm.setInt(1, limit);
		stm.setInt(2, offset);
		
		ResultSet result = stm.executeQuery();
		while(result.next()) {
			System.out.println("Costumer: " + result.getString(1) + 
					" Made a purchase on Store: " + result.getString(2) +
					" from manufacturer: " + result.getString(3) + 
					" model: " + result.getString(4));
		}
		System.out.println("");
		System.out.println("");
		
		
	}
	
	

	public static boolean  insertBought() throws SQLException { 
		
		
		Store storeObj = (Store) view.CarsDetails.storeComboBox.getSelectionModel().getSelectedItem();
		int storeID = storeObj.getId();
		int userID = 22;
		int priceOfCar = view.CarsDetails.c.returnPrice(view.CarsDetails.c.getId(),storeObj.getId());
     	String query = "insert into bought(stockId,userId,price) values(?,?,?)";
		PreparedStatement stm = DatabaseConfig.getConnection().prepareStatement(query);
		stm.setInt(1,storeID);
		stm.setInt(2,userID);
		stm.setInt(3,priceOfCar);
		boolean result = stm.executeUpdate() > 0;
		return result;	
	}
	
	

	
}
