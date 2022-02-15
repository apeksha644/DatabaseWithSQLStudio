package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import ch.qos.logback.core.joran.action.Action;

@SpringBootApplication
public class SpringAppConnectSqlApplication  implements CommandLineRunner{

	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringAppConnectSqlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		String sql = "select * from Car";
		List<Car>student=jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Car.class));
		
		student.forEach(System.out::println);
		
	}

}
