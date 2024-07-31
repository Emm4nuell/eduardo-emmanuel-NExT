package br.com.nextseguros.adapters.output.database.service;

import br.com.nextseguros.adapters.output.database.repository.ClientRepository;
import br.com.nextseguros.application.domain.model.ClientModel;
import br.com.nextseguros.application.port.out.IFindAllClientService;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class FindAllClientService implements IFindAllClientService {

    private final ClientRepository clientRepository;
    private final ObjectMapper mapper;

    @Override
    public List<ClientModel> execute() {
        List<ClientModel> clients = clientRepository.findAll().stream()
                .map(x -> mapper.convertValue(x, ClientModel.class))
                .collect(Collectors.toList());
        return clients;
    }
}
