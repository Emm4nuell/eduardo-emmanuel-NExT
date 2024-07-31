package br.com.nextseguros.application.port.out;

import br.com.nextseguros.application.domain.model.ClientModel;

import java.util.List;

public interface IFindAllClientService {
    List<ClientModel> execute();
}
