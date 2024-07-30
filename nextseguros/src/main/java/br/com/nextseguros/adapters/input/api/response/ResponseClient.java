package br.com.nextseguros.adapters.input.api.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ResponseClient {
    private String name;
    private int age;
    private int dependents;
    private List<String> houses;
    private float income;
    private String marital_status;
    private List<String> vehicles;
}
