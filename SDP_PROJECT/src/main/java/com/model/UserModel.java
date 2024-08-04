package com.model;

import java.util.Date;
import java.util.List; 


import javax.ejb.Remote; 
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import com.model.*;
import com.entity.AdminEntity;
import com.entity.AppointmentEntity;
import com.entity.DoctorEntity;
import com.entity.PatientEntity;  
@Stateless
@TransactionManagement(value=TransactionManagementType.BEAN)
public class UserModel implements RemoteUser{

	@Override
	public void patientregister(PatientEntity pe) {
		
		 EntityManagerFactory emf = Persistence.createEntityManagerFactory("SDP_PROJECT");
	        EntityManager em = emf.createEntityManager();
	        em.getTransaction().begin();
	        em.persist(pe);
	        em.getTransaction().commit();
	        em.close();
	        emf.close();
	}

	@Override
	public void doctorregister(DoctorEntity de) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("SDP_PROJECT");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(de);
        em.getTransaction().commit();
        em.close();
        emf.close();
		
	}

	@Override
	public void adminregister(AdminEntity ae)
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("SDP_PROJECT");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(ae);
        em.getTransaction().commit();
        em.close();
        emf.close();
	}

	@Override
	public AdminEntity checkadminlogin(String adminusername, String adminpassword) {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("SDP_PROJECT");
	        EntityManager em = emf.createEntityManager();
	        
	        Query qry = em.createQuery("SELECT a FROM AdminEntity a WHERE a.adminusername = :username AND a.adminpassword = :password");
	        qry.setParameter("username", adminusername);
	        qry.setParameter("password", adminpassword);
	        
	        AdminEntity admin = null;
	        
	        if (!qry.getResultList().isEmpty()) {
	            admin = (AdminEntity) qry.getSingleResult();
	        }
	        em.close();
	        emf.close();
	        
	        return admin;
	}

	@Override
	public DoctorEntity checkdoctorlogin(String doctorusername, String doctorpassword) {
		  EntityManagerFactory emf = Persistence.createEntityManagerFactory("SDP_PROJECT");
	        EntityManager em = emf.createEntityManager();
	        
	        Query qry = em.createQuery("SELECT a FROM DoctorEntity a WHERE a.doctorusername = :username AND a.doctorpassword = :password");
	        qry.setParameter("username", doctorusername);
	        qry.setParameter("password", doctorpassword);
	        
	        DoctorEntity doctor = null;
	        
	        if (!qry.getResultList().isEmpty()) {
	            doctor = (DoctorEntity) qry.getSingleResult();
	        }
	        em.close();
	        emf.close();
	        
	        return doctor;
	}

	@Override
	public PatientEntity checkpatientlogin(String patientusername, String patientpassword) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("SDP_PROJECT");
        EntityManager em = emf.createEntityManager();
        
        Query qry = em.createQuery("SELECT a FROM PatientEntity a WHERE a.patientusername = :username AND a.patientpassword = :password");
        qry.setParameter("username", patientusername);
        qry.setParameter("password", patientpassword);
        
        PatientEntity patient = null;
        
        if (!qry.getResultList().isEmpty()) {
            patient = (PatientEntity) qry.getSingleResult();
        }
        em.close();
        emf.close();
        
        return patient;
	}

	@Override
	public List<DoctorEntity> viewalldoctors() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("SDP_PROJECT");
		EntityManager em = emf.createEntityManager();
		
		Query qry = em.createQuery("select e from DoctorEntity e");
		// e is an alias of DoctorEntity Class
		List<DoctorEntity> doctorlist = qry.getResultList();
		
	    em.close();
	    emf.close();
	    
	    return doctorlist;
	}

	@Override
	public List<PatientEntity> viewallpatients() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("SDP_PROJECT");
		EntityManager em = emf.createEntityManager();
		
		Query qry = em.createQuery("select e from PatientEntity e");
		// e is an alias of PatientEntity Class
		List<PatientEntity> patientlist = qry.getResultList();
		
	    em.close();
	    emf.close();
	    
	    return patientlist;
	}

	@Override
	public void createAppointment(AppointmentEntity ae) {
		//if (isDoctorAvailable(ae.getDoctorUsername(), ae.getAppointmentDate(), ae.getAppointmentTime())) {
	        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SDP_PROJECT");
	        EntityManager em = emf.createEntityManager();
	        try {
	            em.getTransaction().begin();
	            em.persist(ae);
	            em.getTransaction().commit();
	        } finally {
	            em.close();
	            emf.close();
	        }
	    } 
	        //else {
//	        // Handle case where doctor is not available (e.g., throw an exception or return a specific result)
//	        System.out.println("Doctor is not available at the requested time.");
//	    }
	        

	@Override
	public List<AppointmentEntity> viewAllAppointments() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("SDP_PROJECT");
        EntityManager em = emf.createEntityManager();
        
        Query qry = em.createQuery("SELECT a FROM AppointmentEntity a");
        List<AppointmentEntity> appointmentList = qry.getResultList();
        
        em.close();
        emf.close();
        
        return appointmentList;
	}

	@Override
	public String deletedoctor(String doctorusername) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("SDP_PROJECT");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		DoctorEntity doctor = em.find(DoctorEntity.class, doctorusername);
        if (doctor != null) {
            em.remove(doctor);
		em.remove(doctor);
		em.getTransaction().commit();
		
		em.close();
		emf.close();
		
        }
		return "Employee Deleted Successfully";
	}

	@Override
	public String deletepatient(String patientusername) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("SDP_PROJECT");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		DoctorEntity patient = em.find(DoctorEntity.class, patientusername);
        if (patient != null) {
            em.remove(patient);
		em.remove(patient);
		em.getTransaction().commit();
		
		em.close();
		emf.close();
		
        }
		return "Patient Deleted Successfully";
	}

	@Override
	public List<AppointmentEntity> viewappointofdoctor(String doctorUsername) {
		 EntityManagerFactory emf = Persistence.createEntityManagerFactory("SDP_PROJECT");
	        EntityManager em = emf.createEntityManager();
	        
	        Query qry = em.createQuery("SELECT a FROM APPOINTMENT a WHERE a.doctorUsername = :doctorUsername");
	        qry.setParameter("doctorUsername", doctorUsername); 
	        qry.setParameter(doctorUsername, doctorUsername);
	        List<AppointmentEntity> doctorappointmentList = qry.getResultList();
	        
	        em.close();
	        emf.close();
	        
	        return doctorappointmentList;
	}

}

//	public boolean isDoctorAvailable(String doctorUsername, Date appointmentDate, Date appointmentTime) {
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("SDP_PROJECT");
//	    EntityManager em = emf.createEntityManager();
//	    try {
//	        // Construct query to check for existing appointments at the specified date and time
//	        Query query = em.createQuery(
//	            "SELECT COUNT(a) FROM AppointmentEntity a WHERE a.doctorUsername = :doctorUsername " +
//	            "AND a.appointmentDate = :appointmentDate AND a.appointmentTime = :appointmentTime"
//	        );
//	        query.setParameter("doctorUsername", doctorUsername);
//	        query.setParameter("appointmentDate", appointmentDate);
//	        query.setParameter("appointmentTime", appointmentTime);
//
//	        // Get count of existing appointments
//	        long count = (long) query.getSingleResult();
//	        return count == 0; // True if no appointments are found, meaning the doctor is available
//	    } finally {
//	        em.close();
//	        emf.close();
//	    }
//	} 	

	
