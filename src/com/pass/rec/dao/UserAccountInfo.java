package com.pass.rec.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
@Table(name="USERS_ACCOUNT_INFO")
public class UserAccountInfo {
	
	@Id
	@Column(name="USER_ACC_INFO_ID", nullable=false, unique=true)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="USER_ACC_INFO_SEQ_GEN")
	@SequenceGenerator(name="USER_ACC_INFO_SEQ_GEN", sequenceName="USER_ACC_INFO_SEQ")
	private Long userAccId;
	
	@OneToOne
	@JoinColumn(name="ACC_TYP_ID")
	private AccountType accountType;
	
	@Column(name="ACC_LGN_NM")
	private String accountLoginName;
	
	@Column(name="ACC_PSWD")
	private String accountPassword;
	
	@Column(name="ACC_MAIL_ID")
	private String accountMailId;
	
	@OneToOne
	@JoinColumn(name="user_id")
	private User user;
	
	public Long getUserAccId() {
		return userAccId;
	}
	public void setUserAccId(Long userAccId) {
		this.userAccId = userAccId;
	}
	
	public AccountType getAccountType() {
		return accountType;
	}
	
	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}
	public String getAccountLoginName() {
		return accountLoginName;
	}
	public void setAccountLoginName(String accountLoginName) {
		this.accountLoginName = accountLoginName;
	}
	public String getAccountPassword() {
		return accountPassword;
	}
	public void setAccountPassword(String accountPassword) {
		this.accountPassword = accountPassword;
	}
	public String getAccountMailId() {
		return accountMailId;
	}
	public void setAccountMailId(String accountMailId) {
		this.accountMailId = accountMailId;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	
	

}
