package com.dari.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ads {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long AdID ; 
	
	private String Object ; 
	private String Description ; 
	private String location ; 
	private String ServiceType ; 
	private  String image1 ;
	private  String image2 ;
	private  String image3 ;
	private  String image4 ;
	private  String image5 ;
	private  String image6 ;
	private  String image7 ;
	private  String image8 ;
	private  String image9 ;
	private  String image10 ;
	private int RoomsNb ; 
	private int BathroomsNb ; 
	private int Surface ; 
	private int BalconiesNb ; 
	private int GaragesNb ;
	private int Price ; 
	
	private Boolean AirConditioner ; 
	private Boolean Heater ; 
	private Boolean SwimmingPool ; 
	private Boolean Garden ; 
	private Boolean Furnished ;
	
	private String type ;

	public Ads() {
		super();
	}

	public Ads(String object, String description, String location, String serviceType, String image1, String image2,
			String image3, String image4, String image5, String image6, String image7, String image8, String image9,
			String image10, int roomsNb, int bathroomsNb, int surface, int balconiesNb, int garagesNb, int price,
			Boolean airConditioner, Boolean heater, Boolean swimmingPool, Boolean garden, Boolean furnished,
			String type) {
		super();
		Object = object;
		Description = description;
		this.location = location;
		ServiceType = serviceType;
		this.image1 = image1;
		this.image2 = image2;
		this.image3 = image3;
		this.image4 = image4;
		this.image5 = image5;
		this.image6 = image6;
		this.image7 = image7;
		this.image8 = image8;
		this.image9 = image9;
		this.image10 = image10;
		RoomsNb = roomsNb;
		BathroomsNb = bathroomsNb;
		Surface = surface;
		BalconiesNb = balconiesNb;
		GaragesNb = garagesNb;
		Price = price;
		AirConditioner = airConditioner;
		Heater = heater;
		SwimmingPool = swimmingPool;
		Garden = garden;
		Furnished = furnished;
		this.type = type;
	}

	public long getAdID() {
		return AdID;
	}

	public void setAdID(long adID) {
		AdID = adID;
	}

	public String getObject() {
		return Object;
	}

	public void setObject(String object) {
		Object = object;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getServiceType() {
		return ServiceType;
	}

	public void setServiceType(String serviceType) {
		ServiceType = serviceType;
	}

	public String getImage1() {
		return image1;
	}

	public void setImage1(String image1) {
		this.image1 = image1;
	}

	public String getImage2() {
		return image2;
	}

	public void setImage2(String image2) {
		this.image2 = image2;
	}

	public String getImage3() {
		return image3;
	}

	public void setImage3(String image3) {
		this.image3 = image3;
	}

	public String getImage4() {
		return image4;
	}

	public void setImage4(String image4) {
		this.image4 = image4;
	}

	public String getImage5() {
		return image5;
	}

	public void setImage5(String image5) {
		this.image5 = image5;
	}

	public String getImage6() {
		return image6;
	}

	public void setImage6(String image6) {
		this.image6 = image6;
	}

	public String getImage7() {
		return image7;
	}

	public void setImage7(String image7) {
		this.image7 = image7;
	}

	public String getImage8() {
		return image8;
	}

	public void setImage8(String image8) {
		this.image8 = image8;
	}

	public String getImage9() {
		return image9;
	}

	public void setImage9(String image9) {
		this.image9 = image9;
	}

	public String getImage10() {
		return image10;
	}

	public void setImage10(String image10) {
		this.image10 = image10;
	}

	public int getRoomsNb() {
		return RoomsNb;
	}

	public void setRoomsNb(int roomsNb) {
		RoomsNb = roomsNb;
	}

	public int getBathroomsNb() {
		return BathroomsNb;
	}

	public void setBathroomsNb(int bathroomsNb) {
		BathroomsNb = bathroomsNb;
	}

	public int getSurface() {
		return Surface;
	}

	public void setSurface(int surface) {
		Surface = surface;
	}

	public int getBalconiesNb() {
		return BalconiesNb;
	}

	public void setBalconiesNb(int balconiesNb) {
		BalconiesNb = balconiesNb;
	}

	public int getGaragesNb() {
		return GaragesNb;
	}

	public void setGaragesNb(int garagesNb) {
		GaragesNb = garagesNb;
	}

	public int getPrice() {
		return Price;
	}

	public void setPrice(int price) {
		Price = price;
	}

	public Boolean getAirConditioner() {
		return AirConditioner;
	}

	public void setAirConditioner(Boolean airConditioner) {
		AirConditioner = airConditioner;
	}

	public Boolean getHeater() {
		return Heater;
	}

	public void setHeater(Boolean heater) {
		Heater = heater;
	}

	public Boolean getSwimmingPool() {
		return SwimmingPool;
	}

	public void setSwimmingPool(Boolean swimmingPool) {
		SwimmingPool = swimmingPool;
	}

	public Boolean getGarden() {
		return Garden;
	}

	public void setGarden(Boolean garden) {
		Garden = garden;
	}

	public Boolean getFurnished() {
		return Furnished;
	}

	public void setFurnished(Boolean furnished) {
		Furnished = furnished;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	} 
	
		

}
