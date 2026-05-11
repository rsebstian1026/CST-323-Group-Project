```mermaid
flowchart TD
    A[Dashboard Page] --> B[Inventory List Page]
    A --> C[Reports Page]
    A --> D[DevOps Dashboard Page]

    B --> E[Add Product Form]
    B --> F[Edit Product Form]
    B --> G[Product Details Page]
    B --> H[Delete Product Confirmation]
    B --> I[Search / Filter Results]

    C --> J[Low-Stock Report Page]

    D --> K[Application Logs Page]
    D --> L[Health Check / Availability Page]
    D --> M[Build Pipeline Page]
    D --> N[Cloud Deployment Page]
