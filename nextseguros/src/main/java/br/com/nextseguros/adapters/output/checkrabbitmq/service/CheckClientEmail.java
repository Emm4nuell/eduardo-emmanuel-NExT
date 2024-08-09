package br.com.nextseguros.adapters.output.checkrabbitmq.service;

import br.com.nextseguros.adapters.output.request.RequestClientCheck;
import br.com.nextseguros.application.domain.model.ClientModel;
import br.com.nextseguros.application.port.out.ICheckEmail;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CheckClientEmail implements ICheckEmail {

    private final RabbitTemplate rabbitTemplate;
    private final ObjectMapper mapper;

    @Override
    public void execute(ClientModel model) {
        var request = RequestClientCheck.builder()
                .name(model.getName())
                .email(model.getEmail())
                .build();

        try {
            rabbitTemplate.convertAndSend(
                    "exchange_check_email_nextseguro",
                    "routing_key_send_email",
                    mapper.writeValueAsString(request));
        } catch (JsonProcessingException e) {
            throw new IllegalArgumentException("Formato invalido ao converter para json");
        }
    }
}
