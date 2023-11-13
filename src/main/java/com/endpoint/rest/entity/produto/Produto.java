package com.endpoint.rest.entity.produto;

import com.endpoint.rest.entity.pedido.Pedido;
import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.mapping.Set;

@Getter
@Setter
@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Double preco;
    private String descricao;


    //private Set<Pedido> pedidoSet;

}
