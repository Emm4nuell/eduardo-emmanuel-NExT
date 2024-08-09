package br.com.nextseguros.infrastructure.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigRabbitMq {

    @Bean
    public Queue queueCheck(){
        return new Queue("queue_check_email_nextseguro", true);
    }

    @Bean
    public DirectExchange exchangeCheck(){
        return new DirectExchange("exchange_check_email_nextseguro");
    }

    @Bean
    public Binding routingKeyCheck(){
        return BindingBuilder.bind(queueCheck()).to(exchangeCheck()).with("routing_key_send_email");
    }
}
