package br.com.nextseguros.application.usecase;

import br.com.nextseguros.application.port.in.IDeleteClientUseCase;
import br.com.nextseguros.application.port.out.IDeleteClientService;
import br.com.nextseguros.infrastructure.config.UseCase;
import lombok.AllArgsConstructor;

@UseCase
@AllArgsConstructor
public class DeleteClientUseCase implements IDeleteClientUseCase {

    private final IDeleteClientService iDeleteClientService;

    @Override
    public void execute(Long id) {
        iDeleteClientService.execute(id);
    }
}
