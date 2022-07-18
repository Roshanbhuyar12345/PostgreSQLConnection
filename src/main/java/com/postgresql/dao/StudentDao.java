package com.postgresql.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDao {

	@Autowired
	private JdbcTemplate jdbcTemp;
	
	
	//creating table
	public void createTable() {
		
		String query="CREATE TABLE student(id SERIAL PRIMARY KEY, name VARCHAR(225) NOT NULL, city VARCHAR(225))";
		
		int update=this.jdbcTemp.update(query);
		
		System.out.println(update + "created");
	}
	
	//inserting data
	public void insertingData(String name,String city) {
		
		String q="insert into student(name,city) values(?,?)";
		
		int update= this.jdbcTemp.update(q,name,city);
		
		System.out.println(update+" row added ");
	}
	
	
}
