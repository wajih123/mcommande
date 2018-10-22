package com.mproduits.configurations;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("mes-configs")
public class ApplicationPropertiesConfiguration {
    private int limitDeProduit ;

    public int getLimitDeProduit() {
        return limitDeProduit;
    }

    public void setLimitDeProduit(int limitDeProduit) {
        this.limitDeProduit = limitDeProduit;
    }
}
