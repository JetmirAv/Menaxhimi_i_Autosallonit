package models;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


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
	
	
	public Stores(int id, String name,String address, String city,String state, String postal,  String phoneNumber) {
		this.id = id;
		this.name = name;
		this.address=address;
		//this.route = route;
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

//
//	public String getRoute() {
//		return route;
//	}
//
//
//	public void setRoute(String route) {
//		this.route = route;
//	}


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
	
	
	public static boolean create(String name , String address , String city , String postal 
			, String state , String phoneNumber) throws SQLException {

	
	String query = "insert into stores (name , address  , city , postal , state , phoneNumber)"+" values (?,?,?,?,?,?)";	
	PreparedStatement stm = DatabaseConfig.getConnection().prepareStatement(query);
	
    
	stm.setString(1,name);
	stm.setString(2,address);
	stm.setString(3,city);
	stm.setString(4,postal);
	stm.setString(5,state);
	stm.setString(6, phoneNumber);

	return stm.executeUpdate() > 0;
	
	}
	
	
	public static boolean update(String name , String address , String city , String postal , String state , 
			String phoneNumber ) throws SQLException {
		
		String query = "update stores set name=?, address=?, city=?, postal=?," + 
				" state=?, phoneNumber=?  where id = ?";
		PreparedStatement stm = DatabaseConfig.getConnection().prepareStatement(query);	
	
		stm.setString(1, name);
		stm.setString(2, address);
		stm.setString(3, city);
		stm.setString(4, postal);
		stm.setString(5, state);
		stm.setString(6, phoneNumber);
		
		
		return stm.executeUpdate() > 0;
		
	}

	
	public static boolean delete(int id) throws SQLException {
		String query = "delete from stores where id = ?";
		PreparedStatement stm = DatabaseConfig.getConnection().prepareStatement(query);
		stm.setInt(1, id);
		return stm.executeUpdate() > 0;
		
		
	}
	
	
	
	public static boolean getCity(int id) throws SQLException {
		String query = "Select city from stores where id = ?";
		PreparedStatement stm = DatabaseConfig.getConnection().prepareStatement(query);
		stm.setInt(1, id);
		return stm.executeUpdate() > 0;
			
	}
	
	
	
	public static boolean getState(int id) throws SQLException {
		String query = "Select state from stores where id = ?";
		PreparedStatement stm = DatabaseConfig.getConnection().prepareStatement(query);
		stm.setInt(1, id);
		return stm.executeUpdate() > 0;
			
	}
		
	public static boolean getName(int id) throws SQLException {
		String query = "Select name from stores where id = ?";
		PreparedStatement stm = DatabaseConfig.getConnection().prepareStatement(query);
		stm.setInt(1, id);
		return stm.executeUpdate() > 0;
			
	}
	
	public static List<Stores> getStores() throws SQLException {
		List<Stores> storeList = new ArrayList();
		String query = "select id, name , address , city , state , postal , phoneNumber , createdAt , updatetimedAt from stores  limit 10";
		
		PreparedStatement preparedStatement = DatabaseConfig.getConnection().prepareStatement(query);
		java.sql.ResultSet resultSet = preparedStatement.executeQuery();
			 
		while(resultSet.next()) {

			Stores store = new Stores(resultSet.getInt(1),resultSet.getString(2)
					      ,resultSet.getString(3),resultSet.getString(4),resultSet.getString(5)
					      ,resultSet.getString(6),resultSet.getString(7)); 
			storeList.add(store);
		}
		
		return storeList;

	}
	
	
	
	
}
