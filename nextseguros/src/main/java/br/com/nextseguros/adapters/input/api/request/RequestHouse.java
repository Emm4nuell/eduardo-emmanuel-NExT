package br.com.nextseguros.adapters.input.api.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RequestHouse {
    private Long id;
    private String ownership_status;
    private String location;
    private String zipcode;
}
