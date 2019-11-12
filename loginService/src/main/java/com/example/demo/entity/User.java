package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="mokiUser")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

	@Id
	private long id;
	
	private String passWord;
	
	private String userType;
	
	
}
