package com.dari.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Purshases {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int PurshaseId ; 
	private float Price ; 

}
