package com.dari.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="tDelivery")
public class Delivery implements Serializable {

	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "DEL_ID")
	private int deliveryId;
	
	@Column(name = "DEL_NAME")
	private String name;
	
	@Column(name = "DEL_ADR")
	private String adress;
	
	@Column(name = "DEL_INFO")
	private String moreinfo;
	
	//@OneToMany
	//private Commande commande;

	
	
	
	public Delivery() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Delivery(int deliveryId, String name, String adress, String moreinfo, Commande commande) {
		super();
		this.deliveryId = deliveryId;
		this.name = name;
		this.adress = adress;
		this.moreinfo = moreinfo;
		//this.Commande = commande;
	}

	public int getDeliveryId() {
		return deliveryId;
	}

	public void setDeliveryId(int deliveryId) {
		this.deliveryId = deliveryId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getMoreinfo() {
		return moreinfo;
	}

	public void setMoreinfo(String moreinfo) {
		this.moreinfo = moreinfo;
	}

	/*public Commande getCommande() {
		return Commande;
	}

	public void setCommande(Commande commande) {
		this.Commande = commande;
	}*/

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
