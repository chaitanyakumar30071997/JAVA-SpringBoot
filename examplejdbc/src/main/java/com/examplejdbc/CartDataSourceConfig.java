package com.examplejdbc;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
public class CartDataSourceConfig {
      
	    @ConfigurationProperties("spring.datasource.cart.*")
	    @Bean(name = "cartDataSource")
	    public DataSource cartDataSource() {
	        return DataSourceBuilder.create()
	                .url("jdbc:mysql://localhost:3306/cart")
	                .username("root123")
	                .password("nihal123")
	                .driverClassName("com.mysql.cj.jdbc.Driver")
	                .build();
	    }

	    @Bean(name = "cartJdbcTemplate")
	    public JdbcTemplate cartJdbcTemplate(@Qualifier("cartDataSource") DataSource cartDataSource) {
	        return new JdbcTemplate(cartDataSource);
	    }

}
