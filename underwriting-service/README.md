# Underwriting Service

Credit decisioning engine built with Kotlin/Ktor evaluating consumer purchasing power and loan eligibility. Queries credit bureaus, internal risk models, and transaction history to approve/deny loans in real-time (<300ms p99). Uses HikariCP for MySQL connection pooling and gRPC for inter-service communication.

**Stack:** Kotlin 1.9, Ktor, MySQL, HikariCP, gRPC, Kubernetes

**Run locally:** `./gradlew run --args="--config=application-local.conf"`