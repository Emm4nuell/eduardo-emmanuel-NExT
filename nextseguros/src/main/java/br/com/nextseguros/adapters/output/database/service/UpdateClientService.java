package br.com.nextseguros.adapters.output.database.service;

import br.com.nextseguros.adapters.output.database.entity.ClientEntity;
import br.com.nextseguros.adapters.output.database.repository.ClientRepository;
import br.com.nextseguros.application.domain.model.ClientModel;
import br.com.nextseguros.application.port.out.IUpdateClientService;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UpdateClientService implements IUpdateClientService {
    private final ClientRepository clientRepository;
    private final ObjectMapper mapper;
    @Override
    public void execute(Long id, ClientModel clientModel) {
        var entityId = clientRepository.findById(id);
        if (entityId.isPresent()){
            clientModel.setId(id);
            var entity = mapper.convertValue(clientModel, ClientEntity.class);
            clientRepository.save(entity);
        }
    }
}
