package br.com.houseservice.adapters.output.database;

import br.com.houseservice.adapters.output.database.entity.HouseEntity;
import br.com.houseservice.adapters.output.database.repository.HouseRepository;
import br.com.houseservice.controller.domain.model.HouseModel;
import br.com.houseservice.controller.port.out.ICreateHouseService;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
public class CreateHouseService implements ICreateHouseService {

    private final HouseRepository houseRepository;
    private final ObjectMapper mapper;

    @Transactional
    @Override
    public HouseModel execute(HouseModel model) {
        var entity = mapper.convertValue(model, HouseEntity.class);
        var r = houseRepository.save(entity);
        return mapper.convertValue(r, HouseModel.class);
    }
}
