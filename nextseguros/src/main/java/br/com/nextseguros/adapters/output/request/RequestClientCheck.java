package br.com.nextseguros.adapters.output.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RequestClientCheck implements Serializable {
    private String name;
    private String email;
}
