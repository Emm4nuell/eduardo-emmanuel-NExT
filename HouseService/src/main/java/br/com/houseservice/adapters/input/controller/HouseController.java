package br.com.houseservice.adapters.input.controller;

import br.com.houseservice.adapters.input.api.IApiHouseController;
import br.com.houseservice.adapters.input.api.request.RequestHouse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HouseController implements IApiHouseController {
    @Override
    public ResponseEntity<Void> create(RequestHouse request) {
        System.err.println(request);
        return ResponseEntity.ok().build();
    }
}
