package com.example.Categories.products.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table(name="Categories")
@Entity
public class Categories {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Cid;  
	private String shirts;
	private String pants;
	private String dresses;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="Cid")
	private Products products;
	
	public long getCid() {
		return Cid;
	}
	public void setCid(long cid) {
		Cid = cid;
	}
	public String getShirts() {
		return shirts;
	}
	public void setShirts(String shirts) {
		this.shirts = shirts;
	}
	public String getPants() {
		return pants;
	}
	public void setPants(String pants) {
		this.pants = pants;
	}
	public String getDresses() {
		return dresses;
	}
	public void setDresses(String dresses) {
		this.dresses = dresses;
	}
	public Products getProducts() {
		return products;
	}
	public void setProducts(Products products) {
		this.products = products;
	}

}
