package com.entity;

import java.io.Serializable;

public class Employee implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    private String id;
	private String fname;
	private String lname;
	private String uname;
	private String password;
	private String address;
	private String contact;
	
	public Employee(String id,String fname, String lname, String uname, String password, String address, String contact) {
		super();
		this.id=id;
		this.fname = fname;
		this.lname = lname;
		this.uname = uname;
		this.password = password;
		this.address = address;
		this.contact = contact;
	}
	
	

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}



	public String getId() {
		return id;
	}
	
	public void setId(String id) {
        this.id=id;
	}
	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getUname() {
		return uname;
	}


	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPasspord() {
		return password;
	}

	public void setPasspord(String passpord) {
		this.password = passpord;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}
	

	@Override
	public String toString() {
		return "Employeee [id=" + id + ", fname=" + fname + ", lname=" + lname + ", uname=" + uname + ", password="
				+ password + ", address=" + address + ", contact=" + contact + "]";
	}
	
  
}
