package com.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="admin")
public class AdminEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String adminfirstname;
	private String adminlastname;
	private String adminphonenumber;
	private String adminemail;
	@Id
	private String adminusername;
	private String adminpassword;
	public String getAdminfirstname() {
		return adminfirstname;
	}
	public void setAdminfirstname(String adminfirstname) {
		this.adminfirstname = adminfirstname;
	}
	public String getAdminlastname() {
		return adminlastname;
	}
	public void setAdminlastname(String adminlastname) {
		this.adminlastname = adminlastname;
	}
	public String getAdminphonenumber() {
		return adminphonenumber;
	}
	public void setAdminphonenumber(String adminphonenumber) {
		this.adminphonenumber = adminphonenumber;
	}
	public String getAdminemail() {
		return adminemail;
	}
	public void setAdminemail(String adminemail) {
		this.adminemail = adminemail;
	}
	public String getAdminusername() {
		return adminusername;
	}
	public void setAdminusername(String adminusername) {
		this.adminusername = adminusername;
	}
	public String getAdminpassword() {
		return adminpassword;
	}
	public void setAdminpassword(String adminpassword) {
		this.adminpassword = adminpassword;
	}
	
	

}
