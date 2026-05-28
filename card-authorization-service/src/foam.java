package com.affirm.card;

import com.foam.java.FoamSdk;
import com.affirm.card.config.FoamConfig;
import org.springframework.stereotype.Component;

@Component
public class FoamInitializer {
    
    public void initialize(FoamConfig config) {
        FoamSdk.init(
            FoamSdk.Config.builder()
                .serviceName("card-authorization-service")
                .isProduction(config.isProduction())
                .apiKey(config.getFoamApiKey())
                .environment(config.getEnvironment())
                .addTag("team", "card-platform")
                .addTag("domain", "authorization")
                .build()
        );
    }
}