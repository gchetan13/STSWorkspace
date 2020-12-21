package com.dxc.banking.models;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

public class Admin {
	@NotEmpty(message = "Employee Number can not be empty")
private int empNo;
	@Min(value = 10,message = "Experience can not be less than 10 years")
	@NotEmpty(message = "Experience can not be Empty")
private int experience;
private boolean isCriminalRecord;
public int getEmpNo() {
	return empNo;
}
public void setEmpNo(int empNo) {
	this.empNo = empNo;
}
public int getExperience() {
	return experience;
}
public void setExperience(int experience) {
	this.experience = experience;
}
public boolean isCriminalRecord() {
	return isCriminalRecord;
}
public void setCriminalRecord(boolean isCriminalRecord) {
	this.isCriminalRecord = isCriminalRecord;
}

}
