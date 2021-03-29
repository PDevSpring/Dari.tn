package com.dari.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.dari.model.LoansSimulationBank;

public interface LoansRepository  extends CrudRepository <LoansSimulationBank, Long>{

	@Query(value = "SELECT * FROM t_loan l join user u on l.client_id=u.id  WHERE dtype='Client' and u.cin=?1",nativeQuery=true)
	List<LoansSimulationBank> getAllLoansByCin(Long cin);

	@Query(value="SELECT * FROM t_loan l join t_bank b on l.bank_id_bank=b.id_bank WHERE b.name_bank=?1",nativeQuery=true)
	List<LoansSimulationBank> getAllLoansByNameBank(String namebank);

	@Modifying
	@Transactional
	@Query(value="DELETE FROM t_loan JOIN user u WHERE u.cin=?1 AND u.dtype='Client'",nativeQuery=true)
	void deleteAllLoansByCin(Long cin);

	
	
	@Modifying
	@Transactional
	@Query(value="DELETE FROM t_loan WHERE id_loan=?1",nativeQuery=true)
	void delete(Long id);

}





