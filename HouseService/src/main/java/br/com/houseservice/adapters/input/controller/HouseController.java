package br.com.houseservice.adapters.input.controller;

import br.com.houseservice.adapters.input.api.IApiHouseController;
import br.com.houseservice.adapters.input.api.request.RequestHouse;
import br.com.houseservice.adapters.input.api.response.ResponseHouse;
import br.com.houseservice.controller.domain.model.HouseModel;
import br.com.houseservice.controller.port.in.ICreateHouseUseCase;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@AllArgsConstructor
public class HouseController implements IApiHouseController {

    private final ICreateHouseUseCase iCreateHouseUseCase;
    private final ObjectMapper mapper;

    @Override
    public ResponseEntity<ResponseHouse> create(RequestHouse request) {
        var house = iCreateHouseUseCase.execute(mapper.convertValue(request, HouseModel.class));

        URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(house.getId())
                .toUri();

        return ResponseEntity.created(uri).body(mapper.convertValue(house, ResponseHouse.class));
    }
}
