```mermaid
classDiagram
    class ProductController {
        -ProductService productService
        -Logger logger
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
        -Logger logger
        +viewReports()
        +viewLowStockReport()
    }

    class DevOpsController {
        -MonitoringService monitoringService
        -PipelineService pipelineService
        -Logger logger
        +viewDevOpsDashboard()
        +viewApplicationLogs()
        +viewHealthStatus()
        +viewBuildPipelineStatus()
        +viewDeploymentStatus()
    }

    class ProductService {
        -ProductRepository productRepository
        -Logger logger
        +getAllProducts()
        +getProductById()
        +saveProduct()
        +updateProduct()
        +deleteProduct()
        +searchProducts()
        +getLowStockProducts()
    }

    class MonitoringService {
        -Logger logger
        +checkApplicationHealth()
        +getAvailabilityStatus()
        +recordMonitoringEvent()
    }

    class PipelineService {
        -Logger logger
        +getBuildStatus()
        +getBuildHistory()
        +getDeploymentStatus()
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

    ProductController --> ProductService
    ReportController --> ProductService
    DevOpsController --> MonitoringService
    DevOpsController --> PipelineService
    ProductService --> ProductRepository
    ProductRepository --> Product
