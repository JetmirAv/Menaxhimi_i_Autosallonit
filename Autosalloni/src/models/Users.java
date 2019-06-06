package models;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Users {
	private int id;
	private int roleId;
	private String name;
	private String surname;
	private String email;
	private String password;
	private Date birthday;
	private char gendre;
	private String address;
	private String city;
	private String state;
	private String postal;
	private String phoneNumber;
	private Date createdAt;
	private Date updatetimedAt;

	public Users(int id, int roleId, String name, String surname, String email, String password, Date birthday,
			char gendre, String address, String city, String state, String postal, String phoneNumber, Date createdAt,
			Date updatetimedAt) {
		this.id = id;
		this.roleId = roleId;
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.password = password;
		this.birthday = birthday;
		this.gendre = gendre;
		this.address = address;
		this.city = city;
		this.state = state;
		this.postal = postal;
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

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public char getGendre() {
		return gendre;
	}

	public void setGendre(char gendre) {
		this.gendre = gendre;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPostal() {
		return postal;
	}

	public void setPostal(String postal)

	{
		this.postal = postal;
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

	public Date updatetimedAt() {
		return updatetimedAt;
	}

	public void setUpdatedAt(Date updatetimedAt) {
		this.updatetimedAt = updatetimedAt;
	}

	@Override
	public String toString() {
		return "Users [id=" + id + ", roleId=" + roleId + ", surname=" + surname + ", email=" + email + ", password="
				+ password + ", birthday=" + birthday + ", gendre=" + gendre + ", address=" + address + ", city=" + city
				+ ", state=" + state + ", postal=" + postal + ", phoneNumber=" + phoneNumber + ", createdAt="
				+ createdAt + ", updatetimedAt=" + updatetimedAt + "]";
	}

	public static boolean create(String name, String surname, String email, String password, Date birthday, String gendre,
			String address, String city, String state, String postal, String phoneNumber) throws SQLException {
		
		String query = "insert into users (roleId, name, surname, email, password," + 
				" birthday, gendre, address, city, state, postal, phoneNumber) values (?,?,?,?,?,?,?,?,?,?,?,?)";
		//Shtohet qajo Statement.RETURN_GENERATED_KEYS
		PreparedStatement stm = DatabaseConfig.getConnection().prepareStatement(query, 
				Statement.RETURN_GENERATED_KEYS);
		
		stm.setInt(1, 2);
		stm.setString(2,name);
		stm.setString(3,surname);
		stm.setString(4,email);
		stm.setString(5,password);
		stm.setDate(6, birthday);
		stm.setString(7, gendre);
		stm.setString(8,address);
		stm.setString(9,city);
		stm.setString(10,state);
		stm.setString(11,postal);
		stm.setString(12,phoneNumber);
		
		stm.executeUpdate();
		
		//Kjo shtohet
		ResultSet resultKeys = stm.getGeneratedKeys();
		resultKeys.next();
		System.out.println(resultKeys.getInt(1));
		return true;
		
	}
	public static boolean update(int id, String name, String surname, String email, String password, Date birthday, String gendre,
			String address, String city, String state, String postal, String phoneNumber) throws SQLException {
		
		String query = "update users set name=?, surname=?, email=?, password=?," + 
				" birthday=?, gendre=?, address=?, city=?, state=?, postal=?, phoneNumber=? where id = ?";
		PreparedStatement stm = DatabaseConfig.getConnection().prepareStatement(query);
		
		stm.setInt(1, 2);
		stm.setString(2,name);
		stm.setString(3,surname);
		stm.setString(4,email);
		stm.setString(5,password);
		stm.setDate(6, birthday);
		stm.setString(7, gendre);
		stm.setString(8,address);
		stm.setString(9,city);
		stm.setString(10,state);
		stm.setString(11,postal);
		stm.setString(12,phoneNumber);
		stm.setInt(13,id);
		
		
		return stm.executeUpdate() > 0;
		
	}

	public static boolean delete(int id) throws SQLException {
		String query = "delete from users where id = ?";
		PreparedStatement stm = DatabaseConfig.getConnection().prepareStatement(query);
		stm.setInt(1, id);
		return stm.executeUpdate() > 0;
	}
	
	public static int count(boolean thisMonth) throws SQLException {
		String query = "select count(*) from users;";
		if(thisMonth) {
			query = "select COUNT(*) from users where"
					+ " MONTH(createdAt) = MONTH(CURRENT_DATE)  AND"
						+ " YEAR(createdAt) = YEAR(CURRENT_DATE)";
		}
		
		PreparedStatement stm = DatabaseConfig.getConnection().prepareStatement(query);
	
		ResultSet queryResult = stm.executeQuery();
		queryResult.next();
		return queryResult.getInt(1);
	}
	
}



























