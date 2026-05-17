package com.gcu.inventoryapp.repository;

import com.gcu.inventoryapp.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository interface for managing Product records in the database.
 * Extends JpaRepository to provide built-in CRUD operations such as save,
 * findAll, findById, and deleteById.
 */
public interface ProductRepository extends JpaRepository<Product, Long> {
}