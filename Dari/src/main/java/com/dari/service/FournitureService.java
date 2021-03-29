package com.dari.service;

import java.util.List;

import com.dari.model.FType;
import com.dari.model.Fourniture;

public interface FournitureService {

	long AddFour(Fourniture f);

	void deleteFour(long FournitureId);

	Fourniture findFourniture(long FournitureId);

	List<Fourniture> getallfourniture();
	
	//public FType checkfourstatusbyid (long FournitureId);
	
	//public float getfourniturepricebyid(long FournitureId);

}
