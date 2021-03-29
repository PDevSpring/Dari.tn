package com.dari.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dari.model.Commande;
import com.dari.model.CommandeStatus;
import com.dari.repository.CommandeRepository;

@Service
public class CommandeServiceImpl implements CommandeService{

	@Autowired 
	CommandeRepository commanderep;

	@Override
	public Commande addcommande(Commande c)
	{
		commanderep.save(c);
		return c;
	}
	
	@Override
	public void deletecommandebyId(long Commandeid)
	{
		commanderep.deleteById(Commandeid);
	}
	
	@Override
	public Commande findcommandebyId(long Commandeid) {
		return commanderep.findById(Commandeid).get();
	}
	
	@Override
	public List<Commande> findallcommandes() {
		return (List<Commande>) commanderep.findAll();
	}
	
	// SHIPPING COMMANDE
	
	@Override
	public Commande shipcommandebyid(long Commandeid)
	{	
		if( findcommandebyId(Commandeid).getStats() == CommandeStatus.Confirmed )
		{ 
			findcommandebyId(Commandeid).setStats(CommandeStatus.Shipped);	
		}
		return findcommandebyId(Commandeid);
	}
	
	
	// CLOSING COMMANDE
	
	@Override
	public Commande closecommandebyid(long Commandeid)
	{	
		if( findcommandebyId(Commandeid).getStats() == CommandeStatus.Shipped )
		{ 
			findcommandebyId(Commandeid).setStats(CommandeStatus.Done);	
		}
		return findcommandebyId(Commandeid);
	}

	
}
