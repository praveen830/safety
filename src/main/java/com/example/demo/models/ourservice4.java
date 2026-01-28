package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class ourservice4 {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String title;
	private String fullname;
	private Long phonenumber;
	private String selectype;
	private String address;
	private String date;
	private String bookservice;
	private String title1;
	private String contactname;
	private String emergencycontact;
	private String priority;
	private String description;
	private String requestservice;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public Long getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(Long phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getSelectype() {
		return selectype;
	}
	public void setSelectype(String selectype) {
		this.selectype = selectype;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getBookservice() {
		return bookservice;
	}
	public void setBookservice(String bookservice) {
		this.bookservice = bookservice;
	}
	public String getTitle1() {
		return title1;
	}
	public void setTitle1(String title1) {
		this.title1 = title1;
	}
	public String getContactname() {
		return contactname;
	}
	public void setContactname(String contactname) {
		this.contactname = contactname;
	}
	public String getEmergencycontact() {
		return emergencycontact;
	}
	public void setEmergencycontact(String emergencycontact) {
		this.emergencycontact = emergencycontact;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getRequestservice() {
		return requestservice;
	}
	public void setRequestservice(String requestservice) {
		this.requestservice = requestservice;
	}
	public ourservice4() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ourservice4(Integer id, String title, String fullname, Long phonenumber, String selectype, String address,
			String date, String bookservice, String title1, String contactname, String emergencycontact,
			String priority, String description, String requestservice) {
		super();
		this.id = id;
		this.title = title;
		this.fullname = fullname;
		this.phonenumber = phonenumber;
		this.selectype = selectype;
		this.address = address;
		this.date = date;
		this.bookservice = bookservice;
		this.title1 = title1;
		this.contactname = contactname;
		this.emergencycontact = emergencycontact;
		this.priority = priority;
		this.description = description;
		this.requestservice = requestservice;
	}
	
	

}
