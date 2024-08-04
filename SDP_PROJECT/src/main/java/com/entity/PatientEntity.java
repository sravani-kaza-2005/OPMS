package com.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="patient")
public class PatientEntity  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String patientfirstname;
	private String patientlastname;
	private String patientphonenumber;
	private String patientgender;
	private String patientemail;
	@Id
	private String patientusername;
	private String patientpassword;
	public String getPatientfirstname() {
		return patientfirstname;
	}
	public void setPatientfirstname(String patientfirstname) {
		this.patientfirstname = patientfirstname;
	}
	public String getPatientlastname() {
		return patientlastname;
	}
	public void setPatientlastname(String patientlastname) {
		this.patientlastname = patientlastname;
	}
	public String getPatientphonenumber() {
		return patientphonenumber;
	}
	public void setPatientphonenumber(String patientphonenumber2) {
		this.patientphonenumber = patientphonenumber2;
	}
	
	public String getPatientgender() {
		return patientgender;
	}
	public void setPatientgender(String patientgender) {
		this.patientgender = patientgender;
	}
	public String getPatientemail() {
		return patientemail;
	}
	public void setPatientemail(String patientemail) {
		this.patientemail = patientemail;
	}
	public String getPatientusername() {
		return patientusername;
	}
	public void setPatientusername(String patientusername) {
		this.patientusername = patientusername;
	}
	public String getPatientpassword() {
		return patientpassword;
	}
	public void setPatientpassword(String patientpassword) {
		this.patientpassword = patientpassword;
	}
	
	
}

