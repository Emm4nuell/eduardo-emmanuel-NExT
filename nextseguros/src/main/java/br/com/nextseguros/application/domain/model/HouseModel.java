package br.com.nextseguros.application.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class HouseModel {
    private Long id;
    private String ownership_status;
    private String location;
    private String zipcode;
}
