package com.sjp.model;

import java.io.Serializable;

public class ShoppingBasket implements Serializable {
	private int numItems;
	
	public ShoppingBasket() {
	}
	
	public int getNumItems() {
		return numItems;
	}
	
	public void addItem() {
		numItems++;
	}
}
