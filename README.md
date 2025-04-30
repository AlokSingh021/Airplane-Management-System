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
