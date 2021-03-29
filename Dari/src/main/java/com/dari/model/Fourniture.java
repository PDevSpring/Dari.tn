package com.dari.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.dari.model.FType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.dari.model.Cart;

@Entity
@Table(name = "TFourniture")
public class Fourniture {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "F_ID")
	private long FournitureId ;
	
	@Column(name = "F_Type")
	@Enumerated(EnumType.STRING)
	private FType type;
	
	@Column(name = "F_Desc")
	private String Description ; 
	
	@Column(name = "F_Price")
	private float Price ;
	
	@Column(name = "F_PubDate")
	private Date pubDate;
	
	private String Image1 ; 
	private String Image2 ; 
	
	/*
	@JsonIgnore
	@OneToMany(mappedBy="Fourniture", cascade = CascadeType.ALL,fetch=FetchType.LAZY)
    private List<Cart> cart;
	
	public List<Cart> getCart() {
		return cart;
	}

	public void setCart(List<Cart> cart) {
		this.cart = cart;
	}

	*/
	public Fourniture() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Fourniture(int fournitureId, FType type, String description, float price, Date pubDate, String image1,
			String image2) {
		super();
		FournitureId = fournitureId;
		this.type = type;
		Description = description;
		Price = price;
		this.pubDate = pubDate;
		Image1 = image1;
		Image2 = image2;
		
	}

	public long getFournitureId() {
		return FournitureId;
	}

	public void setFournitureId(int fournitureId) {
		FournitureId = fournitureId;
	}

	public FType getType() {
		return type;
	}

	public void setType(FType type) {
		this.type = type;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public float getPrice() {
		return Price;
	}

	public void setPrice(float price) {
		Price = price;
	}

	public Date getPubDate() {
		return pubDate;
	}

	public void setPubDate(Date pubDate) {
		this.pubDate = pubDate;
	}

	public String getImage1() {
		return Image1;
	}

	public void setImage1(String image1) {
		Image1 = image1;
	}

	public String getImage2() {
		return Image2;
	}

	public void setImage2(String image2) {
		Image2 = image2;
	}

	
	
}

