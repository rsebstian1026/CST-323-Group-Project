package com.gcu.inventoryapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main entry point for the Inventory App Spring Boot application.
 * This class starts the application and loads the Spring application context.
 */
@SpringBootApplication
public class InventoryappApplication {
    /**
     * Starts the Spring Boot application.
     *
     * @param args command-line arguments passed when the application starts
     */
    public static void main(String[] args) {
        SpringApplication.run(InventoryappApplication.class, args);
    }
}