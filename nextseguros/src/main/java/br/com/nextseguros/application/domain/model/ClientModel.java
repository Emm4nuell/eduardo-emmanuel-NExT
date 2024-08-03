package br.com.nextseguros.application.domain.model;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ClientModel{
    private Long id;
    private String name;
    private String document;
    private String email;
    private int age;
    private int dependents;
    private List<String> houses;
    private float income;
    private String marital_status;
    private List<String> vehicles;
    private List<Long> id_house;
}
