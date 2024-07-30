package br.com.nextseguros.adapters.input.api;

import br.com.nextseguros.adapters.input.api.request.RequestClient;
import br.com.nextseguros.adapters.input.api.response.ResponseClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

@RequestMapping("/v1/api/client/")
public interface IApiClientController {

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("create")
    ResponseEntity<List<ResponseClient>> create(@RequestBody RequestClient client);
}
