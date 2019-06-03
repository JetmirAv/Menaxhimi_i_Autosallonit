package models;
import java.util.Date;

public class Users 
{
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
	
	
	public Users(int id, int roleId, String name, String surname, String email, String password, Date birthday, char gendre,
					String address, String city, String state, String postal, String phoneNumber, Date createdAt,
					Date updatetimedAt) 
	{
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
	
	
	public int getId()
	{
		return id;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public int getRoleId() 
	{
		return roleId;
	}
	
	public void setRoleId(int roleId)
	{
		this.roleId = roleId;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName()
	{
		this.name = name;
	}
	
	public String getSurname() 
	{
		return surname;
	}
	
	public void setSurname(String surname)
	{
		this.surname = surname;
	}
	
	public String getEmail()
	{
		return email;
	}
	
	public void setEmail(String email)
	{
		this.email = email;
	}
	
	public String getPassword()
	{
		return password;
	}
	
	public void setPassword(String password)
	{
		this.password = password;
	}
	
	public Date getBirthday() 
	{
		return birthday;
	}
	
	public void setBirthday(Date birthday) 
	{
		this.birthday = birthday;
	}
	
	public char getGendre() 
	{
		return gendre;
	}
	
	public void setGendre(char gendre)
	{
		this.gendre = gendre;
	}
	
	public String getAddress()
	{
		return address;
	}
	
	public void setAddress(String address)
	{
		this.address = address;
	}
	
	public String getCity()
	{
		return city;
	}
	
	public void setCity(String city)
	{
		this.city = city;
	}
	
	public String getState() 
	{
		return state;
	}
	
	public void setState(String state) 
	{
		this.state = state;
	}
	
	public String getPostal() 
	{
		return postal;
	}
	
	public void setPostal(String postal) 
	
	{
		this.postal = postal;
	}
	
	public String getPhoneNumber()
	{
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) 
	{
		this.phoneNumber = phoneNumber;
	}
	
	public Date getCreatedAt()
	{
		return createdAt;
	}
	
	public void setCreatedAt(Date createdAt) 
	{
		this.createdAt = createdAt;
	}
	
	public Date updatetimedAt() 
	{
		return updatetimedAt;
	}
	
	public void setUpdatedAt(Date updatetimedAt)
	{
		this.updatetimedAt = updatetimedAt;
	}
	
	
	@Override
	public String toString() 
	{
		return "Users [id=" + id + ", roleId=" + roleId + ", surname=" + surname + ", email=" + email + ", password="
				+ password + ", birthday=" + birthday + ", gendre=" + gendre + ", address=" + address + ", city=" + city
				+ ", state=" + state + ", postal=" + postal + ", phoneNumber=" + phoneNumber + ", createdAt="
				+ createdAt + ", updatetimedAt=" + updatetimedAt + "]";
	}

}
