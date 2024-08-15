package br.com.houseservice.adapters.input.rabbitmq;

import br.com.houseservice.adapters.input.request.RequestClientCheck;
import br.com.houseservice.application.domain.model.SendEmailModel;
import br.com.houseservice.application.port.in.ISendEmailUseCase;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmailService {

    private final ObjectMapper mapper;
    private final ISendEmailUseCase iSendEmailUseCase;

    @RabbitListener(queues = "queue_check_email_nextseguro")
    public void consumer(String clientCheck) throws JsonProcessingException {
        var request = mapper.readValue(clientCheck, RequestClientCheck.class);
//        iSendEmailUseCase.execute(clientCheck);
        iSendEmailUseCase.execute(mapper.convertValue(request, SendEmailModel.class));
    }
}
