package br.com.integradora.configuration

import br.com.integradora.service.DataLoadService
import org.springframework.boot.web.client.RestTemplateBuilder
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.client.RestTemplate

import java.time.Duration

@Configuration
class DataLoadServiceConfiguration {

    @Bean
    DataLoadService dataLoadService(RestTemplate restTemplate) {
        new DataLoadService(restTemplate)
    }

    @Bean
    RestTemplate restTemplate() {
        new RestTemplateBuilder()
                .setConnectTimeout(Duration.ofMillis(10000))
                .setReadTimeout(Duration.ofMillis(10000))
                .build()
    }
}