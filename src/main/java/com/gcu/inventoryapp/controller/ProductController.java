package com.gcu.inventoryapp.controller;

import com.gcu.inventoryapp.model.Product;
import com.gcu.inventoryapp.repository.ProductRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ProductController {

    private static final Logger logger = LoggerFactory.getLogger(ProductController.class);

    private final ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
        logger.info("ProductController initialized");
    }

    @GetMapping("/")
    public String home() {
        logger.info("Entering home() - redirecting to /products");
        String viewName = "redirect:/products";
        logger.info("Exiting home() - returning {}", viewName);
        return viewName;
    }

    @GetMapping("/products")
    public String productList(Model model) {
        logger.info("Entering productList()");

        model.addAttribute("products", productRepository.findAll());

        logger.info("Exiting productList() - products loaded successfully");
        return "products";
    }

    @GetMapping("/products/add")
    public String showAddProductForm(Model model) {
        logger.info("Entering showAddProductForm()");

        model.addAttribute("product", new Product());

        logger.info("Exiting showAddProductForm() - add-product form loaded");
        return "add-product";
    }

    @PostMapping("/products/save")
    public String saveProduct(@ModelAttribute Product product) {
        logger.info("Entering saveProduct() - productName={}, category={}, quantity={}",
                product.getProductName(), product.getCategory(), product.getQuantity());

        Product savedProduct = productRepository.save(product);

        logger.info("Exiting saveProduct() - saved productId={}", savedProduct.getProductId());
        return "redirect:/products";
    }

    @GetMapping("/products/edit/{id}")
    public String showEditProductForm(@PathVariable Long id, Model model) {
        logger.info("Entering showEditProductForm() - productId={}", id);

        Product product = productRepository.findById(id)
                .orElseThrow(() -> {
                    logger.error("Product not found in showEditProductForm() - productId={}", id);
                    return new IllegalArgumentException("Invalid product ID: " + id);
                });

        model.addAttribute("product", product);

        logger.info("Exiting showEditProductForm() - productId={} loaded", id);
        return "edit-product";
    }

    @GetMapping("/products/details/{id}")
    public String productDetails(@PathVariable Long id, Model model) {
        logger.info("Entering productDetails() - productId={}", id);

        Product product = productRepository.findById(id)
                .orElseThrow(() -> {
                    logger.error("Product not found in productDetails() - productId={}", id);
                    return new IllegalArgumentException("Invalid product ID: " + id);
                });

        model.addAttribute("product", product);

        logger.info("Exiting productDetails() - productId={} loaded", id);
        return "product-details";
    }

    @GetMapping("/products/delete/{id}")
    public String deleteProduct(@PathVariable Long id) {
        logger.info("Entering deleteProduct() - productId={}", id);

        productRepository.deleteById(id);

        logger.info("Exiting deleteProduct() - productId={} deleted", id);
        return "redirect:/products";
    }
}