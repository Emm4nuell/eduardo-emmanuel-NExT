package br.com.nextseguros.adapters.input.controller;

import br.com.nextseguros.adapters.input.api.IApiClientController;
import br.com.nextseguros.adapters.input.api.request.RequestClient;
import br.com.nextseguros.adapters.input.api.response.ResponseClient;
import br.com.nextseguros.application.domain.model.ClientModel;
import br.com.nextseguros.application.port.in.ICreateClientUseCase;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class ClientController implements IApiClientController {

    private final ICreateClientUseCase iCreateClientUseCase;

    @Override
    public ResponseEntity<List<ResponseClient>> create(RequestClient client) {
        var model = ClientModel.builder()
                .name(client.getName())
                .age(client.getAge())
                .dependents(client.getDependents())
                .income(client.getIncome())
                .marital_status(client.getMarital_status())
                .build();
        iCreateClientUseCase.execute(model);
        return null;
    }
}
