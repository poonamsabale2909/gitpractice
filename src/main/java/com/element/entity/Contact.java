package com.element.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Data
@Table(name="CONTACT_DETAILS")
public class Contact {
	@Id
	@GeneratedValue
	@Column(name="CONTACT_ID")
	private Integer contact_Id;
	
	@Column(name="CONTACT_NAME")
	private String contact_name;
	
	@Column(name="CONTACT_EMAIL")
	private String email;
	
	@Column(name="CONTACT_NO")
	private long contact_no;
	
	@Column(name="CONTACT_ACTIVESWITCH")
	private Character activeSwitch;
	
	@Column(name="CONTACT_CREATEDATE")
	private LocalDate createdDate;
	
	@Column(name="CONTACT_UPDATEDATE")
	private LocalDate updatedDate;
}
