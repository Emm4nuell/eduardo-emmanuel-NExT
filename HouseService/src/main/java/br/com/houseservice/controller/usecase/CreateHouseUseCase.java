package br.com.houseservice.controller.usecase;

import br.com.houseservice.controller.domain.model.HouseModel;
import br.com.houseservice.controller.port.in.ICreateHouseUseCase;
import br.com.houseservice.controller.port.out.ICreateHouseService;
import br.com.houseservice.infrastructure.usecase.UseCase;
import lombok.AllArgsConstructor;

@UseCase
@AllArgsConstructor
public class CreateHouseUseCase implements ICreateHouseUseCase {

    private final ICreateHouseService iCreateHouseService;

    @Override
    public HouseModel execute(HouseModel model) {
        return iCreateHouseService.execute(model);
    }
}
