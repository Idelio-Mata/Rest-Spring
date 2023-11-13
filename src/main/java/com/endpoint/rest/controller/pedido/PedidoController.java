package com.endpoint.rest.controller.pedido;

import com.endpoint.rest.entity.pedido.Pedido;
import com.endpoint.rest.service.pedido.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/pedido")
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    @PostMapping(value = "/save")
    public ResponseEntity<Pedido> salvarProduto(@RequestBody Pedido produto) {

        produto = pedidoService.save(produto);
        return ResponseEntity.ok().body(produto);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Pedido> buscarProduto(@PathVariable Long id) {

        Pedido pedido = pedidoService.findById(id);
        return ResponseEntity.ok().body(pedido);
    }

    @GetMapping(value = "/buscar-todos")
    public ResponseEntity<List<Pedido>> buscarTodosPedidos() {

        List<Pedido> pedido = pedidoService.findAll();
        return ResponseEntity.ok().body(pedido);
    }

}
