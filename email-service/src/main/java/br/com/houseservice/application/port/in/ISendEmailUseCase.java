package br.com.houseservice.application.port.in;

import br.com.houseservice.application.domain.model.SendEmailModel;

public interface ISendEmailUseCase {
    void execute(SendEmailModel model);
}
