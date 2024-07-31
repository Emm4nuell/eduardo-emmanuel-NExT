package br.com.nextseguros.adapters.output.database.repository;

import br.com.nextseguros.adapters.output.database.entity.ClientEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<ClientEntity, Long> {
}
