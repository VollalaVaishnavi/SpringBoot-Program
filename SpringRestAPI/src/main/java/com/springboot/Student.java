package com.springboot;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
@Id
int sid;
String sname;
String scourse;
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public String getScourse() {
	return scourse;
}
public void setScourse(String scourse) {
	this.scourse = scourse;
}
 
@Override
public String toString() {
	return "Student [sid=" + sid + ", sname=" + sname + ", scourse=" + scourse + "]";
}

}
