 package com.controller;
//////import javax.mail.*;
//////import javax.mail.internet.InternetAddress;
//////import javax.mail.internet.MimeMessage;
//////import java.util.Properties;
//////
//////public class EmailService {
//////
//////    public void sendEmail(String to, String subject, String body) {
//////        final String username = "sandy20499@gmail.com";
//////        final String password = "ryelspwtrknqmxdn";
//////
//////        Properties props = new Properties();
//////        props.put("mail.smtp.auth", "true");
//////        props.put("mail.smtp.starttls.enable", "true");
//////        props.put("mail.smtp.host", "smtp.gmail.com");
//////        props.put("mail.smtp.port", "587");
//////        Session session = Session.getInstance(props, new javax.mail.Authenticator() {
//////            @Override
//////            protected PasswordAuthentication getPasswordAuthentication() {
//////                return new PasswordAuthentication(username, password);
//////            }
//////        });
//////	
////////        Session session = Session.getInstance(props,
////////                new Authenticator() {
////////                    protected PasswordAuthentication getPasswordAuthentication() {
////////                        return new PasswordAuthentication(username, password);
////////                    }
////////                });
//////
//////        try {
//////            Message message = new MimeMessage(session);
//////            message.setFrom(new InternetAddress(username));
//////            message.setRecipients(Message.RecipientType.TO,
//////                    InternetAddress.parse(to));
//////            message.setSubject(subject);
//////            message.setText(body);
//////            Transport.send(message);
//////
//////            System.out.println("Email sent successfully!");
//////
//////        } catch (MessagingException e) {
//////            throw new RuntimeException(e);
//////        }
//////    }
//////}
////
//////_____________________________________________________________________________________
////
////
////
////
//////package com.controller;
//////
//////import javax.mail.*;
//////import javax.mail.internet.InternetAddress;
//////import javax.mail.internet.MimeMessage;
//////import java.util.Properties;
//////
//////public class EmailService {
//////
//////    public void sendEmail(String to, String subject, String body) {
//////        final String username = "sandy20499@gmail.com";
//////        final String password = "iakxqoomsprpsivu";
//////
//////        Properties props = new Properties();
//////        props.put("mail.smtp.auth", "true");
//////        props.put("mail.smtp.starttls.enable", "true");
//////        props.put("mail.smtp.host", "smtp.gmail.com");
//////        props.put("mail.smtp.port", "587");
//////
//////        Session session = Session.getInstance(props, new javax.mail.Authenticator() {
//////            @Override
//////            protected PasswordAuthentication getPasswordAuthentication() {
//////                return new PasswordAuthentication(username, password);
//////            }
//////        });
//////
//////        // Enable debugging
//////        session.setDebug(true);
//////
//////        try {
//////            Message message = new MimeMessage(session);
//////            message.setFrom(new InternetAddress(username));
//////            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
//////            message.setSubject(subject);
//////            message.setText(body);
//////
//////            Transport.send(message);
//////            System.out.println("Email sent successfully to " + to);
//////
//////        } catch (MessagingException e) {
//////            System.err.println("Error sending email to " + to);
//////            e.printStackTrace();
//////        }
//////    }
//////}
//////
//////
//////
////
////
//////////////////////////////////////////////////////////////////////////////
////
////
////package com.controller;
////
////import javax.mail.*;
////import javax.mail.internet.InternetAddress;
////import javax.mail.internet.MimeMessage;
////import java.util.Properties;
////
////public class EmailService {
////
////    public void sendEmail(String to, String subject, String body) {
//////        final String username = "sandy20499@gmail.com";
//////        final String password = "iakxqoomsprpsivu"; // Replace with your app password
////    	
////    	 final String username = "sandytechtuts@gmail.com";
////    	 final String password = "hsco eaoo gpil ypf";
////    	 
////        Properties props = new Properties();
////        props.put("mail.smtp.auth", "true");
////        props.put("mail.smtp.starttls.enable", "true");
////        props.put("mail.smtp.host", "smtp.gmail.com");
////        props.put("mail.smtp.port", "587");
////
////        Session session = Session.getInstance(props, new Authenticator() {
////            @Override
////            protected PasswordAuthentication getPasswordAuthentication() {
////                return new PasswordAuthentication(username, password);
////            }
////        });
////
////        session.setDebug(true);
////
////        try {
////            Message message = new MimeMessage(session);
////            message.setFrom(new InternetAddress(username));
////            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
////            message.setSubject(subject);
////            message.setText(body);
////
////            Transport.send(message);
////            System.out.println("Email sent successfully to " + to);
////
////        } catch (MessagingException e) {
////            System.err.println("Error sending email to " + to);
////            e.printStackTrace();
////        }
////    }
////}
////
////
////
////package com.controller;
////import javax.mail.*;
////import javax.mail.internet.InternetAddress;
////import javax.mail.internet.MimeMessage;
////import java.util.Properties;
////
////public class EmailService {
////
////    public void sendEmail(String to, String subject, String body) {
////        final String username = "sandy20499@gmail.com";
////        final String password = "ryelspwtrknqmxdn";
////
////        Properties props = new Properties();
////        props.put("mail.smtp.auth", "true");
////        props.put("mail.smtp.starttls.enable", "true");
////        props.put("mail.smtp.host", "smtp.gmail.com");
////        props.put("mail.smtp.port", "587");
////        Session session = Session.getInstance(props, new javax.mail.Authenticator() {
////            @Override
////            protected PasswordAuthentication getPasswordAuthentication() {
////                return new PasswordAuthentication(username, password);
////            }
////        });
////	
//////        Session session = Session.getInstance(props,
//////                new Authenticator() {
//////                    protected PasswordAuthentication getPasswordAuthentication() {
//////                        return new PasswordAuthentication(username, password);
//////                    }
//////                });
////
////        try {
////            Message message = new MimeMessage(session);
////            message.setFrom(new InternetAddress(username));
////            message.setRecipients(Message.RecipientType.TO,
////                    InternetAddress.parse(to));
////            message.setSubject(subject);
////            message.setText(body);
////            Transport.send(message);
////
////            System.out.println("Email sent successfully!");
////
////        } catch (MessagingException e) {
////            throw new RuntimeException(e);
////        }
////    }
////}
//package com.controller;
//
//import javax.mail.*;
//import javax.mail.internet.InternetAddress;
//import javax.mail.internet.MimeMessage;
//import java.util.Properties;
//
//public class EmailService {
//
//    public void sendEmail(String to, String subject, String body) {
//        final String username = "sandy20499@gmail.com";
//        final String password = "lqxmatqscgxcrmuy";
//
//        //Properties props = new Properties();
////    props.put("mail.smtp.auth", "true");
////    props.put("mail.smtp.starttls.enable", "true");
////    props.put("mail.smtp.host", "smtp.gmail.com");
////    props.put("mail.smtp.port", "587");
//        Properties props = new Properties();
//        props.put("mail.smtp.host", "smtp.gmail.com");
//        props.put("mail.smtp.port", "587");
//        props.put("mail.smtp.auth", "true");
//        props.put("mail.smtp.starttls.enable", "true"); // Use TLS
//
//
//    Session session = Session.getInstance(props, new javax.mail.Authenticator() {
//        @Override
//        protected PasswordAuthentication getPasswordAuthentication() {
//            return new PasswordAuthentication(username, password);
//        }
//    });
//
//    // Enable debugging
//    session.setDebug(true);
//
//    try {
//        Message message = new MimeMessage(session);
//        message.setFrom(new InternetAddress(username));
//        message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
//        message.setSubject(subject);
//        message.setText(body);
//
//        Transport.send(message);
//        System.out.println("Email sent successfully to " + to);
//
//    } catch (MessagingException e) {
//        System.err.println("Error sending email to " + to);
//        e.printStackTrace();
//    }
//    }
//}
//
//
//
// 

//import javax.mail.*;
//import javax.mail.internet.*;
//import java.util.Properties;
//
//public class EmailService {
//
//    public void sendEmail(String to, String subject, String body) {
//        // SMTP server information
//        String host = "smtp.gmail.com";
//        final String username = "sandy20499@gmail.com"; // Your Gmail address
//        final String password = "lqxmatqscgxcrmuy"; // App Password or regular Gmail password
//
//        // Setup mail server properties
//        Properties props = new Properties();
//        props.put("mail.smtp.host", host);
//        props.put("mail.smtp.port", "587");
//        props.put("mail.smtp.auth", "true");
//        props.put("mail.smtp.starttls.enable", "true"); // Enable TLS
//        props.put("mail.debug", "true"); // Enable debugging
//
//        // Get the Session object
//        Session session = Session.getInstance(props, new Authenticator() {
//            protected PasswordAuthentication getPasswordAuthentication() {
//                return new PasswordAuthentication(username, password);
//            }
//        });
//
//        try {
//            // Create a default MimeMessage object
//            MimeMessage message = new MimeMessage(session);
//
//            // Set From: header field
//            message.setFrom(new InternetAddress(username));
//
//            // Set To: header field
//            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
//
//            // Set Subject: header field
//            message.setSubject(subject);
//
//            // Set the actual message
//            message.setText(body);
//
//            // Send message
//            Transport.send(message);
//            System.out.println("Sent message successfully...");
//        } catch (MessagingException e) {
//            e.printStackTrace();
//        }
//    }
//}
 import javax.mail.*;
 import javax.mail.internet.*;
 import java.util.Properties;

 public class EmailService {

     public void sendEmail(String to, String subject, String body) {
         // SMTP server information
         String host = "smtp.gmail.com";
         final String username = "sandy20499@gmail.com"; // Your Gmail address
         final String password = "lqxmatqscgxcrmuy"; // App Password

         // Setup mail server properties
         Properties props = new Properties();
         props.put("mail.smtp.host", host);
         props.put("mail.smtp.port", "465");
         props.put("mail.smtp.auth", "true");
         props.put("mail.smtp.socketFactory.port", "465");
         props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
         props.put("mail.smtp.socketFactory.fallback", "false");
         props.put("mail.smtp.ssl.enable", "true");
         props.put("mail.debug", "true"); // Enable debugging

         // Get the Session object
         Session session = Session.getInstance(props, new Authenticator() {
             protected PasswordAuthentication getPasswordAuthentication() {
                 return new PasswordAuthentication(username, password);
             }
         });

         try {
             // Create a default MimeMessage object
             MimeMessage message = new MimeMessage(session);

             // Set From: header field
             message.setFrom(new InternetAddress(username));

             // Set To: header field
             message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

             // Set Subject: header field
             message.setSubject(subject);

             // Set the actual message
             message.setText(body);

             // Send message
             Transport.send(message);
             System.out.println("Sent message successfully...");
         } catch (MessagingException e) {
             e.printStackTrace();
         }
     }
 }
