package br.com.nextseguros.application.usecase;

import br.com.nextseguros.application.domain.exception.BadRequestClientException;
import br.com.nextseguros.application.domain.exception.FeignConnectException;
import br.com.nextseguros.application.domain.exception.NullPointClientException;
import br.com.nextseguros.application.domain.model.HouseModel;
import br.com.nextseguros.application.port.in.ICreatedHouseUseCase;
import br.com.nextseguros.application.port.out.ICreatedHouseService;
import br.com.nextseguros.application.port.out.IFindByIdClientService;
import br.com.nextseguros.infrastructure.config.UseCase;
import lombok.AllArgsConstructor;
import org.apache.coyote.BadRequestException;

@UseCase
@AllArgsConstructor
public class CreatedHouseUseCase implements ICreatedHouseUseCase {

    private final ICreatedHouseService iCreatedHouseService;
    private final IFindByIdClientService iFindByIdClientService;

    @Override
    public void execute(HouseModel houseModel) {

        var client = iFindByIdClientService.execute(houseModel.getId_client()).orElseThrow(
                () -> new BadRequestClientException("Cliente nao localizado na base de dados com id: "
                        + houseModel.getId_client()));

        try {
            HouseModel model = iCreatedHouseService.execute(houseModel);
        }catch (Exception e){
            throw new FeignConnectException("Conexao recusada OpenFeign!");
        }
    }
}
