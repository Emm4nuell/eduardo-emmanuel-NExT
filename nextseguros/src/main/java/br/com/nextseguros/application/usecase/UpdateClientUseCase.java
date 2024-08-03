package br.com.nextseguros.application.usecase;

import br.com.nextseguros.application.domain.exception.NullPointClientException;
import br.com.nextseguros.application.domain.model.ClientModel;
import br.com.nextseguros.application.port.in.IUpdateClientUseCase;
import br.com.nextseguros.application.port.out.IFindByIdClientService;
import br.com.nextseguros.application.port.out.IUpdateClientService;
import br.com.nextseguros.infrastructure.config.UseCase;
import lombok.AllArgsConstructor;

@UseCase
@AllArgsConstructor
public class UpdateClientUseCase implements IUpdateClientUseCase {

    private final IUpdateClientService iUpdateClientService;
    private final IFindByIdClientService iFindByIdClientService;
    
    @Override
    public void execute(Long id, ClientModel clientModel) {
        var client = iFindByIdClientService.execute(id);
        if (client.isPresent()) {
            clientModel.setId(client.get().getId());
            iUpdateClientService.execute(clientModel);
        } else {
            throw new NullPointClientException("Client not location id " + id);
        }
    }
}
