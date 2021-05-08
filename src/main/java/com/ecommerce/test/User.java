package com.ecommerce.test;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Entity
@ApiModel(description="Ecommerce Users Profile")
public class User {
	@Id
	@GeneratedValue
	private Integer id;
	@Size(min = 2, message = "Name should be of minumum 2 characters")
	@ApiModelProperty(notes="Name should be of minimum 2 characters")
	private String name;
	@Past
	@ApiModelProperty(notes="Birth Date Should be in past")
	private Date birthDate;

	@OneToMany(mappedBy = "user")
	private List<Address> address;
	private Long phoneNumber;
	private String emailId;

	public User() {

	}

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

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

	public Long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", birthDate=" + birthDate + ",phoneNumber=" + phoneNumber
				+ ",emailId=" + emailId + "]";
	}

	public User(Integer id, String name, Date birthDate, List<Address> address, Long phoneNumber, String emailId) {
		super();
		this.id = id;
		this.name = name;
		this.birthDate = birthDate;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.emailId = emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
}
