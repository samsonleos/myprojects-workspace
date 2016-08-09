package com.pass.rec.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="USERS")
public class User {

	@Id
	@SequenceGenerator(name="USER_SEQ_GEN", sequenceName="USERS_SEQ", allocationSize=1)
	  @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="USER_SEQ_GEN")
	@Column(name="USER_ID", unique=true, nullable=false)
	private Long id;
	
	@Column(name="USER_LGN_NM", unique=true, nullable=false)	
    private String userName;
	
	@Column(name="USER_PSWD", nullable=false)
    private String password;
	
	@Column(name="USER_EMAIL", nullable=false)
    private String email;
	
	@Column(name="USER_NM_FST", nullable=false)
	private String firstName;
	
	@Column(name="USER_NM_LST", nullable=false)
	private String lastName;
	
	@Column(name="USER_DRV_UPCS_NM", nullable=false)
	private String upcsName;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
    
	public String getUpcsName() {
		return upcsName;
	}
	
	public void setUpcsName(String upcsName) {
		this.upcsName = upcsName;
	}
    
}
