package com.endpoint.rest.service.produto;

import com.endpoint.rest.entity.produto.Produto;
import com.endpoint.rest.exception.produto.ProductNullException;
import com.endpoint.rest.repository.produto.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public Produto save(Produto produto) throws Exception{
        if (produto.getNome() == null)
            throw new ProductNullException();
        if (produto.getPreco()< 0)
            throw new ProductNullException();
        return produtoRepository.save(produto);
    }

    public Produto findById(Long id){
        return produtoRepository.findById(id).orElse(null);
    }

    public List<Produto> findAll(){
        return produtoRepository.findAll();
    }
}
