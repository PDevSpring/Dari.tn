package com.dari.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import com.dari.model.CommandeStatus;
import com.dari.model.Delivery;
import com.dari.model.Cart;

@Entity
@Table(name = "T_Commande")
public class Commande implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "Com_ID")
	private long comId;
	
	@Column(name = "Com_stts")
	@Enumerated(EnumType.STRING)
	private CommandeStatus stats;
	
	@ManyToOne
	private Delivery delivery;
	
	@OneToOne
	private Cart cart;

	
	
	public Commande() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Commande(int comId, CommandeStatus stats, Delivery delivery, Cart cart) {
		super();
		this.comId = comId;
		this.stats = stats;
		this.delivery = delivery;
		this.cart = cart;
	}

	public long getComId() {
		return comId;
	}

	public void setComId(int comId) {
		this.comId = comId;
	}

	public CommandeStatus getStats() {
		return stats;
	}

	public void setStats(CommandeStatus stats) {
		this.stats = stats;
	}

	public Delivery getDelivery() {
		return delivery;
	}

	public void setDelivery(Delivery delivery) {
		this.delivery = delivery;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}
	
	
	
}
