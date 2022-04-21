package io.github.diogomarcone.clientes.model.repository;

import io.github.diogomarcone.clientes.model.entity.Servico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicoRepository extends JpaRepository<Servico, Integer> {
}
