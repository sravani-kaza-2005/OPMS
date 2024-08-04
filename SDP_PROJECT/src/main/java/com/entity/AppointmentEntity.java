//package com.entity;
//
//import java.io.Serializable;
//import java.util.Date;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.Table;
//
//@Entity
//@Table(name="appointment")
//public class AppointmentEntity implements Serializable {
//    private static final long serialVersionUID = 1L;
//
//    @Id
//    @Column(name="APPOINTMENT_ID")
//    private int appointmentId;
//    private String patientUsername;
//    private String doctorUsername;
//    @Column(name="APPOINTMENT_DATE")
//    private Date appointmentDate;
//
//    public int getAppointmentId() {
//        return appointmentId;
//    }
//
//    public void setAppointmentId(int appointmentId) {
//        this.appointmentId = appointmentId;
//    }
//
//    public String getPatientUsername() {
//        return patientUsername;
//    }
//
//    public void setPatientUsername(String patientUsername) {
//        this.patientUsername = patientUsername;
//    }
//
//    public String getDoctorUsername() {
//        return doctorUsername;
//    }
//
//    public void setDoctorUsername(String doctorUsername) {
//        this.doctorUsername = doctorUsername;
//    }
//
//    public Date getAppointmentDate() {
//        return appointmentDate;
//    }
//
//    public void setAppointmentDate(Date appointmentDate) {
//        this.appointmentDate = appointmentDate;
//    }
//}
package com.entity;

import java.io.Serializable;

import java.sql.Time;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "appointment")
public class AppointmentEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private int appointmentid;
    private String patientUsername;
    private String patientProblem;
    private String doctorUsername;
    private Date appointmentDate;
    private Date appointmentTime;
     

    
    public int getAppointmentid() {
		return appointmentid;
	}

	public void setAppointmentid(int appointmentid) {
		this.appointmentid = appointmentid;
	}

	public String getPatientUsername() {
        return patientUsername;
    }

    public void setPatientUsername(String patientUsername) {
        this.patientUsername = patientUsername;
    }

    public String getPatientProblem() {
		return patientProblem;
	}

	public void setPatientProblem(String patientProblem) {
		this.patientProblem = patientProblem;
	}

	public String getDoctorUsername() {
        return doctorUsername;
    }

    public void setDoctorUsername(String doctorUsername) {
        this.doctorUsername = doctorUsername;
    }

    public Date getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(Date appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public Date getAppointmentTime() {
        return appointmentTime;
    }

    public void setAppointmentTime(Date appointmentTime) {
        this.appointmentTime = appointmentTime;
    }

    
}
