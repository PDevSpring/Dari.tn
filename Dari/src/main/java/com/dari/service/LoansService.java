package com.dari.service;
import java.util.List;
import com.dari.model.LoansSimulationBank;

public interface LoansService {
////collecte des donnesssss ////

	List<LoansSimulationBank> getAllLoans();

	List<LoansSimulationBank> getAllLoansByCin(Long cin);

	List<LoansSimulationBank> getAllLoansByNameBank(String nameBank);

	LoansSimulationBank getLoansById(Long id);

	void confirmLoan(Long idloan);

	void unConfirmLoan(Long idloan);

	LoansSimulationBank approcheLoan();

	void deleteLoansByCin(Long cin);

	void deleteLoanById(Long id);

	
	
	
	////Calcule des simulations ////


}
