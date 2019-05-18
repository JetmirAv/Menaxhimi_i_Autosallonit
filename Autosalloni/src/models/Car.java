package models;
import java.util.Date;
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
			
			public Car(int id ,int manufacturerId ,String model,String bodyNumber,int yearOfProd ,int seats ,
					int doors,boolean roof ,boolean alarm ,boolean central ,boolean airbag ,boolean autonomus,
					boolean navigator,boolean climate,int fuelTypeId,int fuelCapacity,double fuelConsumption,
					boolean hidraulic,String engineModel,double enginePower,int hoursePower,int maxspeed,
					double seconds0to100,boolean isAutomatic,int gears,String tireModel,int tireSize,String additionalDesc,
					boolean is4x4 ,String createdAt,String updatetimedAt) {
				this.id=id;
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
				this.createdAt= new Date();
				this.updatetimedAt=new Date();			
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
			}


