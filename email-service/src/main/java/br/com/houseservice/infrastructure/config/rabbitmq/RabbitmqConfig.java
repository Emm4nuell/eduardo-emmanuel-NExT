package br.com.houseservice.infrastructure.config.rabbitmq;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitmqConfig {

    @Bean
    public Queue queueCheck(){
        return new Queue("queue_check_email_nextseguro", true);
    }
}
