package models;

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

}
