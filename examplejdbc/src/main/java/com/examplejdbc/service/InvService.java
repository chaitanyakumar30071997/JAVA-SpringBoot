package com.examplejdbc.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class InvService {
	@Autowired
    @Qualifier("invJdbcTemplate")
    private JdbcTemplate invJdbcTemplate;

    public List<Map<String, Object>> getAllInv() {
        return invJdbcTemplate.queryForList(" select * from mobile_phones");
    }

}
