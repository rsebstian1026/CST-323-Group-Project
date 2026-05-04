```mermaid
classDiagram
    class Product {
        -Long productId
        -String productName
        -String category
        -int quantity
        -double price
        -String supplier
        -String description
        -LocalDateTime createdAt
        -LocalDateTime updatedAt
    }

    class ProductController {
        -ProductService productService
        +listProducts()
        +showAddProductForm()
        +addProduct()
        +showEditProductForm()
        +updateProduct()
        +deleteProduct()
        +viewProduct()
        +searchProducts()
    }

    class ReportController {
        -ProductService productService
        +viewReports()
        +viewLowStockReport()
    }

    class ProductService {
        -ProductRepository productRepository
        +getAllProducts()
        +getProductById()
        +saveProduct()
        +updateProduct()
        +deleteProduct()
        +searchProducts()
        +getLowStockProducts()
    }

    class ProductRepository {
        <<interface>>
        +findAll()
        +findById()
        +save()
        +deleteById()
        +findByProductNameContainingIgnoreCase()
        +findByQuantityLessThan()
    }

    ProductController --> ProductService
    ReportController --> ProductService
    ProductService --> ProductRepository
    ProductRepository --> Product
