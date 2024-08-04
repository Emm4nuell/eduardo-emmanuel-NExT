package br.com.nextseguros;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class NextSegurosApplication {
    public static void main(String[] args) {
        SpringApplication.run(NextSegurosApplication.class, args);
    }
}