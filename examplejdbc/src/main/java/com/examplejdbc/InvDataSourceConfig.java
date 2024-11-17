package com.examplejdbc;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
public class InvDataSourceConfig {
	
	@ConfigurationProperties("spring.datasource.inv.*")
	@Bean(name = "invDataSource")
    public DataSource invDataSource() {
        return DataSourceBuilder.create()
                .url("jdbc:mysql://localhost:3306/inv")
                .username("root")
                .password("admin")
                .driverClassName("com.mysql.cj.jdbc.Driver")
                .build();
    }

    @Bean(name = "invJdbcTemplate")
    public JdbcTemplate invJdbcTemplate(@Qualifier("invDataSource") DataSource invDataSource) {
        return new JdbcTemplate(invDataSource);
    }

}
