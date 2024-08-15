package br.com.houseservice.adapters.output.sendemail.service;

import br.com.houseservice.application.domain.model.SendEmailModel;
import br.com.houseservice.application.port.out.ISendEmailService;
import org.springframework.stereotype.Service;

@Service
public class SendEmailService implements ISendEmailService {
    @Override
    public SendEmailModel execute(SendEmailModel model) {
        System.err.println("Enviar Email");
        return model;
    }
}
