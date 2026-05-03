# CST-323-Group-Project
Inventory Management System 

Setup Instructions

Clone or pull the latest version of the project from GitHub.

Open the project in IntelliJ IDEA.

Make sure your AWS RDS MySQL database is created and running.

In MySQL Workbench, connect to your RDS database and run:

CREATE DATABASE IF NOT EXISTS inventorydb;

In IntelliJ, open this file:

src/main/resources/application.properties

Update the following values with your AWS RDS credentials:

spring.datasource.url=jdbc:mysql://clcinventorydb.c52c0ykeye01.us-east-2.rds.amazonaws.com:3306/inventorydb
spring.datasource.username=admin
spring.datasource.password=

Add your RDS password to this line:

spring.datasource.password=yourpasswordhere

Do not push your database password to GitHub.

Make sure the application is set to run on port 5000:

server.port=5000

Build the project:

mvn clean package -DskipTests

Deploy the generated .jar file to AWS Elastic Beanstalk.

Once deployed, open your AWS application URL in a browser:

http://your-elastic-beanstalk-url/products

The inventory app should load from there. You should be able to add, view, edit, and delete products.
