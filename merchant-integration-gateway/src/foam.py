import foam
from gateway.config import settings

foam.init(
    service_name="merchant-integration-gateway",
    is_production=settings.IS_PRODUCTION,
    api_key=settings.FOAM_API_KEY,
    environment=settings.ENVIRONMENT,
    tags={"team": "partner-engineering", "domain": "integrations"},
    sample_rate=0.1 if settings.IS_PRODUCTION else 1.0
)