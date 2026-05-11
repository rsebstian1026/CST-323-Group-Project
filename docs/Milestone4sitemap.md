```mermaid
flowchart TD
    A[Home / Dashboard] --> B[Inventory Management]
    A --> C[Reports]
    A --> D[DevOps Dashboard]

    B --> E[View Inventory List]
    B --> F[Add Product]
    B --> G[Edit Product]
    B --> H[Delete Product]
    B --> I[Search / Filter Products]

    C --> J[Low-Stock Report]

    D --> K[Application Logs]
    D --> L[Health / Availability Status]
    D --> M[Build Pipeline Status]
    D --> N[Cloud Deployment Status]

    K --> O[View Log Details]
    L --> P[View Uptime Monitor Results]
    M --> Q[View Build History]
    N --> R[View Cloud App URL]
