# CST-323-Group-Project
Inventory Management System 

Setup Instructions

Clone or pull the latest version of the project from GitHub.

Open the project in IntelliJ IDEA.

Make sure MySQL is installed and running.

In MySQL Workbench, create the database with this command:

CREATE DATABASE IF NOT EXISTS inventorydb;

In IntelliJ, open this file:

src/main/resources/application.properties

Add your own MySQL password to this line:

spring.datasource.password=

Example:

spring.datasource.password=yourpasswordhere

Do not push your personal MySQL password to GitHub.

The project is currently set to use the root MySQL user:

spring.datasource.username=root

If your MySQL username is different, update that line too.

Run the Spring Boot application from IntelliJ.

Once it starts, open this in your browser:

http://localhost:8080/products

The inventory app should load from there. You should be able to add, view, edit, and delete products.
