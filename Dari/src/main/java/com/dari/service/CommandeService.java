package com.dari.service;

import java.util.List;

import com.dari.model.Commande;

public interface CommandeService {

	Commande addcommande(Commande c);
	public List<Commande> findallcommandes();
	
	public Commande findcommandebyId(long Commandeid);

	public void deletecommandebyId(long Commandeid);
	public Commande shipcommandebyid(long Commandeid);
	public Commande closecommandebyid(long Commandeid);

}
