package br.com.houseservice.adapters.input.api.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ResponseHouse {
    private Long id;
    private String ownership_status;
    private String location;
    private String zipcode;
    private Long id_client;
}
