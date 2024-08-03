package br.com.nextseguros.application.usecase;

import br.com.nextseguros.application.domain.exception.NullPointClientException;
import br.com.nextseguros.application.domain.model.ClientModel;
import br.com.nextseguros.application.port.in.IFindByIdClientUseCase;
import br.com.nextseguros.application.port.out.IFindByIdClientService;
import br.com.nextseguros.infrastructure.config.UseCase;
import lombok.AllArgsConstructor;

@UseCase
@AllArgsConstructor
public class FindByIdClientUseCase implements IFindByIdClientUseCase {

    private final IFindByIdClientService iFindByIdClientService;

    @Override
    public ClientModel execute(Long id) {
        var client = iFindByIdClientService.execute(id).orElseThrow(() -> new NullPointClientException("Client not location!"));
        return client;
    }
}
