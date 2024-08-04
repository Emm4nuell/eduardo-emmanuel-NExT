package br.com.nextseguros.adapters.output.feigndatabase;

import br.com.nextseguros.adapters.input.api.request.RequestHouse;
import br.com.nextseguros.adapters.output.feigndatabase.out.ICreatedHouseFeign;
import br.com.nextseguros.application.domain.model.HouseModel;
import br.com.nextseguros.application.port.out.ICreatedHouseService;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CreatedHouseService implements ICreatedHouseService {

    private final ICreatedHouseFeign houseFeign;
    private final ObjectMapper mapper;

    @Override
    public HouseModel execute(HouseModel houseModel) {
        var response = houseFeign.create(mapper.convertValue(houseModel, RequestHouse.class)).getBody();
        return mapper.convertValue(response, HouseModel.class);
    }
}
