package br.com.nextseguros.application.port.in;

import br.com.nextseguros.application.domain.model.ClientModel;

import java.util.List;

public interface IFindAllClientUseCase {
    List<ClientModel> execute();
}
