package com.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.io.IOException;
import java.io.OutputStream;

@WebServlet("/downloadFile")
public class FileDownloadServlet extends HttpServlet {

    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("SDP_PROJECT");

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String appointmentid = request.getParameter("appointmentid");
        
        EntityManager em = null;
        try {
            em = emf.createEntityManager();
            Query query = em.createQuery("SELECT a.reportFile FROM AppointmentEntity a WHERE a.appointmentid = :appointmentid");
            query.setParameter("appointmentId", Integer.parseInt(appointmentid));
            byte[] fileData = (byte[]) query.getSingleResult();
            
            if (fileData != null) {
                response.setContentType("application/pdf"); // Adjust MIME type as needed
                response.setContentLength(fileData.length);
                response.setHeader("Content-Disposition", "attachment;filename=report.pdf");
                
                try (OutputStream out = response.getOutputStream()) {
                    out.write(fileData);
                    out.flush();
                }
            } else {
                response.sendError(HttpServletResponse.SC_NOT_FOUND, "File not found.");
            }
        } catch (Exception e) {
            e.printStackTrace();
            response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "Error occurred while processing the request.");
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
}
