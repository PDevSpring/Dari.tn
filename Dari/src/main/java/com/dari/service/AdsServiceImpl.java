package com.dari.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dari.model.Ads;
import com.dari.repository.AdsRepository;

@Service
public class AdsServiceImpl implements AdsService {
	
	@Autowired
	private AdsRepository adsRepository ; 
	
	@Override
	public String AddAd(Ads ad) {
		ad.setType("advertissement");
		adsRepository.save(ad);
		return "Ad Added"; 
	}
	
	@Override
	public String AddReq(Ads ad) {
		ad.setType("Request");
		adsRepository.save(ad);
		return "Request Added"; 
	}
	

}
