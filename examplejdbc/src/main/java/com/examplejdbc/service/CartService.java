package com.examplejdbc.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service

public class CartService {

	    @Autowired
	    @Qualifier("cartJdbcTemplate")
	    private JdbcTemplate cartJdbcTemplate;

	    public List<Map<String, Object>> getAllCartItems() {
	        return cartJdbcTemplate.queryForList("select * from dell_laptops");
	    }

}
