package com.sjp.service;

import org.springframework.stereotype.Service;

import com.sjp.model.ShoppingBasket;
import com.sjp.serviceApi.MyService;

@Service("service")
public class MyServiceImpl implements MyService {
	private ShoppingBasket shoppingBasket;

	
	
	public ShoppingBasket getShoppingBasket() {
		return shoppingBasket;
	}



	public void setShoppingBasket(ShoppingBasket shoppingBasket) {
		this.shoppingBasket = shoppingBasket;
	}



	public void addItem() {
		shoppingBasket.addItem();
	}
}
