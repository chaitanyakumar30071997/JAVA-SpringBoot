package com.examplejdbc.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examplejdbc.service.CartService;

@RestController
@RequestMapping("/api/cart")
public class CartController {
	
	    @Autowired
	    private CartService cartService;

	    @GetMapping
	    public List<Map<String, Object>> getAllCartItems() {
	        return cartService.getAllCartItems();
	    }

}
