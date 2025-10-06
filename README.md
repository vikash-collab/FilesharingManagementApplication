# 📁 Filesharing Management Application

A secure and efficient file-sharing platform built with Java and Spring Boot. This application enables users to upload, manage, and share files with role-based access control and audit logging.

## 🚀 Features

- 🔐 **User Authentication & Authorization** (Spring Security)
- 📤 **File Upload & Download** with metadata tracking
- 👥 **Role-Based Access Control** (Admin, User)
- 🕵️ **Audit Logging** for file operations
- 🗃️ **File Categorization** and search
- 📊 **Dashboard** for file statistics (optional)
- 📄 **RESTful APIs** for integration and automation

## 🛠️ Tech Stack
                                                                                                 
| Layer         | Technology                     |
|--------------|---------------------------------|
| Backend       | Java 17+, Spring Boot, Maven   |
| Security      | Spring Security 6+, JWT (optional) |
| Persistence   | JPA/Hibernate, MySQL/PostgreSQL |
| Documentation | Swagger/OpenAPI                |
| Testing       | JUnit, Mockito                 |

## 📦 Project Structure

FilesharingManagementApplication/                                                                                                                                                               
├── src/                                                                                                                                                                                           
│ ├── main/                                                                                                                                                                                        
│ │ ├── java/com/filesharing/                                                                                                                                                                      
│ │ │ ├── controller/                                                                                                                                                                              
│ │ │ ├── service/                                                                                                                                                                                
│ │ │ ├── model/                                                                                                                                                                                   
│ │ │ ├── repository/                                                                                                                                                                              
│ │ │ └── config/                                                                                                                                                                                  
│ │ └── resources/                                                                                                                                                                                 
│ │ │ └──static/style                                                                                                                                                                              
│ │ │   └──assets                                                                                                                                                                                  
│ │ │   └──.css                                                                                                                                                                                    
│ │ │ └── template                                                                                                                                                                                 
│ │ │   └──.html                                                                                                                                                                                   
│ │ └── application.properties                                                                                                                                                                     
├── pom.xml                                                                                                                                                                                        
└── README.md                                                                                                                                                                                      


## 🧪 How to Run

1. **Clone the repository**
   ```bash
   git clone https://github.com/vikash-collab/FilesharingManagementApplication.git
   cd FilesharingManagementApplication

2. **Configure database in application.properties**
   ```properties
  spring.datasource.url=jdbc:mysql://localhost:3306/filesharingdb
  spring.datasource.username=root
  spring.datasource.password=yourpassword

4. **📚 API Endpoints**
Method	Endpoint	Description
POST	/api/files/upload	Upload a file
GET	/api/files/{id}	Download file by ID
GET	/api/files/user/{id}	List user’s files
DELETE	/api/files/{id}	Delete file
   
**🔐 Security**
In-memory users or JDBC-based authentication

Role-based access (ROLE_USER, ROLE_ADMIN)

Optional JWT integration for stateless auth
                                                                                                                                                                                                   
**🧰 Future Enhancements**
✅ JWT-based authentication

📈 File usage analytics

📬 Email notifications on file share

🧾 Versioning and rollback
                                                                                                                                                                                                   
*🤝 Contributing*
Pull requests are welcome! For major changes, please open an issue first to discuss what you would like to change.
                                                                                                                                                                                                   
📄 License
This project is licensed under the MIT License.
