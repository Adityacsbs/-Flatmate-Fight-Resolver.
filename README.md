# Flatmate Fight Resolver

## 📌 Project Overview
Flatmate Fight Resolver is a Spring Boot-based application that helps manage conflicts among flatmates. It allows users to file complaints, vote on issues, and track resolution progress using a leaderboard and karma points system.

## 🚀 Features
- **User Authentication & JWT Security**
- **Complaint Filing & Management**
- **Voting System (Upvote/Downvote Complaints)**
- **Auto-Archive Downvoted Complaints (3-day rule)**
- **Leaderboard (Most Complaints Filed Against, Top Upvoted Users)**
- **Database Integration with MySQL**
- **API Documentation with Swagger UI**
- **Deployment on Render (Cloud Hosting)**

## 🛠️ Technologies Used
- **Java 21**
- **Spring Boot 3.4.3**
- **Spring Security & JWT Authentication**
- **MySQL Database with JPA & Hibernate**
- **Swagger UI for API Documentation**
- **Render for Cloud Deployment**

## 🔧 Setup & Installation
### 1️⃣ Clone the Repository
```sh
git clone https://github.com/Adityacsbs/-Flatmate-Fight-Resolver.git
cd Flatmate-Fight-Resolver
```

### 2️⃣ Configure MySQL Database
1. Start MySQL Server and create a new database:
   ```sql
   CREATE DATABASE flatmate_db;
   ```
2. Update `src/main/resources/application.properties` with your database credentials:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/flatmate_db
   spring.datasource.username=YOUR_USERNAME
   spring.datasource.password=YOUR_PASSWORD
   spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
   ```

### 3️⃣ Build and Run the Project
```sh
mvn clean install
mvn spring-boot:run
```
The application should now be running on **http://localhost:8080**

## 📖 API Documentation
Once the application is running, open **Swagger UI** in your browser:
```
http://localhost:8080/swagger-ui/index.html
```

## 🚀 Deployment on Render
1. **Push your code to GitHub:**
   ```sh
   git add .
   git commit -m "Deploying to Render"
   git push origin main
   ```
2. **Deploy on Render:**
   - Go to [Render](https://dashboard.render.com/)
   - Click **New Web Service** → Connect to your GitHub repo
   - Set the **Build Command:** `mvn clean install`
   - Set the **Start Command:** `mvn spring-boot:run`
   - Choose **Free Plan** and deploy



---
**Made with ❤️ by Aditya** 🚀

