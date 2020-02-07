package com.cts.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product2 implements Serializable{
	@Id
	Integer prodId;
	String prodName;
//	@Column(name="prodQuantity")
	Integer prodquantity;
	//@Column(name="prodPrice")
	Float prodprice;
	
	
	public Product2(Integer prodId, String prodName, Integer prodquantity, Float prodprice) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.prodquantity = prodquantity;
		this.prodprice = prodprice;
	}
	
	
	public Product2() {
		
	}


	public Integer getProdId() {
		return prodId;
	}
	public void setProdId(Integer prodId) {
		this.prodId = prodId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public Integer getProdquantity() {
		return prodquantity;
	}
	public void setProdquantity(Integer prodquantity) {
		this.prodquantity = prodquantity;
	}
	public Float getProdprice() {
		return prodprice;
	}
	public void setProdprice(Float prodprice) {
		this.prodprice = prodprice;
	}


	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", prodName=" + prodName + ", prodquantity=" + prodquantity
				+ ", prodprice=" + prodprice + "]";
	}
	
	
}
