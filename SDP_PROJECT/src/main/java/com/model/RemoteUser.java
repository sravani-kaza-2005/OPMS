package com.model;

import java.util.List;


import javax.ejb.Remote;

import com.entity.AdminEntity;
import com.entity.AppointmentEntity;
import com.entity.DoctorEntity;
import com.entity.PatientEntity; 
@Remote

public interface RemoteUser {
	public void patientregister(PatientEntity pe);
	public void doctorregister(DoctorEntity de);
	public void adminregister(AdminEntity ae);
	public AdminEntity checkadminlogin(String username,String password);
	public DoctorEntity checkdoctorlogin(String username,String password);
	public PatientEntity checkpatientlogin(String username,String password);
	public List<DoctorEntity> viewalldoctors();
	public List<PatientEntity> viewallpatients();
	public void createAppointment(AppointmentEntity ae);
    public List<AppointmentEntity> viewAllAppointments();
    public String deletedoctor(String doctorusername);
    public String deletepatient(String patientusername);
    public List<AppointmentEntity> viewappointofdoctor(String doctorUsername);
    }
