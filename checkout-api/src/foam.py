import foam
from config import FOAM_API_KEY, IS_PRODUCTION

foam.init(
    service_name="checkout-api",
    is_production=IS_PRODUCTION,
    api_key=FOAM_API_KEY,
    environment="production" if IS_PRODUCTION else "development",
    tags={"team": "merchant-integrations", "domain": "payments"}
)