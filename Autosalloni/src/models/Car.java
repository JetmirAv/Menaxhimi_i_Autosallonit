package models;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import models.Manufacturer;

public class Car {
            private int id;
			private int manufacturerId;
			private String model;
			private String bodyNumber;
			private int yearOfProd ;
			private int seats ;
			private int doors;
			private boolean roof ;
			private boolean alarm ;
			private boolean central ;
			private boolean airbag ;
			private boolean autonomus;
			private boolean navigator;
			private boolean climate;
			private int fuelTypeId;
			private int fuelCapacity;
			private double fuelConsumption;
			private boolean hidraulic;
			private String engineModel;
			private double enginePower;
			private int hoursePower;
			private int maxspeed;
			private double seconds0to100;
			private boolean isAutomatic;
			private int gears;
			private String tireModel;
			private int tireSize;
			private String additionalDesc;
			private boolean is4x4 ;
			private Date createdAt;
			private Date updatetimedAt; 
			public static ArrayList<Car> kerret = new ArrayList<Car>();
			public static ArrayList<String> nameOfManufacture = Manufacturer.getNamesOfManufacturer();
			public static ArrayList<String> nameOfFuelType = FuelType.getNamesOfFuelType();
			
			
			
			
			
	/*
	 * public static ArrayList<String> modelA = new ArrayList<>(); public static
	 * ArrayList<String> bodyNumberA = new ArrayList<>(); public static
	 * ArrayList<String> engineModelA = new ArrayList<>(); public static
	 * ArrayList<Integer> idOfCar = new ArrayList<>();
	 */
			

						
			public Car(int id , int manufacturerId ,String model,String bodyNumber,int yearOfProd ,int seats ,
					int doors,boolean roof ,boolean alarm ,boolean central ,boolean airbag ,boolean autonomus,
					boolean navigator,boolean climate,int fuelTypeId,int fuelCapacity,double fuelConsumption,
					boolean hidraulic,String engineModel,double enginePower,int hoursePower,int maxspeed,
					double seconds0to100,boolean isAutomatic,int gears,String tireModel,int tireSize,String additionalDesc,
					boolean is4x4) {
				this.id = id;
				this.manufacturerId=manufacturerId;
				this.model=model;
				this.bodyNumber=bodyNumber;
				this.yearOfProd=yearOfProd ;
				this.seats=seats ;
				this.doors=doors;
				this.roof=roof ;
				this.alarm=alarm ;
				this.central=central ;
				this.airbag=airbag ;
				this.autonomus=autonomus;
				this.navigator=navigator;
				this.climate=climate;
				this.fuelTypeId=fuelTypeId;
				this.fuelCapacity=fuelCapacity;
				this.fuelConsumption=fuelConsumption;
				this.hidraulic=hidraulic;
				this.engineModel=engineModel;
				this.enginePower=enginePower;
				this.hoursePower=hoursePower;
				this.maxspeed=maxspeed;
				this.seconds0to100=seconds0to100;
				this.isAutomatic=isAutomatic;
				this.gears=gears;
				this.tireModel=tireModel;
				this.tireSize=tireSize;
				this.additionalDesc=additionalDesc;
				this.is4x4=is4x4;
			}


			public Car(int seats , int doors, boolean alarm, boolean climate, boolean hidraulic, int hoursePower,int maxspeed,boolean isAutomatic) {
				this.seats=seats ;
				this.doors=doors;
				this.alarm=alarm ;
				this.climate=climate;
				this.hoursePower=hoursePower;
				this.maxspeed=maxspeed;
				this.isAutomatic=isAutomatic;
			}
			
			  
			public int getId() {
				return id;
			}

			public void setId(int id) {
				this.id = id;
			}

			public int getManufacturerId() {
				return manufacturerId;
			}

			public void setManufacturerId(int manufacturerId) {
				this.manufacturerId = manufacturerId;
			}

			public String getModel() {
				return model;
			}

			public void setModel(String model) {
				this.model = model;
			}

			public String getBodyNumber() {
				return bodyNumber;
			}

			public void setBodyNumber(String bodyNumber) {
				this.bodyNumber = bodyNumber;
			}

			public int getYearOfProd() {
				return yearOfProd;
			}

			public void setYearOfProd(int yearOfProd) {
				this.yearOfProd = yearOfProd;
			}

			public int getSeats() {
				return seats;
			}

			public void setSeats(int seats) {
				this.seats = seats;
			}

			public int getDoors() {
				return doors;
			}

			public void setDoors(int doors) {
				this.doors = doors;
			}

			public boolean isRoof() {
				return roof;
			}

			public void setRoof(boolean roof) {
				this.roof = roof;
			}

			public boolean isAlarm() {
				return alarm;
			}

			public void setAlarm(boolean alarm) {
				this.alarm = alarm;
			}

			public boolean isCentral() {
				return central;
			}

			public void setCentral(boolean central) {
				this.central = central;
			}

			public boolean isAirbag() {
				return airbag;
			}

			public void setAirbag(boolean airbag) {
				this.airbag = airbag;
			}

			public boolean isAutonomus() {
				return autonomus;
			}

			public void setAutonomus(boolean autonomus) {
				this.autonomus = autonomus;
			}

			public boolean isNavigator() {
				return navigator;
			}

			public void setNavigator(boolean navigator) {
				this.navigator = navigator;
			}

			public boolean isClimate() {
				return climate;
			}

			public void setClimate(boolean climate) {
				this.climate = climate;
			}

			public int getFuelTypeId() {
				return fuelTypeId;
			}

			public void setFuelTypeId(int fuelTypeId) {
				this.fuelTypeId = fuelTypeId;
			}

			public int getFuelCapacity() {
				return fuelCapacity;
			}

			public void setFuelCapacity(int fuelCapacity) {
				this.fuelCapacity = fuelCapacity;
			}

			public double getFuelConsumption() {
				return fuelConsumption;
			}

			public void setFuelConsumption(double fuelConsumption) {
				this.fuelConsumption = fuelConsumption;
			}

			public boolean isHidraulic() {
				return hidraulic;
			}

			public void setHidraulic(boolean hidraulic) {
				this.hidraulic = hidraulic;
			}

			public String getEngineModel() {
				return engineModel;
			}

			public void setEngineModel(String engineModel) {
				this.engineModel = engineModel;
			}

			public double getEnginePower() {
				return enginePower;
			}

			public void setEnginePower(double enginePower) {
				this.enginePower = enginePower;
			}

			public int getHoursePower() {
				return hoursePower;
			}

			public void setHoursePower(int hoursePower) {
				this.hoursePower = hoursePower;
			}

			public int getMaxspeed() {
				return maxspeed;
			}

			public void setMaxspeed(int maxspeed) {
				this.maxspeed = maxspeed;
			}

			public double getSeconds0to100() {
				return seconds0to100;
			}

			public void setSeconds0to100(double seconds0to100) {
				this.seconds0to100 = seconds0to100;
			}

			public boolean isAutomatic() {
				return isAutomatic;
			}

			public void setAutomatic(boolean isAutomatic) {
				this.isAutomatic = isAutomatic;
			}

			public int getGears() {
				return gears;
			}

			public void setGears(int gears) {
				this.gears = gears;
			}

			public String getTireModel() {
				return tireModel;
			}

			public void setTireModel(String tireModel) {
				this.tireModel = tireModel;
			}

			public int getTireSize() {
				return tireSize;
			}

			public void setTireSize(int tireSize) {
				this.tireSize = tireSize;
			}

			public String getAdditionalDesc() {
				return additionalDesc;
			}

			public void setAdditionalDesc(String additionalDesc) {
				this.additionalDesc = additionalDesc;
			}

			public boolean isIs4x4() {
				return is4x4;
			}

			public void setIs4x4(boolean is4x4) {
				this.is4x4 = is4x4;
			}

			public Date getCreatedAt() {
				return createdAt;
			}

			public void setCreatedAt(Date createdAt) {
				this.createdAt = createdAt;
			}

			public Date getUpdatetimedAt() {
				return updatetimedAt;
			}

			public void setUpdatetimedAt(Date updatetimedAt) {
				this.updatetimedAt = updatetimedAt;
			}
			@Override  
			public String toString() {
				return "Car [id=" +id +"manufacturerId=" +manufacturerId + "model="+model+"bodyNumber="+bodyNumber+"yearOfProd="+yearOfProd+
						"seats="+seats+"doors="+doors+"roof="+roof+"alarm="+alarm+"central="+central+"airbag="+airbag+"autonomus="+autonomus+ 
						"navigator="+navigator+"climate="+climate+"fuelTypeId="+fuelTypeId+"fuelCapacity="+fuelCapacity+"fuelConsumption="+  
						fuelConsumption+"hidraulic="+hidraulic+"engineModel="+engineModel+"enginePower="+enginePower+"hoursePower="+hoursePower + 
						"maxspeed="+maxspeed+"seconds0to100="+seconds0to100+"isAutomatic="+isAutomatic+"gears="+gears+"tireModel="+tireModel+"tireSize="+tireSize + 
						"additionalDesc="+additionalDesc+"is4x4="+is4x4+"createdAt="+createdAt+"updatetimedAt="+updatetimedAt + "]";
			
			 }
			


			public  String getNameOfFuelTypeSQL() throws SQLException   {
				String s = "";
				String query = "SELECT distinct f.name FROM fueltype f inner join car c on f.id = c.fuelTypeId WHERE f.id =" + getFuelTypeId() ;
				PreparedStatement preparedStatement = DatabaseConfig.getConnection().prepareStatement(query); 
				java.sql.ResultSet resultSet = preparedStatement.executeQuery();
				while(resultSet.next()) {
					s += resultSet.getString(1);
				}
				return s;
			}
			
			public String getNameOFManufacturerSQL() throws SQLException {
				String s = "";
				String query = "SELECT distinct m.name FROM manufacturer m inner join car c on m.id = c.manufacturerId WHERE m.id =" + getManufacturerId() ;
				PreparedStatement preparedStatement = DatabaseConfig.getConnection().prepareStatement(query); 
				java.sql.ResultSet resultSet = preparedStatement.executeQuery();
				while(resultSet.next()) {
					s += resultSet.getString(1);
				}
				return s;
			}
			

			
	 
	public static boolean create(int manufacturerId ,String model,String bodyNumber,int yearOfProd ,int seats ,
			int doors,boolean roof ,boolean alarm ,boolean central ,boolean airbag ,boolean autonomus,
			boolean navigator,boolean climate,int fuelTypeId,int fuelCapacity,double fuelConsumption,
			boolean hidraulic,String engineModel,double enginePower,int hoursePower,int maxspeed,
			double seconds0to100,boolean isAutomatic,int gears,String tireModel,int tireSize,String additionalDesc,
			boolean is4x4) throws SQLException {

	
	String query = "insert into car (manufacturerId ,model,bodyNumber,yearOfProd ,seats ,\r\n" + 
			"			doors,roof ,alarm ,central ,airbag ,autonomus,\r\n" + 
			"			navigator,climate,fuelTypeId,fuelCapacity,fuelConsumption,\r\n" + 
			"			hidraulic,engineModel,enginePower,hoursePower,maxspeed,\r\n" + 
			"			seconds0to100,isAutomatic,gears,tireModel,tireSize,additionalDesc,is4x4)"+
			"			values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	
	PreparedStatement stm = DatabaseConfig.getConnection().prepareStatement(query);
	
    
	stm.setInt(1, manufacturerId);
	stm.setString(2,model);
	stm.setString(3,bodyNumber);
	stm.setInt(4,yearOfProd);
	stm.setInt(5,seats);
	stm.setInt(6, doors);
	stm.setBoolean(7, roof);
	stm.setBoolean(8,alarm);
	stm.setBoolean(9, central);
	stm.setBoolean(10,airbag);
	stm.setBoolean(11, autonomus);
	stm.setBoolean(12,navigator);
	stm.setBoolean(13, climate);
	stm.setInt(14,fuelTypeId);
	stm.setInt(15,fuelCapacity);
	stm.setDouble(16,fuelConsumption);
	stm.setBoolean(17,hidraulic);
	stm.setString(18,engineModel);
	stm.setDouble(19,enginePower);
	stm.setInt(20,hoursePower);
	stm.setInt(21,maxspeed);
	stm.setDouble(22,seconds0to100);
	stm.setBoolean(23,isAutomatic);
	stm.setInt(24,gears);
	stm.setString(25,tireModel);
	stm.setString(26,additionalDesc);
	stm.setBoolean(27,is4x4);
	
	
	return stm.executeUpdate() > 0; 
}
	public static boolean update(int manufacturerId ,String model,String bodyNumber,int yearOfProd ,int seats ,
			int doors,boolean roof ,boolean alarm ,boolean central ,boolean airbag ,boolean autonomus,
			boolean navigator,boolean climate,int fuelTypeId,int fuelCapacity,double fuelConsumption,
			boolean hidraulic,String engineModel,double enginePower,int hoursePower,int maxspeed,
			double seconds0to100,boolean isAutomatic,int gears,String tireModel,int tireSize,String additionalDesc,
			boolean is4x4) throws SQLException{ 
		
		String query = "manufacturerId=? ,model=?,bodyNumber=?,yearOfProd=? ,seats=? ,\r\n" + 
				"			doors=?,roof=? ,alarm=? ,central=? ,airbag=? ,autonomus=?,\r\n" + 
				"			navigator=?,climate=?,fuelTypeId=?,fuelCapacity=?,fuelConsumption=? \r\n" + 
				"			hidraulic=?,engineModel=?,enginePower=?,hoursePower=?,maxspeed=?,\r\n" + 
				"			seconds0to100=?,isAutomatic=?,gears=?,tireModel=?,tireSize=?,additionalDesc=?,is4x4";
		PreparedStatement stm = DatabaseConfig.getConnection().prepareStatement(query);
		
		stm.setInt(1, manufacturerId);
		stm.setString(2,model);
		stm.setString(3,bodyNumber);
		stm.setInt(4,yearOfProd);
		stm.setInt(5,seats);
		stm.setInt(6, doors);
		stm.setBoolean(7, roof);
		stm.setBoolean(8,alarm);
		stm.setBoolean(9, central);
		stm.setBoolean(10,airbag);
		stm.setBoolean(11, autonomus);
		stm.setBoolean(12,navigator);
		stm.setBoolean(13, climate);
		stm.setInt(14,fuelTypeId);
		stm.setInt(15,fuelCapacity);
		stm.setDouble(16,fuelConsumption);
		stm.setBoolean(17,hidraulic);
		stm.setString(18,engineModel);
		stm.setDouble(19,enginePower);
		stm.setInt(20,hoursePower);
		stm.setInt(21,maxspeed);
		stm.setDouble(22,seconds0to100);
		stm.setBoolean(23,isAutomatic);
		stm.setInt(24,gears);
		stm.setString(25,tireModel);
		stm.setString(26,additionalDesc);
		stm.setBoolean(27,is4x4);
		
		return stm.executeUpdate() > 0;
	}
	
	
	
	public static boolean delete(int id) throws SQLException {
		String query = "delete from car where id = ?";
		PreparedStatement stm = DatabaseConfig.getConnection().prepareStatement(query);
		stm.setInt(1, id);
		return stm.executeUpdate() > 0;
		
		
	}
	

	
	
	public static boolean dataForTable(int seats ,
			int doors,boolean alarm 
			,boolean climate,
			boolean hidraulic,int hoursePower,int maxspeed,
			boolean isAutomatic) throws SQLException{ 
		
		 
		String query = "select p.path, c.seats, c.doors ,c.alarm,c.climate,c.hidraulic,c.hoursePower ,c.maxspeed, c.isAutomatic from car c";
		PreparedStatement stm = DatabaseConfig.getConnection().prepareStatement(query);
		
		stm.setInt(1,seats);
		stm.setInt(2, doors);
		stm.setBoolean(3,alarm);
		stm.setBoolean(4, climate);
		stm.setBoolean(5,hidraulic);
		stm.setInt(6,hoursePower);
		stm.setInt(7,maxspeed);
		stm.setBoolean(8,isAutomatic);
		
		return stm.executeUpdate() > 0;
	}
	
	
	
	
	
	public static List<Car> getBooks() throws SQLException {
		List<Car> carList = new ArrayList();
		
		String query = "select seats , doors , alarm , climate , hidraulic , hoursePower , maxspeed, isAutomatic from car  limit 10";
		
		PreparedStatement preparedStatement = DatabaseConfig.getConnection().prepareStatement(query);
		java.sql.ResultSet resultSet = preparedStatement.executeQuery();
			
		while(resultSet.next()) {

			Car car = new Car(resultSet.getInt(1),resultSet.getInt(2),resultSet.getBoolean(3)
					      ,resultSet.getBoolean(4),resultSet.getBoolean(5),resultSet.getInt(6),resultSet.getInt(7),resultSet.getBoolean(8)); 
					
			
			carList.add(car);
			
                  
             System.out.println(carList);		
		}
		
		return carList;

	}
	
	
	/*
	 * public static void city() throws SQLException { String query =
	 * "SELECT model , bodyNumber , engineModel  FROM Car limit 5";
	 * 
	 * PreparedStatement preparedStatement =
	 * DatabaseConfig.getConnection().prepareStatement(query); java.sql.ResultSet
	 * resultSet = preparedStatement.executeQuery();
	 * 
	 * while(resultSet.next()) { modelA.add(resultSet.getString(1));
	 * bodyNumberA.add(resultSet.getString(2));
	 * engineModelA.add(resultSet.getString(3)); }
	 * 
	 * 
	 * }
	 */ 
	
	
	
	
	
		public static void merriTeDhenat() throws SQLException {
			String query = "SELECT * From Car";
			
			PreparedStatement preparedStatement = DatabaseConfig.getConnection().prepareStatement(query);
			java.sql.ResultSet resultSet = preparedStatement.executeQuery();
				 
			while(resultSet.next()) {
				kerret.add(new Car(resultSet.getInt(1) , resultSet.getInt(2),resultSet.getString(3),resultSet.getString(4),resultSet.getInt(5),
						resultSet.getInt(6),resultSet.getInt(7),((resultSet.getInt(8) == 1) ? true : false),((resultSet.getInt(9) == 1) ? true : false),
						((resultSet.getInt(10) == 1) ? true : false),((resultSet.getInt(11) == 1) ? true : false),((resultSet.getInt(12) == 1) ? true : false),
						((resultSet.getInt(13) == 1) ? true : false),((resultSet.getInt(14) == 1) ? true : false),resultSet.getInt(15),resultSet.getInt(16),resultSet.getDouble(17),
						((resultSet.getInt(18) == 1) ? true : false),resultSet.getString(19),resultSet.getDouble(20),resultSet.getInt(21),resultSet.getInt(22),
						resultSet.getDouble(23),((resultSet.getInt(24) == 1) ? true : false),resultSet.getInt(25),resultSet.getString(26),resultSet.getInt(27),
						resultSet.getString(28),((resultSet.getInt(29) == 1) ? true : false)));
			}
		}
	
		
		
		
		public static Car getAllDetailsOfCar(int id) throws SQLException {
			String query = "SELECT * From Car WHERE id = " + id;
			PreparedStatement preparedStatement = DatabaseConfig.getConnection().prepareStatement(query);
			java.sql.ResultSet resultSet = preparedStatement.executeQuery();
			Car car = null;
			while(resultSet.next()) {
				car = new Car(resultSet.getInt(1) , resultSet.getInt(2),resultSet.getString(3),resultSet.getString(4),resultSet.getInt(5),
						resultSet.getInt(6),resultSet.getInt(7),((resultSet.getInt(8) == 1) ? true : false),((resultSet.getInt(9) == 1) ? true : false),
						((resultSet.getInt(10) == 1) ? true : false),((resultSet.getInt(11) == 1) ? true : false),((resultSet.getInt(12) == 1) ? true : false),
						((resultSet.getInt(13) == 1) ? true : false),((resultSet.getInt(14) == 1) ? true : false),resultSet.getInt(15),resultSet.getInt(16),resultSet.getDouble(17),
						((resultSet.getInt(18) == 1) ? true : false),resultSet.getString(19),resultSet.getDouble(20),resultSet.getInt(21),resultSet.getInt(22),
						resultSet.getDouble(23),((resultSet.getInt(24) == 1) ? true : false),resultSet.getInt(25),resultSet.getString(26),resultSet.getInt(27),
						resultSet.getString(28),((resultSet.getInt(29) == 1) ? true : false));
			}
			return car;
		}

		
		
		public static Car getSomeDetailsOfCar() throws SQLException {
			String query = "SELECT * From Car  ";
			PreparedStatement preparedStatement = DatabaseConfig.getConnection().prepareStatement(query);
			java.sql.ResultSet resultSet = preparedStatement.executeQuery();
			Car car = null;
			while(resultSet.next()) {
				car = new Car(resultSet.getInt(1) , resultSet.getInt(2),resultSet.getString(3),resultSet.getString(4),resultSet.getInt(5),
						resultSet.getInt(6),resultSet.getInt(7),((resultSet.getInt(8) == 1) ? true : false),((resultSet.getInt(9) == 1) ? true : false),
						((resultSet.getInt(10) == 1) ? true : false),((resultSet.getInt(11) == 1) ? true : false),((resultSet.getInt(12) == 1) ? true : false),
						((resultSet.getInt(13) == 1) ? true : false),((resultSet.getInt(14) == 1) ? true : false),resultSet.getInt(15),resultSet.getInt(16),resultSet.getDouble(17),
						((resultSet.getInt(18) == 1) ? true : false),resultSet.getString(19),resultSet.getDouble(20),resultSet.getInt(21),resultSet.getInt(22),
						resultSet.getDouble(23),((resultSet.getInt(24) == 1) ? true : false),resultSet.getInt(25),resultSet.getString(26),resultSet.getInt(27),
						resultSet.getString(28),((resultSet.getInt(29) == 1) ? true : false));
			}
			return car;
		}
		
		
		
		
		
		public static boolean addCar(int stockId,int manufacturerId ,String model,String bodyNumber,
				int yearOfProd,int seats ,int doors,
				boolean roof ,boolean alarm ,boolean central ,boolean airbag 
				,boolean autonomus,boolean navigator,boolean climate,
				int fuelTypeId,
				int fuelCapacity,
				double fuelConsumption,
				boolean hidraulic,
				String engineModel,
				double enginePower,
				int hoursePower,int maxspeed,
				double seconds0to100,
				boolean isAutomatic,
				int gears,
				String tireModel,
				int tireSize,
				String additionalDesc,
				boolean is4x4) throws SQLException {
			String query = "INSERT INTO car(manufacturerId ,model ,bodyNumber ,yearOfProd ,seats ,doors ,roof ,alarm ,central"
					+ "  ,airbag ,autonomus  ,navigator ,climate ,fuelTypeId ,fuelCapacity,  fuelConsumption,hidraulic  ,engineModel,"
					+ "enginePower ,hoursePower ,maxspeed ,seconds0to100 ,isAutomatic ,gears  ,tireModel  ,tireSize  ,additionalDesc ,"
					+ "is4x4\r\n" + 
					") VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
				PreparedStatement preparedStatement = DatabaseConfig.getConnection().prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
			
			//PreparedStatement preparedStatement = DatabaseConfig.getConnection().prepareStatement(query);
			
			
			    preparedStatement.setInt(1, manufacturerId);
				preparedStatement.setString(2,model);
				preparedStatement.setString(3,bodyNumber);
				preparedStatement.setInt(4,yearOfProd);
				preparedStatement.setInt(5,seats);
				preparedStatement.setInt(6, doors);
				preparedStatement.setBoolean(7, roof);
				preparedStatement.setBoolean(8,alarm);
				preparedStatement.setBoolean(9, central);
				preparedStatement.setBoolean(10,airbag);
				preparedStatement.setBoolean(11, autonomus);
				preparedStatement.setBoolean(12,navigator);
				preparedStatement.setBoolean(13, climate);
				preparedStatement.setInt(14,fuelTypeId);
				preparedStatement.setInt(15,fuelCapacity);
				preparedStatement.setDouble(16,fuelConsumption);
				preparedStatement.setBoolean(17,hidraulic);
				preparedStatement.setString(18,engineModel);
				preparedStatement.setDouble(19,enginePower);
				preparedStatement.setInt(20,hoursePower);
				preparedStatement.setInt(21,maxspeed);
				preparedStatement.setDouble(22,seconds0to100);
				preparedStatement.setBoolean(23,isAutomatic);
				preparedStatement.setInt(24,gears);
				preparedStatement.setString(25,tireModel);
				preparedStatement.setInt(26,tireSize);
				preparedStatement.setString(27,additionalDesc);
				preparedStatement.setBoolean(28,is4x4);
				
				
				preparedStatement.executeUpdate();
				//return (preparedStatement.executeUpdate() > 0);
				ResultSet success = preparedStatement.getGeneratedKeys();
				success.next();
				int carId = success.getInt(1);
				
				//Rrushja ka me vazhdu
				
				return true;
				
			}
		
		
		
		
		public static ObservableList<FuelType> getFuelTypes() throws SQLException {
			ObservableList<FuelType> carList = FXCollections.observableArrayList();
			
			String query = "select id , name  from fueltype ";
			
			PreparedStatement preparedStatement = DatabaseConfig.getConnection().prepareStatement(query);
			java.sql.ResultSet resultSet = preparedStatement.executeQuery();
				
			while(resultSet.next()) {

				FuelType fuelType = new FuelType(resultSet.getInt(1),resultSet.getString(2)); 
				carList.add(fuelType);
			
			}
			
			return carList;

		}
		
		
		// Return Price Of Car
		public  int returnPrice(int carId , int storeId) throws SQLException{
			int price=0;
			String query = "SELECT s2.price FROM Stores s inner join Stock s2 on s.id = s2.storeID where s2.carId =" + carId + " and storeId  = " + storeId ;   
			PreparedStatement preparedStatement = DatabaseConfig.getConnection().prepareStatement(query); 
			java.sql.ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				
				price=resultSet.getInt(1);
			}
			return price;
		}
		
		
		
		// Return path of photo Car
		
		public static String returnPhoto(int carId) throws SQLException{
			String result = "";
			String query = "SELECT path FROM photos WHERE carId = " + carId;

			PreparedStatement preparedStatement = DatabaseConfig.getConnection().prepareStatement(query); 
			java.sql.ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				
				result=resultSet.getString(1);
			}
			return result;
		}
		
		

		 
		
	
		


}
