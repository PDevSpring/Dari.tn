package com.dari.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



import com.fasterxml.jackson.annotation.JsonBackReference;

import com.dari.model.Agent;

@Entity
@Table(name = "T_BANKS")
public class Bank {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idbank")
	public Long Idbank;
	
	@Column(name="namebank")
	public String Namebank;
	
	@Column(name="descbank")
	public String Descbank;
	
	@Column(name="adressbank")
	public String Adressbank;
	
	@Column(name="Mibank")
	public String MargeInteretbank;
	
	@Column(name="tauxbank")
	private float Taux;

	 
	@JsonBackReference
	@ManyToOne
	Agent agentB;
	
	public Bank() {
		super();
	}
	
	public Bank(long Idbank, String Namebank,String Descbank,String Adressbank,String MargeInteretbank, float Taux) {
	
		super();
		this.Idbank= Idbank;
		this.Namebank = Namebank ;
		this.Adressbank = Adressbank ;
		this.Descbank = Descbank;
		this.MargeInteretbank = MargeInteretbank;
		this.Taux=Taux;
		
	}


	public Long getIdbank() {
		return Idbank;
	}
	public void setIdbank(Long idbank) {
		Idbank = idbank;
	}
	public String getNamebank() {
		return Namebank;
	}
	public void setNamebank(String namebank) {
		Namebank = namebank;
	}
	public String getDescbank() {
		return Descbank;
	}
	public void setDescbank(String descbank) {
		Descbank = descbank;
	}
	public String getAdressbank() {
		return Adressbank;
	}
	public void setAdressbank(String adressbank) {
		Adressbank = adressbank;
	}
    public String getMargeInteretbank() {
		return MargeInteretbank;
	}
    public void setMargeInteretbank(String margeInteretbank) {
		MargeInteretbank = margeInteretbank;
	}

	public float getTaux() {
		return Taux;
	}

	public void setTaux(float taux) {
		Taux = taux;
	}
}

