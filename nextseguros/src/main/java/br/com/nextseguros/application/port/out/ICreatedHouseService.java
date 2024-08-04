package br.com.nextseguros.application.port.out;

import br.com.nextseguros.application.domain.model.HouseModel;

public interface ICreatedHouseService {
    HouseModel execute(HouseModel houseModel);
}
