package br.com.houseservice.adapters.output.database.repository;

import br.com.houseservice.adapters.output.database.entity.HouseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HouseRepository extends JpaRepository<HouseEntity, Long> {
}
