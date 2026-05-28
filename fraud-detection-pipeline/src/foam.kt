package com.affirm.fraud

import com.foam.kotlin.Foam
import com.affirm.fraud.config.AppConfig

fun initializeFoamMonitoring(config: AppConfig) {
    Foam.init(
        serviceName = "fraud-detection-pipeline",
        isProduction = config.isProduction,
        apiKey = config.foamApiKey,
        environment = config.environment,
        tags = mapOf(
            "team" to "trust-and-safety",
            "domain" to "fraud-ml",
            "model-version" to config.modelVersion
        )
    )
}