package br.com.nextseguros.adapters.input.api.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RequestClient {
    private String name;
    private int age;
    private int dependents;
    private float income;
    private String marital_status;
}
