
CREATE DATABASE IF NOT EXISTS inventorydb;

USE inventorydb;

CREATE TABLE IF NOT EXISTS product (
    product_id BIGINT AUTO_INCREMENT PRIMARY KEY,
    product_name VARCHAR(255),
    category VARCHAR(255),
    quantity INT,
    price DOUBLE,
    supplier VARCHAR(255),
    description TEXT
);