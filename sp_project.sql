-- Create database
CREATE DATABASE sportsdb;

-- Use database
USE sportsdb;

-- Create table
CREATE TABLE players (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    age INT NOT NULL,
    sport VARCHAR(50) NOT NULL,
    contact VARCHAR(50)
);