package br.com.houseservice.adapters.output.database.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "house")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class HouseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String ownership_status;
    private String location;
    private String zipcode;
    private Long id_client;
}
