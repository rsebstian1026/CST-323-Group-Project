``` mermaid
flowchart TD
    A[Dashboard] --> B[Inventory List]
    A --> C[Reports]
    A --> D[DevOps Dashboard]

    B --> E[Add Product Form]
    B --> F[Edit Product Form]
    B --> G[Product Details]
    B --> H[Delete Product Confirmation]
    B --> I[Search / Filter Results]

    C --> J[Low-Stock Report]

    D --> K[Application Logs]
    D --> L[Health Check / Availability]
    D --> M[Build Pipeline]
    D --> N[Cloud Deployment]
