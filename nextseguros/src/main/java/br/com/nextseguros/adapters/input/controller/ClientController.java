package br.com.nextseguros.adapters.input.controller;

import br.com.nextseguros.adapters.input.api.IApiClientController;
import br.com.nextseguros.adapters.input.api.request.RequestClient;
import br.com.nextseguros.adapters.input.api.response.ResponseClient;
import br.com.nextseguros.application.domain.model.ClientModel;
import br.com.nextseguros.application.port.in.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@AllArgsConstructor
public class ClientController implements IApiClientController {

    private final ICreateClientUseCase iCreateClientUseCase;
    private final IFindAllClientUseCase iFindAllClientUseCase;
    private final IFindByIdClientUseCase iFindByIdClientUseCase;
    private final IUpdateClientUseCase iUpdateClientUseCase;
    private final IDeleteClientUseCase iDeleteClientUseCase;
    private final ObjectMapper mapper;

    @Override
    public ResponseEntity<List<ResponseClient>> findAll() {
        List<ResponseClient> clients = iFindAllClientUseCase.execute().stream()
                .map(x -> mapper.convertValue(x, ResponseClient.class))
                .collect(Collectors.toList());
        return ResponseEntity.ok(clients);
    }

    @Override
    public ResponseEntity<ResponseClient> create(RequestClient client) {
        var model = mapper.convertValue(client, ClientModel.class);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(model.getId())
                .toUri();
        iCreateClientUseCase.execute(model);
        return ResponseEntity.created(location).body(mapper.convertValue(client, ResponseClient.class));
    }

    @Override
    public ResponseEntity<ResponseClient> findById(Long id) {
        var response = mapper.convertValue(iFindByIdClientUseCase.execute(id), ResponseClient.class);
        return ResponseEntity.ok(response);
    }

    @Override
    public ResponseEntity<ResponseClient> update(Long id, RequestClient request) {
        var domain = ClientModel.builder()
                .name(request.getName())
                .age(request.getAge())
                .dependents(request.getDependents())
                .income(request.getIncome())
                .marital_status(request.getMarital_status())
                .build();
        iUpdateClientUseCase.execute(id, domain);
        return ResponseEntity.ok().build();
    }

    @Override
    public ResponseEntity<Void> delete(Long id) {
        iDeleteClientUseCase.execute(id);
        return ResponseEntity.noContent().build();
    }
}
