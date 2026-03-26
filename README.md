# Sports Tournament Registration System

[![Java](https://img.shields.io/badge/Language-Java-blue)](https://www.java.com/)
[![MySQL](https://img.shields.io/badge/Database-MySQL-orange)](https://www.mysql.com/)

---

## **Description**
The **Sports Tournament Registration System** is a console-based Java application that allows users to **register players for different sports**, view all registered players, and manage tournament data efficiently.  

It uses **Java JDBC** to connect with a **MySQL database**, storing player information securely and allowing easy retrieval.

---

## **Features**
- Add new players with **name** and **sport**.  
- View all registered players in the tournament.  
- Data is stored in **MySQL database** (`players` table).  
- Uses **JDBC connection** for all database operations.  
- Simple console-based interface for easy usage.  

---

## **Technologies Used**
- **Java** (JDK 8 or above)  
- **MySQL** (Database)  
- **JDBC** (Java Database Connectivity API)

---

## **Database Schema**

**Database:** `sportsdb`  
**Table:** `players`  

| Column | Type         | Description                  |
|--------|-------------|------------------------------|
| id     | INT         | Auto-increment primary key   |
| name   | VARCHAR(100)| Name of the player           |
| sport  | VARCHAR(50) | Sport the player participates|

**SQL Script to create database and table:**
```sql
CREATE DATABASE sportsdb;

USE sportsdb;

CREATE TABLE players (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    sport VARCHAR(50) NOT NULL
);
