CREATE DATABASE IF NOT EXISTS travel_and_tourism_management_system_db;

USE travel_and_tourism_management_system_db;

CREATE TABLE account (
    username VARCHAR(50) PRIMARY KEY,
    name VARCHAR(100),
    password VARCHAR(100),
    security VARCHAR(255),
    answer VARCHAR(255)
);




