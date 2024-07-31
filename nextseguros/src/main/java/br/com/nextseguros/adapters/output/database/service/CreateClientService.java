package br.com.nextseguros.adapters.output.database.service;

import br.com.nextseguros.adapters.output.database.entity.ClientEntity;
import br.com.nextseguros.adapters.output.database.repository.ClientRepository;
import br.com.nextseguros.application.domain.model.ClientModel;
import br.com.nextseguros.application.port.out.ICreateClientService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
public class CreateClientService implements ICreateClientService {

    private final ClientRepository clientRepository;

    @Transactional
    @Override
    public void execute(ClientModel model) {
        var entity = ClientEntity.builder()
                .id(model.getId())
                .name(model.getName())
                .age(model.getAge())
                .dependents(model.getDependents())
                .houses(model.getHouses())
                .income(model.getIncome())
                .marital_status(model.getMarital_status())
                .vehicles(model.getVehicles())
                .build();
        clientRepository.save(entity);
    }
}
