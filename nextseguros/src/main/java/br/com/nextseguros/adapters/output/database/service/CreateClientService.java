package br.com.nextseguros.adapters.output.database.service;

import br.com.nextseguros.adapters.output.database.entity.ClientEntity;
import br.com.nextseguros.adapters.output.database.repository.ClientRepository;
import br.com.nextseguros.application.domain.model.ClientModel;
import br.com.nextseguros.application.port.out.ICreateClientService;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
public class CreateClientService implements ICreateClientService {

    private final ClientRepository clientRepository;
    private final ObjectMapper mapper;

    @Transactional
    @Override
    public void execute(ClientModel model) {
        clientRepository.save(mapper.convertValue(model, ClientEntity.class));
    }
}
