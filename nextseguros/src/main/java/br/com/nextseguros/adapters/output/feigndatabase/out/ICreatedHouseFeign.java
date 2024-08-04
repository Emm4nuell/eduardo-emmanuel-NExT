package br.com.nextseguros.adapters.output.feigndatabase.out;

import br.com.nextseguros.adapters.input.api.request.RequestHouse;
import br.com.nextseguros.adapters.input.api.response.ResponseHouse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "house", url = "localhost:8082/house/")
public interface ICreatedHouseFeign {

    @PostMapping("create")
    ResponseEntity<ResponseHouse> create(@RequestBody RequestHouse house);
}
