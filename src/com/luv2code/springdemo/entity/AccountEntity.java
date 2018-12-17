package com.luv2code.springdemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "userdetails")
public class AccountEntity {
	@Id
	@Column(name = "id")
	public int id;
	
	@Column(name = "firstname")
	public String firstname;
	
	@Column(name = "lastname")
	public String lastname;
	
	public AccountEntity()
	{
		
	}

	public AccountEntity(String firstname, String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	@Override
	public String toString() {
		return "AccountEntity [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + "]";
	}
	
	
	

}
