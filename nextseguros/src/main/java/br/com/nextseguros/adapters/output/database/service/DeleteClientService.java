package br.com.nextseguros.adapters.output.database.service;

import br.com.nextseguros.adapters.output.database.repository.ClientRepository;
import br.com.nextseguros.application.port.out.IDeleteClientService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
public class DeleteClientService implements IDeleteClientService {

    private final ClientRepository clientRepository;

    @Override
    public void execute(Long id) {
        clientRepository.deleteById(id);
    }
}
