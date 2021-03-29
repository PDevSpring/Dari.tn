package com.dari.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "T_Cart")
public class Cart implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int CartId ; 
	
	@Column(name = "Number_fur")
	private int NumberFur;
	
	@Column(name = "Totalpri")
	private float Totalpri ; 
	
	@ManyToOne
	private Fourniture article;
	
	
	@OneToOne(mappedBy="cart")
	private Commande commande;

	
	

	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Cart(int cartId, int numberFur, float totalpri, Fourniture article, Commande commande) {
		super();
		CartId = cartId;
		NumberFur = numberFur;
		Totalpri = totalpri;
		this.article = article;
		this.commande = commande;
	}



	public int getCartId() {
		return CartId;
	}


	public void setCartId(int cartId) {
		CartId = cartId;
	}


	public int getNumberFur() {
		return NumberFur;
	}


	public void setNumberFur(int numberFur) {
		NumberFur = numberFur;
	}


	public float getTotalpri() {
		return Totalpri;
	}


	public void setTotalpri(float totalpri) {
		Totalpri = totalpri;
	}


	public Fourniture getArticle() {
		return article;
	}


	public void setArticle(Fourniture article) {
		this.article = article;
	}


	public Commande getCommande() {
		return commande;
	}


	public void setCommande(Commande commande) {
		this.commande = commande;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
