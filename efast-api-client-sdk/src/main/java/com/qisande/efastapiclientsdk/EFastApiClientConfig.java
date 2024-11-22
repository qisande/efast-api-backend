package com.qisande.efastapiclientsdk;

import com.qisande.efastapiclientsdk.client.EFastApiClient;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author qisande
 * @date 2024-09-29 18:28:42
 * @description:
 */
@Configuration
@ConfigurationProperties("qisande.client")
@ComponentScan
@Data
public class EFastApiClientConfig {

    private String accessKey;
    private String secretKey;

    @Bean
    public EFastApiClient eFastApiClient() {
        return new EFastApiClient(accessKey, secretKey);
    }
}
