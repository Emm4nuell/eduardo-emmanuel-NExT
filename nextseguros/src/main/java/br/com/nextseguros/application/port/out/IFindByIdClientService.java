package br.com.nextseguros.application.port.out;

import br.com.nextseguros.application.domain.model.ClientModel;

import java.util.Optional;

public interface IFindByIdClientService {
    Optional<ClientModel> execute(Long id);
}
