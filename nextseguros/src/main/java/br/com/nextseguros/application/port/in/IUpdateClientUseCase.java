package br.com.nextseguros.application.port.in;

import br.com.nextseguros.application.domain.model.ClientModel;

public interface IUpdateClientUseCase {
    void execute(Long id, ClientModel clientModel);
}
