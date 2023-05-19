package com.academy.fincons.entity;
import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "USERS")
public class Users implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = -1705756593665898246L;

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
    public Integer id;
     
    @Column(name="name")
    public String name;
     
    @Column(name="surname")
    public String surname;
    
    @Column(name="email")
    public String email;
    
    @Column(name="phone")
    public String phone;
    
    

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
 
	

}
