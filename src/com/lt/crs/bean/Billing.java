package com.lt.crs.bean;

public class Billing {
	
private boolean paymentStatus;
private int billNo;
private String billMode;

public boolean isPaymentStatus() {
	return paymentStatus;
}
public void setPaymentStatus(boolean paymentStatus) {
	this.paymentStatus = paymentStatus;
}
public int getBillNo() {
	return billNo;
}
public void setBillNo(int billNo) {
	this.billNo = billNo;
}
public String getBillMode() {
	return billMode;
}
public void setBillMode(String billMode) {
	this.billMode = billMode;
}
}
