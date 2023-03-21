package com.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class EmployeeMysqlApplication implements CommandLineRunner {
	
	@Autowired
    private JdbcTemplate jdbcTemplate;

	public static void main(String[] args) {
		SpringApplication.run(EmployeeMysqlApplication.class, args);
	}
	
	
	@Override
    public void run(String... args) throws Exception {
        String sql = "INSERT INTO Employee(id, name, age) VALUES (?, ?, ?)";
         
       
         jdbcTemplate.update(sql, "1", "vijaykanth", "22");
         jdbcTemplate.update(sql, "2", "kartheek", "23");
         
       
         
    }

}


 
