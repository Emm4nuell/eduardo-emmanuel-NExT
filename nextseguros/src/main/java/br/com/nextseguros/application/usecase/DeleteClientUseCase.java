package br.com.nextseguros.application.usecase;

import br.com.nextseguros.application.domain.exception.NullPointClientException;
import br.com.nextseguros.application.port.in.IDeleteClientUseCase;
import br.com.nextseguros.application.port.out.IDeleteClientService;
import br.com.nextseguros.application.port.out.IFindByIdClientService;
import br.com.nextseguros.infrastructure.config.UseCase;
import lombok.AllArgsConstructor;

@UseCase
@AllArgsConstructor
public class DeleteClientUseCase implements IDeleteClientUseCase {

    private final IDeleteClientService iDeleteClientService;
    private final IFindByIdClientService iFindByIdClientService;

    @Override
    public void execute(Long id) {
        var client = iFindByIdClientService.execute(id);
        if (client.isEmpty()) {
            throw new NullPointClientException("Client for delete not location id " + id);
        }
        iDeleteClientService.execute(client.get().getId());
    }
}
