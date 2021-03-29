package com.dari.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.dari.model.Bank;

public interface BankRespository extends CrudRepository<Bank, Long> {

	//Bank getBankByNamebank (Bank bank) ;
	/*
   @Query(value = "SELECT * FROM t_banks WHERE namebank=?1",nativeQuery=true)
	Bank getBankByName(String Namebank);

    @Query(value = "SELECT * FROM t_banks WHERE idbank=?1",nativeQuery=true) 
	Bank getBankById(Long Idbank);
	
    
    @Query(value = "SELECT * FROM t_banks",nativeQuery=true) 
	List<Bank> getAllBanks();
*/	
	
	
    Bank findByNamebank(String Namebank);
	
}
