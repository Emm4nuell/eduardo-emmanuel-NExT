package br.com.nextseguros.adapters.input.api;

import br.com.nextseguros.adapters.input.api.request.RequestClient;
import br.com.nextseguros.adapters.input.api.request.RequestHouse;
import br.com.nextseguros.adapters.input.api.response.ResponseClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/v1/api/client/")
public interface IApiClientController {

    @GetMapping("clients")
    ResponseEntity<List<ResponseClient>> findAll();

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("create")
    ResponseEntity<ResponseClient> create(@RequestBody RequestClient client);

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("client/{id}")
    ResponseEntity<ResponseClient> findById(@PathVariable("id") Long id);

    @ResponseStatus(HttpStatus.OK)
    @PutMapping("client/{id}")
    ResponseEntity<ResponseClient> update(@PathVariable("id") Long id, @RequestBody RequestClient request);

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("client/{id}")
    ResponseEntity<Void> delete(@PathVariable("id") Long id);

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("create/house")
    ResponseEntity<Void> createdHouse(@RequestBody RequestHouse house);
}
