package com.dari.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import java.util.Date;

@Entity
public class Meeting {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int MeetingId ; 
	private Date date ; 
	private String WhithWho ; 
	
}
