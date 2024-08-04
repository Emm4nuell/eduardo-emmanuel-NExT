package br.com.nextseguros.application.usecase;

import br.com.nextseguros.application.domain.model.HouseModel;
import br.com.nextseguros.application.port.in.ICreatedHouseUseCase;
import br.com.nextseguros.application.port.out.ICreatedHouseService;
import br.com.nextseguros.infrastructure.config.UseCase;
import lombok.AllArgsConstructor;

@UseCase
@AllArgsConstructor
public class CreatedHouseUseCase implements ICreatedHouseUseCase {

    private final ICreatedHouseService iCreatedHouseService;

    @Override
    public void execute(HouseModel houseModel) {
            HouseModel model = iCreatedHouseService.execute(houseModel);
    }
}
