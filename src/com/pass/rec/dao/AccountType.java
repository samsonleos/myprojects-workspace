package com.pass.rec.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ACCOUNT_TYPE")
public class AccountType {
    @Id
    @Column(name="ACC_TYP_ID", nullable=false, unique=true)
    private Long id;
    @Column(name="ACC_TYP_CD")
    private String accountTypeCode;
    @Column(name="ACC_TYP_NM")
    private String accountTypeName;

    public String getAccountTypeCode() {
        return this.accountTypeCode;
    }

    public void setAccountTypeCode(String accountTypeCode) {
        this.accountTypeCode = accountTypeCode;
    }

    public String getAccountTypeName() {
        return this.accountTypeName;
    }

    public void setAccountTypeName(String accountTypeName) {
        this.accountTypeName = accountTypeName;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}