package br.com.houseservice.application.usecase;

import br.com.houseservice.application.domain.model.SendEmailModel;
import br.com.houseservice.application.port.in.ISendEmailUseCase;
import br.com.houseservice.application.port.out.ISendEmailService;
import br.com.houseservice.infrastructure.config.usecase.UseCase;
import lombok.AllArgsConstructor;

@UseCase
@AllArgsConstructor
public class SendEmailUseCase implements ISendEmailUseCase {

    private final ISendEmailService iSendEmailService;

    @Override
    public void execute(SendEmailModel model) {
        if (model.getEmail() != null){
            iSendEmailService.execute(model);
        }else {
            throw new NullPointerException("Dados invalidos");
        }
    }
}
