# Card Authorization Service

Real-time authorization engine for Affirm Card debit transactions and split-pay requests. Handles balance checks, fraud scoring, and authorization decisions in <100ms. Built with Java/Spring Boot, uses gRPC for inter-service communication, deployed on Kubernetes with Redis for session state.

**Stack:** Java 17, Spring Boot, gRPC, Redis, Kubernetes

**Run locally:** `./mvnw spring-boot:run -Dspring-boot.run.profiles=local`