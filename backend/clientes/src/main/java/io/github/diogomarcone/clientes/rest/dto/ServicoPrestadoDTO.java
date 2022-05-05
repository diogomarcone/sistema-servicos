package io.github.diogomarcone.clientes.rest.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Data
@NoArgsConstructor
public class ServicoPrestadoDTO {
    private String descricao;
    private String preco;
    private String data;
    private Integer idCliente;
}
