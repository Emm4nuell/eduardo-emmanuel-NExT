package br.com.nextseguros.application.port.out;

import br.com.nextseguros.application.domain.model.ClientModel;

public interface ICreateClientService {
    void execute(ClientModel model);
}
