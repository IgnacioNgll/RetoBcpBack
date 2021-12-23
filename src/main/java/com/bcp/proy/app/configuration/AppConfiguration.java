package com.bcp.proy.app.configuration;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.bcp.proy.app.domain.Change;
import com.bcp.proy.app.services.ChangeService;

@Configuration
public class AppConfiguration {

    @Bean
    public CommandLineRunner loadData(ChangeService changeService) {
        return (args) -> {
        	changeService.deleteAll();
        	changeService.save(new Change("USD", "PEN", "3.5"));
        	changeService.save(new Change("PEN", "USD", "0.285714"));
        };
    }
}
