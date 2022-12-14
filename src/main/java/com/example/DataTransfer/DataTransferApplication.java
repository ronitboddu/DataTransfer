package com.example.DataTransfer;

import com.example.DataTransfer.model.Actor;
import com.example.DataTransfer.model.ActorRowMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;
import java.sql.SQLException;
import java.util.List;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class DataTransferApplication {

	public static void main(String[] args) throws SQLException {
		SpringApplication.run(DataTransferApplication.class, args);
		SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
		dataSource.setDriver(new com.mysql.cj.jdbc.Driver());
		dataSource.setUrl("jdbc:mysql://localhost:3306/sakila");
		dataSource.setUsername("root");
		dataSource.setPassword("Ragnar@201997");

		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		String sqlSelect = "SELECT * FROM actor LIMIT 10";

		List<Actor> actorList = jdbcTemplate.query(sqlSelect, new ActorRowMapper());
		actorList.forEach(System.out::println);
		System.exit(0);
	}

}
