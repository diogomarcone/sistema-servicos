package io.github.diogomarcone.clientes.model.repository;

import io.github.diogomarcone.clientes.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
