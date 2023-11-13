package com.endpoint.rest.controller.produto;

import com.endpoint.rest.entity.produto.Produto;
import com.endpoint.rest.service.produto.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/produto")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @PostMapping(value = "/save")
    public ResponseEntity <Produto> salvarProduto(@RequestBody Produto produto) throws Exception {
        produto = produtoService.save(produto);

        return ResponseEntity.ok().body(produto);
    }

    @GetMapping(value = "/{id}")
    public  ResponseEntity <Produto> buscarProduto (@PathVariable Long id){
        Produto produto = produtoService.findById(id);

        return ResponseEntity.ok().body(produto);
    }

    @GetMapping(value = "/buscar-todos")
    public  ResponseEntity <List<Produto>> buscarTodosProdutos (){
        List<Produto> produtos = produtoService.findAll();

        return ResponseEntity.ok().body(produtos);
    }
}
