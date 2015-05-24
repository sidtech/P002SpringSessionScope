package com.sjp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sjp.model.ShoppingBasket;
import com.sjp.serviceApi.MyService;

@Controller
public class MyController {
	private String SHOPPING_CART_KEY = "shoppingBasket";
	
	private MyService service;

	public MyService getService() {
		return service;
	}

	public void setService(MyService service) {
		this.service = service;
	}
	
	@RequestMapping("/viewbasket.do")
	public ModelMap viewCart() {
		return new ModelMap(SHOPPING_CART_KEY, service.getShoppingBasket());
	}
	
	@RequestMapping("/additem.do")
	public ModelAndView addItem() {
		service.addItem();
		ShoppingBasket cart = service.getShoppingBasket();
		return new ModelAndView("/viewbasket", SHOPPING_CART_KEY, cart);
	}
}
