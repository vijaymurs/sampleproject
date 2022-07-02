package com.sampleproject.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Vijayakumar
 *
 */
@Getter
@Setter
@Entity
@Table(name = "users")
public class UserEntity {
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer userId;
	
	
	@Column(name="username", length=50, nullable=false, unique=true)
	public String username;
	
	@Column(name="passwords", length=50, nullable=false, unique=false)
	public String passwords;
	
	@Column(name="first_name", length=50, nullable=false, unique=false)
	public String firstName;
	
	@Column(name="last_name", length=50, nullable=false, unique=false)
	public String lastName;
	
	@Column(name="email", length=255, nullable=false, unique=false)
	public String email;
	
}
