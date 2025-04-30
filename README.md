# Airplane Management System

A Java-based backend project that simulates an airline management system. It allows users to view available flights and administrators to manage flight and user data through a MySQL database. This project demonstrates JDBC integration, object-oriented design, and clean database access with DAO pattern.

## Features

- User management (view all users)
- Flight management (view all flights)
- JDBC integration for database operations
- MySQL database connectivity via `DBConnection` class
- Clean separation using DAO and Model layers
- Test class to verify DAO functionality

  ##  Tech Stack

- Language: Java  
- IDE: IntelliJ IDEA  
- Database: MySQL  
- Connector: MySQL Connector/J (JDBC Driver)  
- Build Tool: Manual (no Maven/Gradle used yet)

## Project Structure

AirplaneManagementSystem/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/airplane/
│   │           ├── dao/
│   │           │   └── AirplaneDAO.java
│   │           ├── db/
│   │           │   └── DBConnection.java
│   │           └── model/
│   │               ├── Flight.java
│   │               └── User.java
│   └── test/
│       └── java/
│           ├── TestAirplaneDAO.java
│           └── TestDBConnection.java
├── libs/
│   └── mysql-connector-j-9.3.0.jar
├── pom.xml
└── .gitignore

## ▶️ How to Run the Project

Follow the steps below to run and test the Airplane Management System:

### 1. ✅ Prerequisites
- Java 17 or above installed
- IntelliJ IDEA (or any IDE of your choice)
- MySQL Server installed and running
- MySQL Workbench (for easy DB management)
- `mysql-connector-j-*.jar` added to your `libs` folder and project dependencies

---

### 2. Set Up the Database

Use the following steps:

- Open **MySQL Workbench**
- Create a new SQL File and run:

```sql
CREATE DATABASE IF NOT EXISTS airline_db;
USE airline_db;

CREATE TABLE users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) UNIQUE,
    password VARCHAR(100),
    role ENUM('user', 'admin') DEFAULT 'user'
);

CREATE TABLE flights (
    id INT AUTO_INCREMENT PRIMARY KEY,
    flight_number VARCHAR(20),
    source VARCHAR(50),
    destination VARCHAR(50),
    date DATE,
    time TIME,
    price DECIMAL(10,2)
);

CREATE TABLE bookings (
    id INT AUTO_INCREMENT PRIMARY KEY,
    user_id INT,
    flight_id INT,
    booking_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (user_id) REFERENCES users(id),
    FOREIGN KEY (flight_id) REFERENCES flights(id)
);

