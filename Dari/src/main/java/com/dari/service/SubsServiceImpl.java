package com.dari.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dari.repository.SubscribeRespository;

@Service

public class SubsServiceImpl implements SubsService  {

	@Autowired
	private SubscribeRespository subscribeRespository;
	
	
}

