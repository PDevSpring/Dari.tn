package com.dari.model;

import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Subscribe {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Subid ; 
	
	@Enumerated(EnumType.STRING)
	private SubscribeType subscribeType;
	
	@Enumerated(EnumType.STRING)
	private SubscribePeriod subscribeperiod;

	private Date substartdate;
	private Date subenddate;

	
	public Subscribe() {
		super();
	}

	public Subscribe(Date startDate, Date endDate, SubscribeType subscribetype, SubscribePeriod subscribeperiod) {
		super();
		substartdate = startDate;
		subenddate = endDate;
		this.subscribeType = subscribetype;
		this.subscribeperiod= subscribeperiod;
	}
	
	

	public int getSubid() {
		return Subid;
	}

	public void setSubid(int subid) {
		Subid = subid;
	}
	@Override
	public String toString() {
		return "Subscribe [StartDate=" + substartdate + ", EndDate=" + subenddate + ", subscribetype=" + subscribeType + ",subscribeperiod=" + subscribeperiod+" ]";
	}

}