package br.com.houseservice.adapters.input.api.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RequestHouse {
    private String ownership_status;
    private String location;
    private String zipcode;
    private Long id_client;
}
