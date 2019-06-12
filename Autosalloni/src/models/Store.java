package models;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;


public class Store {
	
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
	public static ArrayList<String> nameA = new ArrayList<>();
	public static ArrayList<String> cityA = new ArrayList<>();
	public static ArrayList<String> stateA = new ArrayList<>();
	
	
	public Store(int id, String name,String address, String city,String state, String postal,  String phoneNumber) {
		this.id = id;
		this.name = name;
		this.address=address;
		this.city = city;
		this.postal = postal;
		this.state = state;
		this.phoneNumber = phoneNumber;
		this.createdAt = new Date();
		this.updatedAt = new Date();
	}

	public Store(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public Store(String name) {
		this.name = name;
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
	
	
	
			
	
	public static List<HBox> getStores() throws SQLException {
		List<HBox> storeList = new ArrayList<>();
		String query = "select id, name , address , city , state , postal , phoneNumber from stores limit 10";
		
		PreparedStatement preparedStatement = DatabaseConfig.getConnection().prepareStatement(query);
		ResultSet resultSet = preparedStatement.executeQuery();
			 
		while(resultSet.next()) {
			
			HBox headerBox = new HBox();
			headerBox.setAlignment(Pos.CENTER);
			headerBox.setPrefHeight(20);
			headerBox.getStyleClass().add("userList");
			Label lblName = new Label(resultSet.getString(2));
			Label lblAddress = new Label(resultSet.getString(3));
			Label lblCity = new Label(resultSet.getString(4));
			Label lblState = new Label(resultSet.getString(5));
			Label lblPostal = new Label(resultSet.getString(6));
			Label lblPhone = new Label(resultSet.getString(7));

			lblName.getStyleClass().add("storeData");
			lblAddress.getStyleClass().add("storeData");
			lblPhone.getStyleClass().add("storeData");
			lblCity.getStyleClass().add("storeData");
			lblState.getStyleClass().add("storeData");
			lblPostal.getStyleClass().add("storeData");

			lblName.setPrefWidth(120);
			lblAddress.setPrefWidth(230);
			lblPhone.setPrefWidth(180);
			lblCity.setPrefWidth(120);
			lblState.setPrefWidth(120);
			lblPostal.setPrefWidth(90);

			headerBox.getChildren().addAll(lblName, lblAddress, lblPhone, lblPostal,
					lblCity, lblState);
			storeList.add(headerBox);
		}
		
		return storeList;

	}
	
	
	public static void  getDetailsOfStores() throws SQLException {
		String query = "SELECT name , city , state  FROM Stores limit 5";
		
		PreparedStatement preparedStatement = DatabaseConfig.getConnection().prepareStatement(query);
		java.sql.ResultSet resultSet = preparedStatement.executeQuery();
			 
		while(resultSet.next()) {
			/*
			 * System.out.println(resultSet.getString(1));
			 * System.out.println(resultSet.getString(2));
			 * System.out.println(resultSet.getString(3));
			 */
			
			nameA.add(resultSet.getString(1));
			cityA.add(resultSet.getString(2));
	        stateA.add(resultSet.getString(3));
		}
		

	}
	
	
	/*
	 * public static void main(String[] args) throws SQLException {
	 * 
	 * city();
	 * 
	 * for(int i=0 ; i<cityA.size();i++) { System.out.print(cityA.get(i));
	 * 
	 * } }
	 */
	
	public static ObservableList<Store> getStore() throws SQLException {
		ObservableList<Store> storeList = FXCollections.observableArrayList();
		
		String query = "select id , name  from stores ";
		
		PreparedStatement preparedStatement = DatabaseConfig.getConnection().prepareStatement(query);
		java.sql.ResultSet resultSet = preparedStatement.executeQuery();
			
		while(resultSet.next()) {

			Store store = new Store(resultSet.getInt(1),resultSet.getString(2)); 
			storeList.add(store);
		
		}
		
		return storeList;

	}
	public static ObservableList<Store> getStore(int carId) throws SQLException {
		ObservableList<Store> storeList = FXCollections.observableArrayList();
		
		String query = "SELECT s.id , s.name  FROM Stores s inner join Stock s2 on s.id = s2.storeID where s2.carId = " + carId ;
		
		PreparedStatement preparedStatement = DatabaseConfig.getConnection().prepareStatement(query);
		java.sql.ResultSet resultSet = preparedStatement.executeQuery();
			
		while(resultSet.next()) {

			Store store = new Store(resultSet.getInt(1),resultSet.getString(2)); 
			storeList.add(store);
		
		}
		
		return storeList;

	}
	
	   public static boolean  createStoreQuery(String name , String address , String city , String state , String postal , String phoneNumber) throws SQLException { 
		   
	    	String query = "insert into stores(name,address,city,state,postal,phoneNumber) values(?,?,?,?,?,?)";
			PreparedStatement stm = DatabaseConfig.getConnection().prepareStatement(query);
	    	
			stm.setString(1,name);
			stm.setString(2,address);
			stm.setString(3,city);
			stm.setString(4, state);
			stm.setString(5, postal);
			stm.setString(6, phoneNumber);
			
			boolean result = stm.executeUpdate() > 0;
			return result;	
		}
		
	
	
	@Override
	public String toString() {
	    return this.getName();
	}

}
