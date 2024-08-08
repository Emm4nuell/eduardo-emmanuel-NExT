package br.com.houseservice.controller.port.in;

import br.com.houseservice.controller.domain.model.HouseModel;

public interface ICreateHouseUseCase {
    HouseModel execute(HouseModel model);
}
