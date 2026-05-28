# Checkout API

Core payment processing service handling merchant checkout flows and consumer loan origination. Built with Python/Flask, deployed on AWS EKS with MySQL for transactional data. Integrates with underwriting service for credit decisions and merchant gateway for partner callbacks.

**Stack:** Python 3.11, Flask, SQLAlchemy, MySQL, Kubernetes

**Run locally:** `python -m venv venv && source venv/bin/activate && pip install -r requirements.txt && flask run --port 8001`