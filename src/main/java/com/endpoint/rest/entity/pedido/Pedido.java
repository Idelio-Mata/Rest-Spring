package com.endpoint.rest.entity.pedido;

import com.endpoint.rest.entity.produto.Produto;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.time.LocalDateTime;
import java.util.Set;

@Getter
@Setter
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String endereco;
    private LocalDateTime dataPedido;
    private String status;

    //Lista de produtos
    @ManyToMany
    @Fetch(FetchMode.SELECT)
    private Set<Produto> produtos;
}
