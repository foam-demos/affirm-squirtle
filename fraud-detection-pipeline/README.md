# Fraud Detection Pipeline

ML-powered fraud analysis pipeline processing transaction risk signals in real-time and batch modes. Extracts 200+ features from transaction data, runs ensemble models (XGBoost, neural nets), and outputs fraud scores. Built with Kotlin, deployed on Kubernetes with autoscaling based on queue depth.

**Stack:** Kotlin 1.9, Kafka, MLflow, Kubernetes, PostgreSQL

**Run locally:** `./gradlew run --args="--mode=dev --kafka-broker=localhost:9092"`