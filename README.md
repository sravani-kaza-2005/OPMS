# 🏥 OPMS - OP Hospital Management System

**OPMS** is a full-stack hospital management system designed to manage **patients, doctors, and appointments** efficiently.  
The system provides **role-based access** through Admin, Doctor, and Patient modules, ensuring smooth hospital operations.

---

## 📖 About

This project allows:  

- Admins to manage patients, doctors, and appointments  
- Doctors to view their appointments  
- Patients to view their own appointments  

Additionally, the system integrates **email notifications** to notify doctors and patients when an appointment is booked, improving communication and transparency.

---

## 🚀 Modules & Features

### 🛡️ Admin Module
- ➕ Add patients, doctors, and appointments  
- 🗑 Delete patients, doctors, and appointments  
- ✏️ Update patient, doctor, and appointment details  

### 👨‍⚕️ Doctor Module
- 📅 View scheduled appointments  

### 🧑‍🤝‍🧑 Patient Module
- 📅 View personal appointments  

### ✉️ Email Notifications
- Automatic emails are sent to both **doctors and patients** after booking an appointment  

---

## 🛠 Frameworks & Technologies

- **Frontend / Backend:** JSF (JavaServer Faces) framework with Bean Validations  
- **Database:** Oracle Database  
- **Persistence:** JPA (Java Persistence API)  
- **Email Integration:** Java Mail API  

---

## 📂 Project Structure

OPMS/
│
├── README.md
├── LICENSE
├── pom.xml
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── com/opms/admin/      ← Admin module 🛡️
│   │   │   ├── com/opms/doctor/     ← Doctor module 👨‍⚕️
│   │   │   ├── com/opms/patient/    ← Patient module 🧑‍🤝‍🧑
│   │   │   └── com/opms/mail/       ← Email notification ✉️
│   │   └── resources/
│   │       ├── META-INF/            ← Persistence configs
│   │       └── application.properties
│   │
│   └── test/
│       └── java/                    ← Unit tests
│
├── WebContent/
│   ├── admin/                  ← Admin UI pages
│   ├── doctor/                 ← Doctor UI pages
│   ├── patient/                ← Patient UI pages
│   └── resources/              ← CSS, JS, images
│
├── scripts/                    ← Optional SQL/setup scripts
│   └── init_db.sql
└── docs/                       ← Optional docs/screenshots
    └── screenshots/


---

## ⚙️ Setup & Installation

### **Prerequisites**
- Java 17 or later  
- Apache Tomcat (or any compatible Java EE server)  
- Oracle Database  

### **Steps**
1. Clone the repository:  
```bash
git clone <repository-url>
2. Configure Oracle Database and update connection properties in persistence.xml
3. Deploy the application on a JSF-compatible server (Tomcat)
4. Access the application via browser:
             http://localhost:8080/OPMS
----
**🌐 Features Summary**
Module	Features
🛡️ Admin	Add / Update / Delete Patients, Doctors, Appointments
👨‍⚕️ Doctor	View Appointments
🧑‍🤝‍🧑 Patient	View Own Appointments
✉️ Email	Sends notifications after appointment booking

----------
**📜 License**
📌 This project is licensed under the MIT License
