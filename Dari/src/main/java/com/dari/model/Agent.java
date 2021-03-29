package com.dari.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import com.dari.model.Bank;

@Entity
public class Agent  {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id;
	private String Firstname;
	private String Lastname;
	private Date datenaissance;
	private String Email;
	private String Password;
	private int Phone;
	private String Adress;
	
	@JsonManagedReference
	@OneToMany(cascade = CascadeType.ALL,fetch=FetchType.LAZY, mappedBy="agentB")
	private Set<Bank> banks;
	
	
	public Agent() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Agent(long id, String firstname, String lastname, Date datenaissance, String email, String password,
			int phone, String adress, Set<Bank> banks) {
		super();
		Id = id;
		Firstname = firstname;
		Lastname = lastname;
		this.datenaissance = datenaissance;
		Email = email;
		Password = password;
		Phone = phone;
		Adress = adress;
		this.banks = banks;
	}



	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public String getFirstname() {
		return Firstname;
	}

	public void setFirstname(String firstname) {
		Firstname = firstname;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getLastname() {
		return Lastname;
	}

	public void setLastname(String lastname) {
		Lastname = lastname;
	}

	public Date getDatenaissance() {
		return datenaissance;
	}

	public void setDatenaissance(Date datenaissance) {
		this.datenaissance = datenaissance;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getAdress() {
		return Adress;
	}

	public void setAdress(String adress) {
		Adress = adress;
	}

	public int getPhone() {
		return Phone;
	}

	public void setPhone(int phone) {
		Phone = phone;
	}	
	
	public Set<Bank> getBanks() {
		return banks;
	}
	
	public void setBanks(Set<Bank> banks) {
		this.banks = banks;
	}

}
