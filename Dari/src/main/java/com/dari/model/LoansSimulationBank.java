package com.dari.model;

import java.util.Date;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.dari.model.Bank;
import com.dari.model.User;
import com.dari.model.Agent;





@Entity
public class LoansSimulationBank implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long IdLoan;
	private double Taux;
	private double Mensuel;
	private double Capacite;
	private double Interet;
	private double Interetall;
	private double Mensualite;
	private double Principale;
	private double MontantRemb;
	private double Prixprod;
	private double Salaire;
	private String Status;
	private Date StartedDate;
	
	@ManyToOne
	Bank bank;
	
	@ManyToOne
	User user;
	
	@ManyToOne
	Agent agent;
	
	
	
	
	public LoansSimulationBank(long idLoan, double taux, double mensuel, double capacite, double interet,
			double interetall, double mensualite, double principale, double montantRemb, double prixprod,
			double salaire, String status, Date startedDate, Bank bank, User user,Agent agent) {
		super();
		IdLoan = idLoan;
		Taux = taux;
		Mensuel = mensuel;
		Capacite = capacite;
		Interet = interet;
		Interetall = interetall;
		Mensualite = mensualite;
		Principale = principale;
		MontantRemb = montantRemb;
		Prixprod = prixprod;
		Salaire = salaire;
		Status = status;
		StartedDate = startedDate;
		this.bank = bank;
		this.user = user;
		this.agent=agent;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Agent getAgent() {
		return agent;
	}

	public void setAgent(Agent agent) {
		this.agent = agent;
	}

	public LoansSimulationBank() {
		super();
	}

	public long getIdLoan() {
		return IdLoan;
	}

	public void setIdLoan(long idLoan) {
		IdLoan = idLoan;
	}

	public double getTaux() {
		return Taux;
	}

	public void setTaux(double taux) {
		Taux = taux;
	}

	public double getMensuel() {
		return Mensuel;
	}

	public void setMensuel(double mensuel) {
		Mensuel = mensuel;
	}

	public double getCapacite() {
		return Capacite;
	}

	public void setCapacite(double capacite) {
		Capacite = capacite;
	}

	public double getInteret() {
		return Interet;
	}

	public void setInteret(double interet) {
		Interet = interet;
	}

	public double getInteretall() {
		return Interetall;
	}

	public void setInteretall(double interetall) {
		Interetall = interetall;
	}

	public double getMensualite() {
		return Mensualite;
	}

	public void setMensualite(double mensualite) {
		Mensualite = mensualite;
	}

	public double getPrincipale() {
		return Principale;
	}

	public void setPrincipale(double principale) {
		Principale = principale;
	}

	public double getMontantRemb() {
		return MontantRemb;
	}

	public void setMontantRemb(double montantRemb) {
		MontantRemb = montantRemb;
	}

	public double getPrixprod() {
		return Prixprod;
	}

	public void setPrixprod(double prixprod) {
		Prixprod = prixprod;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public Date getStartedDate() {
		return StartedDate;
	}

	public void setStartedDate(Date startedDate) {
		StartedDate = startedDate;
	}

	public double getSalaire() {
		return Salaire;
	}

	public void setSalaire(double salaire) {
		Salaire = salaire;
	}

	
	public Bank getBank() {
		return bank;
	}

	public void setBank(Bank bank) {
		this.bank = bank;
	}
}
