package com.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.util.Date;
//import java.sql.Date;
import java.util.List;
import java.util.logging.Logger;

import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Id;
import javax.persistence.PersistenceUnit;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import com.entity.AdminEntity;
import com.entity.AppointmentEntity;
import com.entity.DoctorEntity;
import com.entity.PatientEntity;
//
import com.model.RemoteUser;

@ManagedBean(name="register",eager=true)
public class UserBean {
	private String patientfirstname;
	private String patientlastname;
	private String patientphonenumber;
	private String patientgender;
	private String patientemail;
	private String patientusername;
	private String patientpassword;
	
	//doctor details
	private String doctorfirstname;
	private String doctorlastname;
	private String doctorphonenumber;
	private String doctorgender;
	private String doctortype;
	private String doctoremail;
	private String doctorusername;
	private String doctorpassword;
	
	//admin details
	private String adminfirstname;
	private String adminlastname;
	private String adminphonenumber;
	private String adminemail;
	private String adminusername;
	private String adminpassword;
	
	//appointanet properties
 	private int appointmentid;
    private String patientUsername;
    private String  patientProblem;
    private String doctorUsername;
    private Date appointmentDate;
    private Date appointmentTime;
    private Part reportFile;

	
	
	@EJB(mappedName = "global/SDP_PROJECT/UserModel!com.model.RemoteUser")
	RemoteUser ru;
	
	//
	
	//patient methods
	
	//
	public String getPatientfirstname() {
		return patientfirstname;
	}

	public void setPatientfirstname(String patientfirstname) {
		this.patientfirstname = patientfirstname;
	}
	
	public String getPatientphonenumber() {
		return patientphonenumber;
	}

	public void setPatientphonenumber(String patientphonenumber) {
		this.patientphonenumber = patientphonenumber;
	}

	public String getPatientlastname() {
		return patientlastname;
	}

	public void setPatientlastname(String patientlastname) {
		this.patientlastname = patientlastname;
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
	
	//
	
	//doctor metods
	
	//
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

	public void setDoctorphonenumber(String doctorphonenumber) {
		this.doctorphonenumber = doctorphonenumber;
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
	//
	
	//admin methods

	//
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
	// 
	
	//appointment methods
	
	//
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
	
	public Part getReportFile() {
		return reportFile;
	}

	public void setReportFile(Part reportFile) {
		this.reportFile = reportFile;
	}

	//patient register calling function
	public void callpatientregister()
	{
		PatientEntity pe= new PatientEntity();
		pe.setPatientfirstname(patientfirstname);
		pe.setPatientlastname(patientlastname);
		pe.setPatientphonenumber(patientphonenumber);
		pe.setPatientgender(patientgender);
		pe.setPatientemail(patientemail);
		pe.setPatientusername(patientusername);
		pe.setPatientpassword(patientpassword);	
		ru.patientregister(pe);
	}
	
	//patient register calling function 


	public void calldoctorregister()

	{
		DoctorEntity de= new DoctorEntity();
		de.setDoctorfirstname(doctorfirstname);
		de.setDoctorlastname(doctorlastname);
		de.setDoctorphonenumber(doctorphonenumber);
		de.setDoctorgender(doctorgender);
		de.setDoctortype(doctortype);
		de.setDoctoremail(doctoremail);
		de.setDoctorusername(doctorusername);
		de.setDoctorpassword(doctorpassword);
		ru.doctorregister(de);
	}
	
	//admin register calling function
	
	public void calladminregister()
	{
		AdminEntity ae= new AdminEntity();
		ae.setAdminfirstname(adminfirstname);
		ae.setAdminlastname(adminlastname);
		ae.setAdminphonenumber(adminphonenumber);
		ae.setAdminemail(adminemail);
		ae.setAdminusername(adminusername);
		ae.setAdminpassword(adminpassword);
		ru.adminregister(ae);
	}
	
	public void validateadminlogin() throws IOException
	  {
		 FacesContext facesContext = FacesContext.getCurrentInstance();
	     ExternalContext externalContext = facesContext.getExternalContext();
		
	     HttpServletRequest request = (HttpServletRequest) externalContext.getRequest();
		 HttpServletResponse response = (HttpServletResponse) externalContext.getResponse();
		
		 AdminEntity admin = ru.checkadminlogin(adminusername, adminpassword);
		 
		 if(admin!=null)
		 {
		   HttpSession session = request.getSession();
		   session.setAttribute("admin", admin); // admin session attribute
			
		   response.sendRedirect("adminhome.jsf");
		 }
		 else
		 {
			response.sendRedirect("adminloginfail.jsf");
		 }
	  }
	public void validatedoctorlogin() throws IOException
	  {
		 FacesContext facesContext = FacesContext.getCurrentInstance();
	     ExternalContext externalContext = facesContext.getExternalContext();
		
	     HttpServletRequest request = (HttpServletRequest) externalContext.getRequest();
		 HttpServletResponse response = (HttpServletResponse) externalContext.getResponse();
		
		 DoctorEntity doctor = ru.checkdoctorlogin(doctorusername, doctorpassword);
		 
		 if(doctor!=null)
		 {
		  //
			
		   response.sendRedirect("doctorhome.jsf");  //doctorhome   doctorloginfail
		 }
		 else
		 {
			response.sendRedirect("doctorloginfail.jsf");
		 }
	  }
	public void validatepatientlogin() throws IOException
	  {
		 FacesContext facesContext = FacesContext.getCurrentInstance();
	     ExternalContext externalContext = facesContext.getExternalContext();
		
	     HttpServletRequest request = (HttpServletRequest) externalContext.getRequest();
		 HttpServletResponse response = (HttpServletResponse) externalContext.getResponse();
		
		 PatientEntity patient = ru.checkpatientlogin(patientusername, patientpassword);
		 
		 if(patient!=null)
		 {
//		   HttpSession session = request.getSession();
//		   session.setAttribute("patient", patient); // patient session attribute
			
		   response.sendRedirect("patienthome.jsf"); //patienthome  patientloginfail
		 }
		 else
		 {
			response.sendRedirect("patientloginfail.jsf");
		 }
	  }
	public List<DoctorEntity> viewalldoctors() {
		return ru.viewalldoctors();
		
	}
	public List<PatientEntity> viewallpatients() {
		return ru.viewallpatients();
		
	}
	@PersistenceUnit(unitName = "SDP_PROJECT")
	private EntityManagerFactory emf;

	public void createappointment() {
	    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	    SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm");

	    // Use the defined formats to convert Date objects to Strings
	    String formattedDate = (appointmentDate != null) ? dateFormat.format(appointmentDate) : "Date not provided";
	    String formattedTime = (appointmentTime != null) ? timeFormat.format(appointmentTime) : "Time not provided";

	    EntityManager em = emf.createEntityManager();

	    try {
	        em.getTransaction().begin();

	        // Create a new AppointmentEntity
	        AppointmentEntity ae = new AppointmentEntity();
	        ae.setAppointmentid(appointmentid);
	        ae.setPatientUsername(patientUsername);
	        ae.setPatientProblem(patientProblem);
	        ae.setDoctorUsername(doctorUsername);
	        ae.setAppointmentDate(appointmentDate);
	        ae.setAppointmentTime(appointmentTime);

	        // Handle file upload
//	        if (reportFile != null) {
//	            try (InputStream input = reportFile.getInputStream()) {
//	                byte[] fileContent = new byte[(int) reportFile.getSize()];
//	                input.read(fileContent);
//	                ae.setReportFile(fileContent); // Assuming AppointmentEntity has a byte[] field for the report file
//	            } catch (IOException e) {
//	                e.printStackTrace();
//	                System.err.println("Error reading the report file.");
//	            }
//	        }

	        // Persist the entity
	        em.persist(ae);
	        em.getTransaction().commit();
	        System.out.println("Appointment created successfully.");

	        // Retrieve doctor and patient email from the database
	        DoctorEntity doctor = em.find(DoctorEntity.class, doctorUsername);
	        PatientEntity patient = em.find(PatientEntity.class, patientUsername);

	        if (doctor != null && patient != null) {
	            // Prepare detailed email content
	            String doctorEmailContent = String.format(
	                "Dear Dr. %s %s,\n\nA new appointment has been created.\n\nDetails:\n- Patient Name: %s %s\n- Patient Problem: %s\n- Appointment Date: %s\n- Appointment Time: %s\n\nBest regards,\nYour Clinic",
	                doctor.getDoctorfirstname(), doctor.getDoctorlastname(), patient.getPatientfirstname(), patient.getPatientlastname(), 
	                (patientProblem != null && !patientProblem.isEmpty()) ? patientProblem : "Information not provided",
	                formattedDate, formattedTime
	            );

	            String patientEmailContent = String.format(
	                "Dear %s %s,\n\nYour appointment has been confirmed.\n\nDetails:\n- Doctor Name: Dr. %s %s\n- Type of Doctor: %s\n- Appointment Date: %s\n- Appointment Time: %s\n\nBest regards,\nYour Clinic",
	                patient.getPatientfirstname(), patient.getPatientlastname(), doctor.getDoctorfirstname(), doctor.getDoctorlastname(), doctor.getDoctortype(), formattedDate, formattedTime
	            );

	            // Send email after appointment is created
	            EmailService emailService = new EmailService();
	            emailService.sendEmail(doctor.getDoctoremail(), "Appointment Created", doctorEmailContent);
	            emailService.sendEmail(patient.getPatientemail(), "Appointment Created", patientEmailContent);
	        } else {
	            System.err.println("Doctor or Patient not found.");
	        }

	    } catch (Exception e) {
	        e.printStackTrace();
	        if (em.getTransaction().isActive()) {
	            em.getTransaction().rollback();
	        }
	    } finally {
	        em.close();
	    }
	}

	public void downloadFile(int appointmentid) throws IOException {
//        FacesContext context = FacesContext.getCurrentInstance();
//        HttpServletResponse response = (HttpServletResponse) context.getExternalContext().getResponse();
//        
//        // Redirect to the download servlet
//        response.sendRedirect(context.getExternalContext().getRequestContextPath() + "/downloadFile?appointmentId=" + appointmentid);
//        context.responseComplete();
		 // Define the original file path based on the appointmentId
        String originalFilePath = "/resources/files/appointment_" + appointmentid + ".pdf";
        File originalFile = new File(originalFilePath);

        if (!originalFile.exists()) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "File not found", "The file you are trying to download does not exist."));
            return;
        }

        // Define the storage location where the file will be stored
        String storageFilePath = "/resources/files/appointment_" + appointmentid + ".pdf";
        File storageFile = new File(storageFilePath);

        // Copy the file to the storage location
        try (FileInputStream input = new FileInputStream(originalFile);
             FileOutputStream output = new FileOutputStream(storageFile)) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = input.read(buffer)) != -1) {
                output.write(buffer, 0, bytesRead);
            }
        }

        // Set the response for file download
        ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
        HttpServletResponse response = (HttpServletResponse) externalContext.getResponse();
        response.setContentType("application/pdf");
        response.setHeader("Content-Disposition", "attachment;filename=" + storageFile.getName());

        try (FileInputStream input = new FileInputStream(storageFile);
             OutputStream output = response.getOutputStream()) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = input.read(buffer)) != -1) {
                output.write(buffer, 0, bytesRead);
            }
        }

        FacesContext.getCurrentInstance().responseComplete();
    }
	public void downloadfile(int appointmentid)  
	{
Connection con = null;
try {
	con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
} catch (SQLException e2) {
	// TODO Auto-generated catch block
	e2.printStackTrace();
}
		
		try {
			Statement stmt = con.createStatement();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			rs = ps.executeQuery("SELECT * FROM Appointment  where appontmentid = appointmentid");
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Blob appointment_file = null;
		try {
			appointment_file = rs.getBlob("appointment_file");
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		byte[] imageData = null;
		try {
			imageData = appointment_file.getBytes(1, (int) appointment_file.length());
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("C:\\Users\\sandy\\Desktop\\appointment_.pdf");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			fos.write(imageData);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			fos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
    public List<AppointmentEntity> viewallappointments() {
        return ru.viewAllAppointments();
    }
    public String deletedoctor(String doctorusername) {
        ru.deletedoctor(doctorusername);
        return "viewalldoctors.jsf";
    }
    public String deletepatient(String patientusername) {
        ru.deletedoctor(patientusername);
        return "viewallpatients.jsf";
    }
    public List<AppointmentEntity> viewappointmentmentofdoctor(String doctorUsername) {
        return ru.viewappointofdoctor(doctorUsername);
    }

}
