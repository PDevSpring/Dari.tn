package com.dari.service;

import javax.mail.MessagingException;

import org.springframework.mail.MailException;

import com.dari.model.Agent;

import com.dari.model.User;



public interface MailingService {

	

	public void Send(User user);

}
