package br.com.nextseguros.application.usecase;

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
        iUpdateClientService.execute(id, clientModel);
    }
}
