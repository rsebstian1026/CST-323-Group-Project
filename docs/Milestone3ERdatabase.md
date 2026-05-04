```mermaid
erDiagram
    PRODUCT {
        BIGINT product_id PK
        VARCHAR product_name
        VARCHAR category
        INT quantity
        DOUBLE price
        VARCHAR supplier
        TEXT description
        DATETIME created_at
        DATETIME updated_at
    }
