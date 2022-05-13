package com.spring;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.*;
public class PersonForm {
	@NotNull
	@Size(min=2, max=10)
	//@Pattern(regexp = "^[0-9]{1,3}\\\\.[0-9]{1,3}\\\\.[0-9]{1,3}\\\\.[0-9] {1,3}$")
	@NotEmpty(message = "Name may not be null")
	private String name;
    @NotNull(message="Age may be greater or equals to 18")
	@Min(18)
    @Max(30)
	private Integer age;
	@NotNull(message="City should not be empty")
	private String city;
	@NotNull(message="Email may not be null")
	@Email(message = "Email is not valid", regexp = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$")
	private String email;
	@NotNull(message="Mobile number should not be empty")
	@Min(10)
    private String mobileno; 
	@NotNull(message="DOB should be entered")
	 @DateTimeFormat(pattern="mm/dd/yyyy")
	private Date birthday;
	@NotNull(message="Gender should be Male/Female")
	private String gender;
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	 public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno; 
	} 
	
}
