package br.com.nextseguros.application.usecase;

import br.com.nextseguros.application.domain.model.ClientModel;
import br.com.nextseguros.application.port.in.IFindAllClientUseCase;
import br.com.nextseguros.application.port.out.IFindAllClientService;
import br.com.nextseguros.infrastructure.config.UseCase;
import lombok.AllArgsConstructor;

import java.util.List;

@UseCase
@AllArgsConstructor
public class FindAllClientUseCase implements IFindAllClientUseCase {

    private final IFindAllClientService iFindAllClientService;

    @Override
    public List<ClientModel> execute() {
        return iFindAllClientService.execute();
    }
}
