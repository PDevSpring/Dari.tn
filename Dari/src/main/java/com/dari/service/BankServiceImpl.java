package com.dari.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dari.model.Bank;
import com.dari.repository.BankRespository;

@Service
public class BankServiceImpl implements BankService {

	@Autowired
	private BankRespository bankRespository;
	
	
	@Override
	public List<Bank> getAllBank() {
		List<Bank> bank = (List<Bank>) bankRespository.findAll();
		return bank ; 
	}
	
	
	public long addbank(Bank bank) {
		bankRespository.save(bank);
		return bank.getIdbank();
		
	}
	
	
	public Bank updateBank (Bank bank) {
		return bankRespository.save(bank);
	}
	
	@Override
	public void deleteBankByID(Long bankID) {
		Bank bank = bankRespository.findById(bankID).get();
		bankRespository.delete(bank);
		
	}
	

	@Override
	public Bank getBankByName(String nameBank) {
		return  bankRespository.findByNamebank(nameBank);
		
	}
	
	@Override
	public Bank getBankById(Long id) {	
		Bank bank = bankRespository.findById(id).get();
		return bank;
		
	}
	
	
}
