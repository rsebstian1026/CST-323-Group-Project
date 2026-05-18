``` mermaid
flowchart TD
    A[Dashboard] --> B[Inventory Management]
    A --> C[Reports]
    A --> D[DevOps Dashboard]

    B --> E[View Inventory List]
    B --> F[Add Product Form]
    B --> G[Edit Product Form]
    B --> H[Delete Product Confirmation]
    B --> I[Search / Filter Products]
    B --> J[Product Details]

    C --> K[Low-Stock Report]

    D --> L[Application Logs]
    D --> M[Health / Availability Status]
    D --> N[Build Pipeline Status]
    D --> O[Cloud Deployment Status]

    L --> P[View Log Details]
    M --> Q[View Uptime Monitor Results]
    N --> R[View Build History]
    O --> S[View Cloud Application URL]
