package com.PaymentSystem.domain;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customeruser")
public class customeruser {
		
	
	@Column(length=100)
	private String username;
	@Column(length=11)
	@Id
	@GeneratedValue
	private String customerid;
	@Column(length=100)
	private String userpassword;
	private Long userid;
	
	public String getusername() {
		return username;
	}
	public void setusername(String username) {
		this.username = username;
	}
	public String getCustomerid() {
		return customerid;
	}
	public void setCustomerid(String customerid) {
		this.customerid = customerid;
	}
	public String getUserpassword() {
		return userpassword;
	}
	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}
	public Long getUserid() {
		return userid;
	}
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	@Override
	public int hashCode() {
		return Objects.hash(customerid, username, userid, userpassword);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		customeruser other = (customeruser) obj;
		return Objects.equals(customerid, other.customerid) && Objects.equals(username, other.username)
				&& Objects.equals(userid, other.userid) && Objects.equals(userpassword, other.userpassword);
	}
	@Override
	public String toString() {
		return "customeruser [username=" + username + ", customerid=" + customerid + ", userpassword=" + userpassword
				+ ", userid=" + userid + "]";
	}
	
	

}
