package com.entity;

	import java.io.Serializable;

	import javax.persistence.Entity;
	import javax.persistence.Id;
	import javax.persistence.Table;

	@Entity
	@Table(name="doctor")
	public class DoctorEntity implements Serializable{
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		private String doctorfirstname;
		private String doctorlastname;
		private String doctorphonenumber;
		private String doctorgender;
		private String doctortype;
		private String doctoremail;
		@Id
		private String doctorusername;
		private String doctorpassword;
		public String getDoctorfirstname() {
			return doctorfirstname;
		}
		public void setDoctorfirstname(String doctorfirstname) {
			this.doctorfirstname = doctorfirstname;
		}
		public String getDoctorlastname() {
			return doctorlastname;
		}
		public void setDoctorlastname(String doctorlastname) {
			this.doctorlastname = doctorlastname;
		}
		public String getDoctorphonenumber() {
			return doctorphonenumber;
		}
		public void setDoctorphonenumber(String doctorphonenumber2) {
			this.doctorphonenumber = doctorphonenumber2;
		}
		public String getDoctorgender() {
			return doctorgender;
		}
		public void setDoctorgender(String doctorgender) {
			this.doctorgender = doctorgender;
		}
		public String getDoctortype() {
			return doctortype;
		}
		public void setDoctortype(String doctortype) {
			this.doctortype = doctortype;
		}
		public String getDoctoremail() {
			return doctoremail;
		}
		public void setDoctoremail(String doctoremail) {
			this.doctoremail = doctoremail;
		}
		public String getDoctorusername() {
			return doctorusername;
		}
		public void setDoctorusername(String doctorusername) {
			this.doctorusername = doctorusername;
		}
		public String getDoctorpassword() {
			return doctorpassword;
		}
		public void setDoctorpassword(String doctorpassword) {
			this.doctorpassword = doctorpassword;
		}
		
}
