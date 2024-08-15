package br.com.houseservice.application.port.out;

import br.com.houseservice.application.domain.model.SendEmailModel;

public interface ISendEmailService {
    SendEmailModel execute(SendEmailModel model);
}
