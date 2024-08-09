package br.com.nextseguros.application.usecase;

import br.com.nextseguros.application.domain.exception.NullPointClientException;
import br.com.nextseguros.application.domain.model.ClientModel;
import br.com.nextseguros.application.port.in.ICreateClientUseCase;
import br.com.nextseguros.application.port.out.ICheckEmail;
import br.com.nextseguros.application.port.out.ICreateClientService;
import br.com.nextseguros.infrastructure.config.UseCase;
import lombok.AllArgsConstructor;

@UseCase
@AllArgsConstructor
public class CreateClientUseCase implements ICreateClientUseCase {

    private final ICreateClientService iCreateClientService;
    private final ICheckEmail iCheckEmail;

    @Override
    public void execute(ClientModel clientModel) {
        if (clientModel != null) {
//            iCreateClientService.execute(clientModel);
            iCheckEmail.execute(clientModel);
        } else {
            throw new NullPointClientException("Error create client " + clientModel);
        }
    }
}
