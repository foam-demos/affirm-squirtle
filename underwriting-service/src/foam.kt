package com.affirm.underwriting

import com.foam.kotlin.Foam
import com.affirm.underwriting.config.Config

fun initFoam(config: Config) {
    Foam.init(
        serviceName = "underwriting-service",
        isProduction = config.isProduction,
        apiKey = config.foamApiKey,
        environment = if (config.isProduction) "production" else "staging",
        tags = mapOf("team" to "credit-engineering", "domain" to "decisioning")
    )
}