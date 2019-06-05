package models;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

public class Card 
{
	private int id;
	private int userId;
	private String number;
	private int expMonth;
	private int expYear;
	private int code;
	private Date createdAt;
	private Date updatetimedAt;

	public Card(int id, int userId, String number, int expMonth, int expYear, int code, Date createdAt,
				Date updatetimedAt) 
	{
		this.id = id;
		this.userId = userId;
		this.number = number;
		this.expMonth = expMonth;
		this.expYear = expYear;
		this.code = code;
		this.createdAt = createdAt;
		this.updatetimedAt = updatetimedAt;
	}
	
	public int getUserId()
	{
		return userId;
	}
	
	public void setUserId(int userId) 
	{
		this.userId = userId;
	}
	
	public String getNumber() 
	{
		return number;
	}
	
	public void setNumber(String number) 
	{
		this.number = number;
	}
	
	public int getExpMonth() {
		return expMonth;
	}
	
	public void setExpMonth(int expMonth) {
		this.expMonth = expMonth;
	}
	
	public int getExpYear() 
	{
		return expYear;
	}
	
	public void setExpYear(int expYear) 
	{
		this.expYear = expYear;
	}
	
	public int getCode()
	{
		return code;
	}
	
	public void setCode(int code)
	{
		this.code = code;
	}
	
	public Date getCreatedAt()
	{
		return createdAt;
	}
	
	public void setCreatedAt(Date createdAt)
	{
		this.createdAt = createdAt;
	}
	
	public Date getUpdatetimedAt()
	{
		return updatetimedAt;
	}
	
	public void setUpdatetimedAt(Date updatetimedAt)
	{
		this.updatetimedAt = updatetimedAt;
	}
	
	public int getId()
	{
		return id;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	
	@Override
	public String toString()
	{
		return "Card [id=" + id + ", userId=" + userId + ", number=" + number + ", expMonth=" + expMonth + ", expYear="
				+ expYear + ", code=" + code + ", createdAt=" + createdAt + ", updatetimedAt=" + updatetimedAt + "]";
	}
	
	
	public static boolean insertCard(int userId, String number, int expMonth, int expYear, int code) throws SQLException {
		
		String query = "insert into card (userId, number, expMonth, expYear, code) values (?,?,?,?,?)";
		PreparedStatement stm = DatabaseConfig.getConnection().prepareStatement(query);
		
		stm.setInt(1,userId); //first parameter in the query //=>from token userId
		stm.setString(2,number);
		stm.setInt(3,expMonth);
		stm.setInt(4,expYear);
		stm.setInt(5,code);
		
		return stm.executeUpdate() > 0;
	}
	
	
	public static boolean updateCard(int id, int userId, String number, int expMonth, int expYear, int code) throws SQLException 
	{
		String query = "update card set number=?, expMonth=?, expYear=?, code=? where id = ? and userid = ?";
		
//		String query = " update card as c inner join users as u on c.userid = u.id "
//				+ " set c.expmonth=? where c.id = ? and u.id = ? ;";
		
		PreparedStatement stm = DatabaseConfig.getConnection().prepareStatement(query);
		
		stm.setInt(1, id);    // => from token
		stm.setInt(2, userId); //=> from token
		stm.setString(3, number); 
		stm.setInt(4,expMonth);
		stm.setInt(5,expYear);
		stm.setInt(6,code);
		stm.setInt(7,id);		// => from token 
		stm.setInt(8,userId);  // => from token
		
		return stm.executeUpdate() > 0;
	}
	
	public static boolean updateCard()
	{
		return stm.executeUpdate() > 0;
	}
	
	public static boolean deleteCard(int id) throws SQLException {
		String query = "delete from card where id = ?";
		PreparedStatement stm = DatabaseConfig.getConnection().prepareStatement(query);
		stm.setInt(1, id);
		return stm.executeUpdate() > 0;
	}
	
	
	

}
