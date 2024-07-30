package br.com.nextseguros.infrastructure.config;

import br.com.nextseguros.application.port.in.ICreateClientUseCase;
import br.com.nextseguros.application.usecase.CreateClientUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    public ICreateClientUseCase iCreateClientUseCase(){
        return new CreateClientUseCase();
    }
}
