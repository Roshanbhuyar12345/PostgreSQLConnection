package com.postgresql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.postgresql.dao.StudentDao;

@SpringBootApplication
public class PostgresqlConnectApplication implements CommandLineRunner{

	@Autowired
	private StudentDao stud;
	
	public static void main(String[] args) {
		SpringApplication.run(PostgresqlConnectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
	//	this.stud.createTable();
		
		this.stud.insertingData("Sameer khan", "Lakhnow");
		
	}

}
