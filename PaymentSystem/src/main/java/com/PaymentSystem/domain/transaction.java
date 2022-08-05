package com.PaymentSystem.domain;

import java.util.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="transaction")

public class transaction {
	
	@Id
	@GeneratedValue
	private Double transactionid;
	private Double currencyamount;
	private Double transferfees;
	private Double inramount;
	
	@ManyToOne
	private customer customerid;
	private String currencycode;
	private String senderBIC;
	private String receiverBIC;
	private String receiverholderaccountnumber;
	private String receiverholderaccountname;
	private String transfertypecode;
	private String messagecode;
	private Date transferdate= new Date();
	
	
	public Double getTransactionid() {
		return transactionid;
	}
	public void setTransactionid(Double transactionid) {
		this.transactionid = transactionid;
	}
	public Double getCurrencyamount() {
		return currencyamount;
	}
	public void setCurrencyamount(Double currencyamount) {
		this.currencyamount = currencyamount;
	}
	public Double getTransferfees() {
		return transferfees;
	}
	public void setTransferfees(Double transferfees) {
		this.transferfees = transferfees;
	}
	public Double getInramount() {
		return inramount;
	}
	public void setInramount(Double inramount) {
		this.inramount = inramount;
	}
	public String getCustomerid() {
		return customerid;
	}
	public void setCustomerid(String customerid) {
		this.customerid = customerid;
	}
	public String getCurrencycode() {
		return currencycode;
	}
	public void setCurrencycode(String currencycode) {
		this.currencycode = currencycode;
	}
	public String getSenderBIC() {
		return senderBIC;
	}
	public void setSenderBIC(String senderBIC) {
		this.senderBIC = senderBIC;
	}
	public String getReceiverBIC() {
		return receiverBIC;
	}
	public void setReceiverBIC(String receiverBIC) {
		this.receiverBIC = receiverBIC;
	}
	public String getReceiverholderaccountnumber() {
		return receiverholderaccountnumber;
	}
	public void setReceiverholderaccountnumber(String receiverholderaccountnumber) {
		this.receiverholderaccountnumber = receiverholderaccountnumber;
	}
	public String getReceiverholderaccountname() {
		return receiverholderaccountname;
	}
	public void setReceiverholderaccountname(String receiverholderaccountname) {
		this.receiverholderaccountname = receiverholderaccountname;
	}
	public String getTransfertypecode() {
		return transfertypecode;
	}
	public void setTransfertypecode(String transfertypecode) {
		this.transfertypecode = transfertypecode;
	}
	public String getMessagecode() {
		return messagecode;
	}
	public void setMessagecode(String messagecode) {
		this.messagecode = messagecode;
	}
	public Date getTransferdate() {
		return transferdate;
	}
	public void setTransferdate(Date transferdate) {
		this.transferdate = transferdate;
	}
	@Override
	public int hashCode() {
		return Objects.hash(currencyamount, currencycode, customerid, inramount, messagecode, receiverBIC,
				receiverholderaccountname, receiverholderaccountnumber, senderBIC, transactionid, transferdate,
				transferfees, transfertypecode);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		transaction other = (transaction) obj;
		return Objects.equals(currencyamount, other.currencyamount) && Objects.equals(currencycode, other.currencycode)
				&& Objects.equals(customerid, other.customerid) && Objects.equals(inramount, other.inramount)
				&& Objects.equals(messagecode, other.messagecode) && Objects.equals(receiverBIC, other.receiverBIC)
				&& Objects.equals(receiverholderaccountname, other.receiverholderaccountname)
				&& Objects.equals(receiverholderaccountnumber, other.receiverholderaccountnumber)
				&& Objects.equals(senderBIC, other.senderBIC) && Objects.equals(transactionid, other.transactionid)
				&& Objects.equals(transferdate, other.transferdate) && Objects.equals(transferfees, other.transferfees)
				&& Objects.equals(transfertypecode, other.transfertypecode);
	}
	@Override
	public String toString() {
		return "transaction [transactionid=" + transactionid + ", currencyamount=" + currencyamount + ", transferfees="
				+ transferfees + ", inramount=" + inramount + ", customerid=" + customerid + ", currencycode="
				+ currencycode + ", senderBIC=" + senderBIC + ", receiverBIC=" + receiverBIC
				+ ", receiverholderaccountnumber=" + receiverholderaccountnumber + ", receiverholderaccountname="
				+ receiverholderaccountname + ", transfertypecode=" + transfertypecode + ", messagecode=" + messagecode
				+ ", transferdate=" + transferdate + "]";
	}
	
	

}
