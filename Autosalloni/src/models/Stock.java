package models;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
	
	
	public static boolean createStock(Integer carId, Integer storeId,Integer avalible,Double price, Boolean isSale) throws SQLException
	{
		String query = "insert into stock(carId,storeId,avalible,price,isSale) "
				+ "values (?,?,?,?,?); ";
		PreparedStatement stm = DatabaseConfig.getConnection().prepareStatement(query);
		
//      stm.setInt(1,id);
		stm.setInt(1, carId);
		stm.setInt(2,avalible);
		stm.setDouble(3, price);
		stm.setBoolean(4, isSale);
				
		return stm.executeUpdate() > 0;
	}
	
//	public static boolean createStock(Integer carId,Integer storeId, Integer avalible, Double price,
//	Boolean isSale) throws SQLException {
//
//String query = "insert into stock (carId,storeId,avalible,price,isSale) "
//		+ "values (?,?,?,?,?);";
//PreparedStatement stm = DatabaseConfig.getConnection().prepareStatement(query,
//		Statement.RETURN_GENERATED_KEYS);	//Automatically generated keys
//
//stm.setInt(1, carId);
//stm.setInt(2, storeId);
//stm.setInt(3, avalible);
//stm.setDouble(4, price);
//stm.setBoolean(5, isSale);
//
//stm.executeUpdate();
//
//ResultSet resultKeys = stm.getGeneratedKeys();	 // Retrieve the automatically generated key value in a ResultSet.
////resultKeys.next();
////System.out.println(resultKeys.getInt(1)); // Only one row is returned. Create ResultSet for query
//
//
//while (resultKeys.next())
//{
//	  carId = resultKeys.getInt(1);     
//	                                      // Get automatically generated key values
//	 System.out.println("automatically generated key value = " + carId);
//	}
//return true;
//
//}
	public static boolean updateStock(Integer id, Integer carId, Integer storeId, Integer avalible, Double price, Boolean isSale) throws SQLException
	{
		String query = "update stock set carId = (select id from car where model =?), storeId = (select id from store where name = ?), "
				+ "avalible = ?, price = ?, isSale = ? where id = ?";
		PreparedStatement stm = DatabaseConfig.getConnection().prepareStatement(query);
		
		stm.setInt(1,carId);
		stm.setInt(2, storeId);
		stm.setInt(3, avalible);
		stm.setDouble(4, price);
		stm.setBoolean(5, isSale);
		stm.setInt(6, id);
		
		
		return stm.executeUpdate() > 0;
	}
	
	public static boolean deleteStock(Integer id) throws SQLException
	{
		String query = "delete from stock where id = ?";
		PreparedStatement stm = DatabaseConfig.getConnection().prepareStatement(query);
		stm.setInt(1, id);
		return stm.executeUpdate() > 0;
	}
	
	
	

	
		
}
