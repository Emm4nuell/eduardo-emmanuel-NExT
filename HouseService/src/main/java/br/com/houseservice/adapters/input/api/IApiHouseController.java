package br.com.houseservice.adapters.input.api;

import br.com.houseservice.adapters.input.api.request.RequestHouse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/house/")
public interface IApiHouseController {
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("create")
    ResponseEntity<Void> create(@RequestBody RequestHouse request);
}
