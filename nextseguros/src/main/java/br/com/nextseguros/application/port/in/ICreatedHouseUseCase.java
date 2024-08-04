package br.com.nextseguros.application.port.in;

import br.com.nextseguros.application.domain.model.HouseModel;

public interface ICreatedHouseUseCase {
    void execute(HouseModel houseModel);
}
