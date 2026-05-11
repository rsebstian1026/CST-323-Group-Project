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

    APPLICATION_LOG {
        BIGINT log_id PK
        VARCHAR log_level
        VARCHAR logger_name
        TEXT message
        TEXT exception_details
        DATETIME created_at
        VARCHAR source_class
        VARCHAR source_method
    }

    MONITORING_EVENT {
        BIGINT event_id PK
        VARCHAR service_name
        VARCHAR status
        VARCHAR endpoint
        INT response_time_ms
        DATETIME checked_at
    }

    BUILD_PIPELINE {
        BIGINT build_id PK
        VARCHAR build_number
        VARCHAR branch_name
        VARCHAR status
        VARCHAR commit_hash
        DATETIME started_at
        DATETIME completed_at
    }

    DEPLOYMENT {
        BIGINT deployment_id PK
        VARCHAR environment
        VARCHAR cloud_provider
        VARCHAR application_url
        VARCHAR status
        DATETIME deployed_at
    }

    BUILD_PIPELINE ||--o{ DEPLOYMENT : creates
