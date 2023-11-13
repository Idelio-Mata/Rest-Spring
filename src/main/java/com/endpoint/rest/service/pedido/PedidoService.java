package com.endpoint.rest.service.pedido;

import com.endpoint.rest.entity.pedido.Pedido;
import com.endpoint.rest.repository.pedido.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    public Pedido save(Pedido pedido){
        return pedidoRepository.save(pedido);

    }

    public Pedido findById(Long id){
        return pedidoRepository.findById(id).orElse(null);
    }

    public List<Pedido> findAll(){
        return pedidoRepository.findAll();
    }
}
