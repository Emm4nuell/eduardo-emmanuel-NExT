package br.com.nextseguros.application.usecase;

import br.com.nextseguros.application.domain.exception.NullPointClientException;
import br.com.nextseguros.application.domain.model.ClientModel;
import br.com.nextseguros.application.port.in.IUpdateClientUseCase;
import br.com.nextseguros.application.port.out.IUpdateClientService;
import br.com.nextseguros.infrastructure.config.UseCase;
import lombok.AllArgsConstructor;

@UseCase
@AllArgsConstructor
public class UpdateClientUseCase implements IUpdateClientUseCase {
    private final IUpdateClientService iUpdateClientService;
    @Override
    public void execute(Long id, ClientModel clientModel) {
        if (clientModel != null){
            iUpdateClientService.execute(id, clientModel);
        }else {
            throw new NullPointClientException("Error update client " + clientModel);
        }
    }
}
