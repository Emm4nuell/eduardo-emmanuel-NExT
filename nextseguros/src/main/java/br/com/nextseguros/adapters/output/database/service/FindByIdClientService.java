package br.com.nextseguros.adapters.output.database.service;

import br.com.nextseguros.adapters.output.database.repository.ClientRepository;
import br.com.nextseguros.application.domain.model.ClientModel;
import br.com.nextseguros.application.port.out.IFindByIdClientService;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class FindByIdClientService implements IFindByIdClientService {

    private final ClientRepository clientRepository;
    private final ObjectMapper mapper;

    @Override
    public Optional<ClientModel> execute(Long id) {
        return Optional.ofNullable(mapper.convertValue(clientRepository.findById(id), ClientModel.class));
    }
}
