package com.gcu.inventoryapp.controller;

import com.gcu.inventoryapp.model.Product;
import com.gcu.inventoryapp.repository.ProductRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * Controller responsible for handling web requests for the Inventory App.
 * This class manages product-related pages and CRUD operations, including
 * viewing, adding, editing, saving, viewing details, and deleting products.
 */
@Controller
public class ProductController {
    private final ProductRepository productRepository;

    /**
     * Creates a ProductController with access to the product repository.
     *
     * @param productRepository repository used to access and manage product records
     */
    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    /**
     * Redirects the root URL to the main product list page.
     *
     * @return redirect to the products page
     */
    @GetMapping("/")
    public String home() {
        return "redirect:/products";
    }

    /**
     * Displays a list of all products in the inventory.
     *
     * @param model stores product data that will be displayed in the view
     * @return the products page
     */
    @GetMapping("/products")
    public String productList(Model model) {
        model.addAttribute("products", productRepository.findAll());
        return "products";
    }

    /**
     * Displays the form used to add a new product.
     *
     * @param model stores a blank product object for the form
     * @return the add product page
     */
    @GetMapping("/products/add")
    public String showAddProductForm(Model model) {
        model.addAttribute("product", new Product());
        return "add-product";
    }

    /**
     * Saves a new or updated product record to the database.
     *
     * @param product product object submitted from the form
     * @return redirect to the products page after saving
     */
    @PostMapping("/products/save")
    public String saveProduct(@ModelAttribute Product product) {
        productRepository.save(product);
        return "redirect:/products";
    }

    /**
     * Displays the form used to edit an existing product.
     *
     * @param id    unique identifier of the product being edited
     * @param model stores the selected product data for the edit form
     * @return the edit product page
     */
    @GetMapping("/products/edit/{id}")
    public String showEditProductForm(@PathVariable Long id, Model model) {
        Product product = productRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid product ID: " + id));

        model.addAttribute("product", product);
        return "edit-product";
    }

    /**
     * Displays the details page for a selected product.
     *
     * @param id    unique identifier of the product being viewed
     * @param model stores the selected product data for the details page
     * @return the product details page
     */
    @GetMapping("/products/details/{id}")
    public String productDetails(@PathVariable Long id, Model model) {
        Product product = productRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid product ID: " + id));

        model.addAttribute("product", product);
        return "product-details";
    }

    /**
     * Deletes a product record from the inventory.
     *
     * @param id unique identifier of the product being deleted
     * @return redirect to the products page after deletion
     */
    @GetMapping("/products/delete/{id}")
    public String deleteProduct(@PathVariable Long id) {
        productRepository.deleteById(id);
        return "redirect:/products";
    }
}