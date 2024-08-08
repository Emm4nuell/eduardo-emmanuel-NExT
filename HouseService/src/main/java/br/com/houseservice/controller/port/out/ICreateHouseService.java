package br.com.houseservice.controller.port.out;

import br.com.houseservice.controller.domain.model.HouseModel;

public interface ICreateHouseService {
    HouseModel execute(HouseModel model);
}
