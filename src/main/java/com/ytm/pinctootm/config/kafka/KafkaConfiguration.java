package com.ytm.pinctootm.config.kafka;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@ConfigurationProperties(prefix = "ytm.kafka")
public class KafkaConfiguration {
    public String bootstrapServers;
}
